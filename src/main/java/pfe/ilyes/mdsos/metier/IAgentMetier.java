package pfe.ilyes.mdsos.metier;

import java.util.List;

import pfe.ilyes.mdsos.dto.AgentUrgence;


public interface IAgentMetier  {
	
public void insertAgent (AgentUrgence agent);
	
	/**
	 * Mise a jour de Medecin
	 * @param produit
	 */
	public void updateAgent (AgentUrgence agent);
	public void deleteAgent (int idAgent);
	public List<AgentUrgence> listAgents();
	public AgentUrgence getAgentById (int idAgent );
	public AgentUrgence getAgentByLoginPassword (String login, String password);

}
