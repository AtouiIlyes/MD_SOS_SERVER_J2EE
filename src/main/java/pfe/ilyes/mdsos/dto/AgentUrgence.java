package pfe.ilyes.mdsos.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AgentUrgence implements Serializable{
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_agent")
	int idAgent;
	
	@Column(name="email_agent")
	String email_agent;
	
	@Column(name="password_agent")
	String password_agent;

	public AgentUrgence() {
		super();
	}

	public AgentUrgence(String email_agent, String password_agent) {
		super();
		this.email_agent = email_agent;
		this.password_agent = password_agent;
	}

	public String getEmail_agent() {
		return email_agent;
	}

	public void setEmail_agent(String email_agent) {
		this.email_agent = email_agent;
	}

	public String getPassword_agent() {
		return password_agent;
	}

	public void setPassword_agent(String password_agent) {
		this.password_agent = password_agent;
	}
	
	

}
