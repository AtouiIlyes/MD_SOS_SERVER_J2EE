package pfe.ilyes.mdsos.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import pfe.ilyes.mdsos.dto.AgentUrgence;
import pfe.ilyes.mdsos.metier.IAgentMetier;



/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//affichage 
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@Autowired
	private IAgentMetier agentMetier; 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 * @return 
	 */
	
	@RequestMapping(value ="/index")
	public String home() {
	
			return "index";
		
	  }
	
	
	
	@RequestMapping(value="/login")
	public String login (@ModelAttribute AgentUrgence agent, Model model, HttpSession session){
		AgentUrgence agentU = agentMetier.getAgentByLoginPassword(agent.getEmail_agent(), agent.getPassword_agent());
		if (agentU!=null){
			session.setAttribute("agentU",agentU);
			return "redirect:/index.html";
		}else {
			return "redirect:/affLogin.html";
		}
	  }
	
	
	@RequestMapping(value="/affLogin")
	public String affLogin (@ModelAttribute AgentUrgence agent){
		return "login";
	     }
	
	@RequestMapping(value="/logout")
	public String logOut(HttpSession session){
		
		return "redirect:/affLogin.html";
	}



}
