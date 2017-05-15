package pfe.ilyes.mdsos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pfe.ilyes.mdsos.dto.Declaration;

public class DeclarationDAOImplement implements IDeclarationDAO {


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Declaration getDeclarationById(int id) {
		
		return entityManager.find(Declaration.class, id);
	}

	@Override
	public List<Declaration> listDeclaration() {
		
		List<Declaration> declarations = null;
		String req = "SELECT d FROM Declaration d";
		Query result = entityManager.createQuery(req);
		declarations = result.getResultList();
		return declarations;
	}

	@Override
	public void deleteDeclaration(int id) {
		Declaration d =entityManager.find(Declaration.class, id);
		entityManager.remove(d);
		
	}

}
