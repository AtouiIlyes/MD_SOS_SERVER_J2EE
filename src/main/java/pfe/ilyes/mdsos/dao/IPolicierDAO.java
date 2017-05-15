package pfe.ilyes.mdsos.dao;

import java.util.List;
import pfe.ilyes.mdsos.dto.Policier;

public interface IPolicierDAO {

	/**
	 * Insertion d'un nouveau policier
	 * @param policier
	 */
	public void insertPolicier (Policier policier);
	
	/**
	 * Mise a jour de Policier
	 * @param policier
	 */
	public void updatePolicier (Policier policier);
	public void deletePolicier (int id);
	public List<Policier> listPolicierByCIN (String Cin);
	public Policier getPolicierById (int id );
	public List<Policier> listPolicier ();
}
