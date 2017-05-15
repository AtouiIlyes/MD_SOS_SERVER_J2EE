package pfe.ilyes.mdsos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pfe.ilyes.mdsos.dto.Users;

public class UtilisateurDAOImplement implements IUtilisateurDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void deleteUtilisateur(int id) {
		Users u=entityManager.find(Users.class, id);
		entityManager.remove(u);
	}

	@Override
	public List<Users> listUtilisateurs() {
		
		List<Users> utilisateurs = null;
		String req = "SELECT u FROM Users u ";
		Query result = entityManager.createQuery(req);
		utilisateurs = result.getResultList();
		return utilisateurs;
	}

	@Override
	public Users getUtilisateurById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(Users.class, id);
	}

}
