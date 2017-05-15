package pfe.ilyes.mdsos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pfe.ilyes.mdsos.dto.Pompier;

public class PompierDAOImplement implements IPompierDAO {


	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertPompier(Pompier pompier) {
		entityManager.persist(pompier);

	}

	@Override
	public void updatePompier(Pompier pompier) {
		entityManager.merge(pompier);

	}

	@Override
	public void deletePompier(int id) {
		Pompier p= entityManager.find(Pompier.class, id);
		entityManager.remove(p);

	}

	@Override
	public List<Pompier> listPompierByCIN(String Cin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pompier getPompierById(int id) {
		return entityManager.find(Pompier.class, id);
	}

	@Override
	public List<Pompier> listPompier() {
		List<Pompier> pompiers = null;
		String req = "SELECT p FROM Pompier p ";
		Query result = entityManager.createQuery(req);
		pompiers = result.getResultList();
		return pompiers;
	}

}
