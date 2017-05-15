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

import pfe.ilyes.mdsos.dto.Pompier;
import pfe.ilyes.mdsos.metier.IPompierMetier;

@Controller
public class PompierController {
	
	//affichage 
		private static final Logger logger = LoggerFactory.getLogger(PolicierController.class);
		
		@Autowired
		private IPompierMetier pompierMetier;
		
		 @RequestMapping(value="/insertPompier")
			public String addPompier (@ModelAttribute Pompier pompier ){
				   pompierMetier.insertPompier(pompier);
				   if (pompier.getId()!=0){
						 
						return "redirect:/listePmpiers.html";
					}else{
						return "insertPompier";
					}
			 }
		 
		 @RequestMapping(value="/listePmpiers")
			public String affPompiers( Model model){
				List<Pompier> pompiers = pompierMetier.listPompier();
				model.addAttribute("pompiers", pompiers);
				return "listePmpiers";
				
			}
		 
		 
		 @RequestMapping(value="/updatePompier")
			public String updatePolicier (@ModelAttribute Pompier pompier){
				pompierMetier.updatePompier(pompier);
				return "redirect:/listePmpiers.html";
			}

		 @RequestMapping(value = "/ModifierPompier")  
			public String afficheFormulaire(Model model) { 
				model.addAttribute("pompier", new Pompier());
			return "ModifierPompier";
		
			}
		 
		 @RequestMapping(value="/editPompier")
			public String editPompier (@RequestParam("id") int id, Model model){
				logger.info("Id : "+id);
				Pompier pompier = pompierMetier.getPompierById(id);
				logger.info("Pompier : " + pompier.getNom() + "" + pompier.getCin());
				model.addAttribute("pompier", pompier);
				return "ModifierPompier";
			}
		 

			@RequestMapping(value="/deletePompier")
			public String deletePompier (@RequestParam("id") int id){
				pompierMetier.deletePompier(id);;
				return "redirect:/listePmpiers.html";
			}
}
