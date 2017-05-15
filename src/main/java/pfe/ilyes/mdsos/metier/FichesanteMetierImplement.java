package pfe.ilyes.mdsos.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pfe.ilyes.mdsos.dao.FichesanteDAOImplement;
import pfe.ilyes.mdsos.dto.FicheSante;

@Transactional
public class FichesanteMetierImplement implements IFichesanteMetier {

	private FichesanteDAOImplement daofichesante;
	
	@Override
	public FicheSante getFicheSanteById(int id) {
		// TODO Auto-generated method stub
		return daofichesante.getFicheSanteById(id);
	}

	@Override
	public List<FicheSante> listFicheSante() {
		// TODO Auto-generated method stub
		return daofichesante.listFicheSante();
	}

	public void setDaofichesante(FichesanteDAOImplement daofichesante) {
		this.daofichesante = daofichesante;
	}
	

}
