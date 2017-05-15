package pfe.ilyes.mdsos.dao;

import java.util.List;

import pfe.ilyes.mdsos.dto.FicheSante;

public interface IFichesanteDAO {

	
	public FicheSante getFicheSanteById (int id );
	public List<FicheSante> listFicheSante ();
}
