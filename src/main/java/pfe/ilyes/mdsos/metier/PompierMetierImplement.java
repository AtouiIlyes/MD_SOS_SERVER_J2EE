package pfe.ilyes.mdsos.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pfe.ilyes.mdsos.dao.PompierDAOImplement;
import pfe.ilyes.mdsos.dto.Pompier;

@Transactional
public class PompierMetierImplement implements IPompierMetier {

	private PompierDAOImplement daopompier;
	
	@Override
	public void insertPompier(Pompier pompier) {
		daopompier.insertPompier(pompier);

	}

	@Override
	public void updatePompier(Pompier pompier) {
		daopompier.updatePompier(pompier);
	}

	@Override
	public void deletePompier(int id) {
		daopompier.deletePompier(id);
	}

	public void setDaopompier(PompierDAOImplement daopompier) {
		this.daopompier = daopompier;
	}

	@Override
	public List<Pompier> listPompierByCIN(String Cin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pompier getPompierById(int id) {
		// TODO Auto-generated method stub
		return daopompier.getPompierById(id);
	}

	@Override
	public List<Pompier> listPompier() {
		
		return daopompier.listPompier();
	}

}
