package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.Users;

public interface IUtilisateurMetier {

	public void deleteUtilisateur (int uid);
	public List<Users> listUtilisateurs();
	public Users getUtilisateurById (int uid );
}
