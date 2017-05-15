package pfe.ilyes.mdsos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pfe.ilyes.mdsos.dto.Users;
import pfe.ilyes.mdsos.metier.IUtilisateurMetier;

@Controller
public class UtilisateurController {

	//affichage 
			private static final Logger logger = LoggerFactory.getLogger(PolicierController.class);
			
			@Autowired
			private IUtilisateurMetier utilisateurMetier;
			

			 @RequestMapping(value="/listeutilisateur")
				public String affUtilisateur( Model model){
					List<Users> utilisateurs = utilisateurMetier.listUtilisateurs();
					model.addAttribute("utilisateurs", utilisateurs);
					return "listeutilisateur";
					
				}
			 
			 @RequestMapping(value="/deleteUtilisateur")
				public String deleteUtilisateur (@RequestParam("uid") int uid){
					utilisateurMetier.deleteUtilisateur(uid);
					return "redirect:/listeutilisateur.html";
				}
			
}
