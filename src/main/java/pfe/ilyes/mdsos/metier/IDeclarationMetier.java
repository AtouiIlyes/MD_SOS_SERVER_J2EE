package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.Declaration;

public interface IDeclarationMetier {
	
	public Declaration getDeclarationById (int id );
	public List<Declaration> listDeclaration ();
	public void deleteDeclaration (int id);

}
