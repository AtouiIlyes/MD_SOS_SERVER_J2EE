package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.Pompier;

public interface IPompierMetier {
	
	/**
	 * Insertion d'un nouveau pompier
	 * @param pompier
	 */
	public void insertPompier (Pompier pompier);
	
	/**
	 * Mise a jour de pompier
	 * @param pompier
	 */
	public void updatePompier (Pompier pompier);
	public void deletePompier (int id);
	public List<Pompier> listPompierByCIN (String Cin);
	public Pompier getPompierById (int id );
	public List<Pompier> listPompier ();

}
