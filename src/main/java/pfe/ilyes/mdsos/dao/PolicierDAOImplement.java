package pfe.ilyes.mdsos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pfe.ilyes.mdsos.dto.Policier;

public class PolicierDAOImplement implements IPolicierDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertPolicier(Policier policier) {
		entityManager.persist(policier);

	}

	@Override
	public void updatePolicier(Policier policier) {
		entityManager.merge(policier);

	}

	@Override
	public void deletePolicier(int id) {
		Policier p=entityManager.find(Policier.class, id);
		entityManager.remove(p);

	}

	@Override
	public List<Policier> listPolicierByCIN(String Cin) {
		
		return null;
	}

	@Override
	public Policier getPolicierById(int id) {
		
		 return entityManager.find(Policier.class, id);
	}

	@Override
	public List<Policier> listPolicier() {
		List<Policier> policiers = null;
		String req = "SELECT p FROM Policier p";
		Query result = entityManager.createQuery(req);
		policiers = result.getResultList();
		return policiers;
	}

}
