package pfe.ilyes.mdsos.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pfe.ilyes.mdsos.dao.PolicierDAOImplement;
import pfe.ilyes.mdsos.dto.Policier;

@Transactional
public class PolicierMetierImplement implements IPolicierMetier {

	private PolicierDAOImplement daopolicier;
	
	@Override
	public void insertPolicier(Policier policier) {
		daopolicier.insertPolicier(policier);

	}

	
	public void setDaopolicier(PolicierDAOImplement daopolicier) {
		this.daopolicier = daopolicier;
	}


	@Override
	public void updatePolicier(Policier policier) {
		daopolicier.updatePolicier(policier);

	}

	@Override
	public void deletePolicier(int id) {
		 daopolicier.deletePolicier(id);

	}

	@Override
	public List<Policier> listPolicierByCIN(String Cin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policier getPolicierById(int id) {
		
		return daopolicier.getPolicierById(id);
	}

	@Override
	public List<Policier> listPolicier() {
	
		return daopolicier.listPolicier();
	}

}
