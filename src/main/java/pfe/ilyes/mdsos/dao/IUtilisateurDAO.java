package pfe.ilyes.mdsos.dao;

import java.util.List;

import pfe.ilyes.mdsos.dto.Users;

public interface IUtilisateurDAO {

	public void deleteUtilisateur (int uid);
	public List<Users> listUtilisateurs();
	public Users getUtilisateurById (int uid );
}
