package pfe.ilyes.mdsos.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pfe.ilyes.mdsos.dto.AgentUrgence;






public class AgentDAOImplement implements IAgentUrgenceDAO {
	
	// les annotations "@" sont utilsees par le JPA avec l'hibernate
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertAgent(AgentUrgence agent) {
		entityManager.persist(agent);

	}

	@Override
	public void updateAgent(AgentUrgence agent) {
		entityManager.merge(agent);

	}

	@Override
	public void deleteAgent(int idAgent) {
		AgentUrgence a = entityManager.find(AgentUrgence.class, idAgent);
		entityManager.remove(a);

	}

	@Override
	public AgentUrgence getAgentById(int idAgent) {
		// TODO Auto-generated method stub
		return entityManager.find(AgentUrgence.class, idAgent);
	}
	
	@Override
	public List<AgentUrgence> listAgent() {
		List<AgentUrgence> agents = null;
		String req = "SELECT a FROM AgentUrgence a";
		Query result = entityManager.createQuery(req);
		agents = result.getResultList();
		return agents;
	}

	@Override
	public AgentUrgence getAgentByLoginPassword(String login,String password) {
		AgentUrgence agent = null;  // initialisation 
		String req = "SELECT u FROM AgentUrgence u"                  // hSql !!==  sql hibernate 
				+ " WHERE u.email_agent=:x"                 // on utilise le nom de classe dans le req ! 
				+ " AND u.password_agent=:y";                 // :x et :y sont des parametre inconue !! 
		Query result = entityManager.createQuery(req);     // on choisi le query mta3 jpa cad persistence 
		result.setParameter("x", login);
		result.setParameter("y", password);
		if (!result.getResultList().isEmpty()){
			agent = (AgentUrgence)result.getSingleResult();
		}
		return agent;
	}

	@Override
	public List<AgentUrgence> listAgents() {
		List<AgentUrgence> agent = null;
		String req = "SELECT a FROM agent a";
		Query result = entityManager.createQuery(req);
		agent = result.getResultList();
		return agent;
	}
}
