package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.FicheSante;

public interface IFichesanteMetier {

	public FicheSante getFicheSanteById (int id );
	public List<FicheSante> listFicheSante ();
}

