package pfe.ilyes.mdsos.dao;

import java.util.List;

import pfe.ilyes.mdsos.dto.Declaration;
public interface IDeclarationDAO {
	
	public Declaration getDeclarationById (int id );
	public List<Declaration> listDeclaration ();
	public void deleteDeclaration (int id);
}
