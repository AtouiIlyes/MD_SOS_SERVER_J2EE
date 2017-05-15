package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.Policier;

public interface IPolicierMetier {

	
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
