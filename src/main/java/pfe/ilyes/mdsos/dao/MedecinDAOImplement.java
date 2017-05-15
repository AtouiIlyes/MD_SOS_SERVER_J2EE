package pfe.ilyes.mdsos.dao;

import java.util.List;

import pfe.ilyes.mdsos.dto.Medecin;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class MedecinDAOImplement implements IMedecinDAO {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertMedecin(Medecin medecin) {
		entityManager.persist(medecin);

	}

	@Override
	public void updateMedecin(Medecin medecin) {
		entityManager.merge(medecin);

	}

	@Override
	public void deleteMedecin(int id) {
		Medecin m=entityManager.find(Medecin.class, id);
		entityManager.remove(m);

	}
@Override
	public List<Medecin> listMedecinByCIN(String Cin) {
		String req="select m from medecin m where m.cin like :x ";
		Query result=entityManager.createNamedQuery(req);
		result.setParameter("x", "%"+Cin+"%");
		return result.getResultList();
	}

	@Override
	public Medecin getMedecinById(int id) {
		return entityManager.find(Medecin.class, id);
	}

	@Override
	public List<Medecin> listMedecin() {
		List<Medecin> medecins = null;
		String req = "SELECT m FROM Medecin m";
		Query result = entityManager.createQuery(req);
		medecins = result.getResultList();
		return medecins;
	}

}
