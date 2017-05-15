package pfe.ilyes.mdsos.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pfe.ilyes.mdsos.dto.Policier;
import pfe.ilyes.mdsos.metier.IPolicierMetier;

@Controller
public class PolicierController {

	//affichage 
	private static final Logger logger = LoggerFactory.getLogger(PolicierController.class);
	
	@Autowired
	private IPolicierMetier policierMetier;
	
	
	 @RequestMapping(value="/insertPolicier")
		public String addPolicier (@ModelAttribute Policier policier ){
			   policierMetier.insertPolicier(policier);
			   if (policier.getId()!=0){
					 
					return "redirect:/listePpoliciers.html";
				}else{
					return "insertPolicier";
				}
		 }
	 
	 @RequestMapping(value="/listePpoliciers")
		public String affPoliciers( Model model){
			List<Policier> policiers = policierMetier.listPolicier();
			model.addAttribute("policiers", policiers);
			return "listePpoliciers";
			
		}
	 
	 @RequestMapping(value="/updatePolicier")
		public String updatePolicier (@ModelAttribute Policier policier){
			policierMetier.updatePolicier(policier);
			return "redirect:/listePpoliciers.html";
		}
		
		@RequestMapping(value = "/ModifierPolicier")  
		public String afficheFormulaire(Model model) { 
			model.addAttribute("policier", new Policier());
		return "ModifierPolicier";
	
		}
		
		@RequestMapping(value="/editPolicier")
		public String editPolicier (@RequestParam("id") int id, Model model){
			logger.info("Id : "+id);
			Policier policier = policierMetier.getPolicierById(id);
			logger.info("Policier : " + policier.getNom() + "" + policier.getCin());
			model.addAttribute("policier", policier);
			return "ModifierPolicier";
		}
		
		
		
		@RequestMapping(value="/deletePolicier")
		public String deletePolicier (@RequestParam("id") int id){
			policierMetier.deletePolicier(id);
			return "redirect:/listePpoliciers.html";
		}

}

