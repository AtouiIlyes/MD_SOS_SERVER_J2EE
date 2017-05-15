package pfe.ilyes.mdsos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pfe.ilyes.mdsos.dto.FicheSante;

public class FichesanteDAOImplement implements IFichesanteDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public FicheSante getFicheSanteById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(FicheSante.class, id);
	}

	@Override
	public List<FicheSante> listFicheSante() {
		List<FicheSante> fichesantes = null;
		String req = "SELECT f FROM FicheSante f";
		Query result = entityManager.createQuery(req);
		fichesantes = result.getResultList();
		return fichesantes;
	}

}
