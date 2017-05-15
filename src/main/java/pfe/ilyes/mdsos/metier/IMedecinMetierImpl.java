package pfe.ilyes.mdsos.metier;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import pfe.ilyes.mdsos.dao.MedecinDAOImplement;
import pfe.ilyes.mdsos.dto.Medecin;

//transactionnal utilisee pour les recherches {select}
@Transactional
public class IMedecinMetierImpl implements IMedecinMetier {

	private MedecinDAOImplement daoMedecin;
	
	
	@Override
	public void insertMedecin(Medecin medecin) {
		daoMedecin.insertMedecin(medecin);
		
	}

	public void setDaoMedecin(MedecinDAOImplement daoMedecin) {
		this.daoMedecin = daoMedecin;
	}

	@Override
	public void updateMedecin(Medecin medecin) {
		daoMedecin.updateMedecin(medecin);
		
	}

	@Override
	public void deleteMedecin(int id) {
		daoMedecin.deleteMedecin(id);
		
	}

	@Override
	public List<Medecin> listMedecin() {
		// TODO Auto-generated method stub
		return daoMedecin.listMedecin();
	}

	@Override
	public List<Medecin> listMedecinByCIN(String Cin) {
		// TODO Auto-generated method stub
		return daoMedecin.listMedecinByCIN(Cin);
	}

	@Override
	public Medecin getMedecinById(int id) {
		// TODO Auto-generated method stub
		return daoMedecin.getMedecinById(id);
	}

	

	

}
