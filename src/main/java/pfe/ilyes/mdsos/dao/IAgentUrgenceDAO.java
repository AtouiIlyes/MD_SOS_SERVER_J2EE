package pfe.ilyes.mdsos.dao;

import java.util.List;

import pfe.ilyes.mdsos.dto.AgentUrgence;

public interface IAgentUrgenceDAO {

	/**
	 * Insertion d'un nouveau agent
	 * @param produit
	 */
	public void insertAgent (AgentUrgence agent);
	
	/**
	 * Mise a jour de Medecin
	 * @param produit
	 */
	public void updateAgent (AgentUrgence agent);
	public void deleteAgent (int idAgent);
	public List<AgentUrgence> listAgents();
	public AgentUrgence getAgentById (int idAgent );
	public AgentUrgence getAgentByLoginPassword(String login,String password);

	List<AgentUrgence> listAgent();
}
