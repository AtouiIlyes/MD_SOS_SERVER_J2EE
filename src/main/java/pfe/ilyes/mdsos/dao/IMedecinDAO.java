package pfe.ilyes.mdsos.dao;

import java.util.List;


import pfe.ilyes.mdsos.dto.Medecin;


public interface IMedecinDAO {
	
	/**
	 * Insertion d'un nouveau medecin
	 * @param produit
	 */
	public void insertMedecin (Medecin medecin);
	
	/**
	 * Mise a jour de Medecin
	 * @param produit
	 */
	public void updateMedecin (Medecin medecin);
	public void deleteMedecin (int id);
	public List<Medecin> listMedecinByCIN (String Cin);
	public Medecin getMedecinById (int id );
	public List<Medecin> listMedecin ();

}
