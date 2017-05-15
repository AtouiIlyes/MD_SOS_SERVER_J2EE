package pfe.ilyes.mdsos.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pfe.ilyes.mdsos.dto.FicheSante;

import pfe.ilyes.mdsos.metier.IFichesanteMetier;

@Controller
public class FichesanteController {

			private static final Logger logger = LoggerFactory.getLogger(PolicierController.class);
			
			@Autowired
			private IFichesanteMetier fichesanteMetier;
			
			
			@RequestMapping(value="/listeFichesante")
			public String affFicheSante( Model model){
				List<FicheSante> fichesantes = fichesanteMetier.listFicheSante();
				model.addAttribute("fichesantes", fichesantes);
				return "listeFichesante";
				
			}
}
