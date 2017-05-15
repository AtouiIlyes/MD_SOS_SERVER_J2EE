package pfe.ilyes.mdsos.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pfe.ilyes.mdsos.dao.DeclarationDAOImplement;
import pfe.ilyes.mdsos.dto.Declaration;

@Transactional
public class DeclarationMetierImplement implements IDeclarationMetier {

	private DeclarationDAOImplement daodeclaration;
	
	@Override
	public Declaration getDeclarationById(int id) {
		
		return daodeclaration.getDeclarationById(id);
	}

	public void setDaodeclaration(DeclarationDAOImplement daodeclaration) {
		this.daodeclaration = daodeclaration;
	}

	@Override
	public List<Declaration> listDeclaration() {
		// TODO Auto-generated method stub
		return daodeclaration.listDeclaration();
	}

	@Override
	public void deleteDeclaration(int id) {
		daodeclaration.deleteDeclaration(id);
		
	}

}
