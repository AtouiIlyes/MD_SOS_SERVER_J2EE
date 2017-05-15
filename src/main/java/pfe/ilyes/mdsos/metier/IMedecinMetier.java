package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.Medecin;


public interface IMedecinMetier {
	public void insertMedecin (Medecin medecin);
	public void updateMedecin (Medecin medecin);
	public void deleteMedecin (int id);
	public List<Medecin> listMedecinByCIN (String Cin);
	public Medecin getMedecinById (int id);
	public List<Medecin> listMedecin ();

}
