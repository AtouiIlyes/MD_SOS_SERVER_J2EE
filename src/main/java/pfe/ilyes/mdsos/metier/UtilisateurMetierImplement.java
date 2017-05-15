package pfe.ilyes.mdsos.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pfe.ilyes.mdsos.dao.UtilisateurDAOImplement;
import pfe.ilyes.mdsos.dto.Users;

@Transactional
public class UtilisateurMetierImplement implements IUtilisateurMetier {

	UtilisateurDAOImplement daoutilisateur;
	
	@Override
	public void deleteUtilisateur(int uid) {
		daoutilisateur.deleteUtilisateur(uid);
	}
	
	public void setDaoutilisateur(UtilisateurDAOImplement daoutilisateur) {
		this.daoutilisateur = daoutilisateur;
	}

	@Override
	public List<Users> listUtilisateurs() {
		// TODO Auto-generated method stub
		return daoutilisateur.listUtilisateurs();
	}

	@Override
	public Users getUtilisateurById(int uid) {
		// TODO Auto-generated method stub
		return daoutilisateur.getUtilisateurById(uid);
	}

}
