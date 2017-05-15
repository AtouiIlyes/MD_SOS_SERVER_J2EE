package pfe.ilyes.mdsos.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pfe.ilyes.mdsos.dao.AgentDAOImplement;
import pfe.ilyes.mdsos.dto.AgentUrgence;


//transactionnal utilisee pour les recherches {select}
@Transactional
public class IAgentMetierImpl implements IAgentMetier {

	private AgentDAOImplement dao;
	@Override
	public void insertAgent(AgentUrgence agent) {
		// TODO Auto-generated method stub
		dao.insertAgent(agent);

	}
	public void  setDao(AgentDAOImplement dao) {
		this.dao = dao;
	}

	@Override
	public void updateAgent(AgentUrgence agent) {
		// TODO Auto-generated method stub
		dao.updateAgent(agent);

	}

	@Override
	public void deleteAgent(int idAgent) {
		// TODO Auto-generated method stub
		dao.deleteAgent(idAgent);

	}

	@Override
	public AgentUrgence getAgentById(int idAgent) {
		// TODO Auto-generated method stub
		return dao.getAgentById(idAgent);
	}
	
	@Override
	public  AgentUrgence getAgentByLoginPassword(String login,String password) {
		return dao.getAgentByLoginPassword(login, password);
	}
	@Override
	public List<AgentUrgence> listAgents() {
		return dao.listAgents();
	}

}
