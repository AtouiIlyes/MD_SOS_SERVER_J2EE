package pfe.ilyes.mdsos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pfe.ilyes.mdsos.dto.Declaration;
import pfe.ilyes.mdsos.metier.IDeclarationMetier;

@Controller
public class DeclarationController {
	
	//affichage 
		private static final Logger logger = LoggerFactory.getLogger(PolicierController.class);
		
		@Autowired
		private IDeclarationMetier declarationMetier;
		
		 @RequestMapping(value="/listeSOS")
			public String affDeclarations( Model model){
				List<Declaration> declarations = declarationMetier.listDeclaration();
				model.addAttribute("declarations", declarations);
				return "listeSOS";
				
			}
		 
		 @RequestMapping(value="/deleteDeclaration")
			public String deleteDeclaration (@RequestParam("id") int id){
				declarationMetier.deleteDeclaration(id);
				return "redirect:/listeSOS.html";
			}

}
