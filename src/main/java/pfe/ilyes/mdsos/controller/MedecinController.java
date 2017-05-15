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

import pfe.ilyes.mdsos.dto.Medecin;
import pfe.ilyes.mdsos.metier.IMedecinMetier;

@Controller
public class MedecinController {

	//affichage 
		private static final Logger logger = LoggerFactory.getLogger(MedecinController.class);
		
		@Autowired
		private IMedecinMetier medecinMetier;
		
		
		
		 @RequestMapping(value="/insertMedecin")
		public String addMedecin (@ModelAttribute Medecin medecin ){
			   medecinMetier.insertMedecin(medecin);
			   if (medecin.getId()!=0){
					 
					return "redirect:/listeMedecins.html";
				}else{
					return "insertMedecin";
				}
		 }
		
		@RequestMapping(value="/listeMedecins")
		public String affMedecins( Model model){
			List<Medecin> medecins = medecinMetier.listMedecin();
			model.addAttribute("medecins", medecins);
			return "listeMedecins";
			
		}
		
		@RequestMapping(value="/updateMedecin")
		public String updateMedecin (@ModelAttribute Medecin medecin){
			medecinMetier.updateMedecin(medecin);
			return "redirect:/listeMedecins.html";
		}
		
		@RequestMapping(value = "/ModifierMedecin")  
		public String afficheFormulaire(Model model) { 
			model.addAttribute("medecin", new Medecin());
		return "ModifierMedecin";
	
		}
		
		@RequestMapping(value="/editMedecin")
		public String editMedecin (@RequestParam("id") int id, Model model){
			logger.info("Id : "+id);
			Medecin medecin = medecinMetier.getMedecinById(id);
			logger.info("Medecin : " + medecin.getNom() + "" + medecin.getCin());
			model.addAttribute("medecin", medecin);
			return "ModifierMedecin";
		}
		
		
		
		@RequestMapping(value="/deleteMedecin")
		public String deleteMedecin (@RequestParam("id") int id){
			medecinMetier.deleteMedecin(id);
			return "redirect:/listeMedecins.html";
		}

}
