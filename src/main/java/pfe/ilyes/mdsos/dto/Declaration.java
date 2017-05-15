package pfe.ilyes.mdsos.dto;

import java.io.Serializable;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Declaration  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="email")
	String email;
	
	@Column(name="danger")
	String danger;
	
	@Column(name="agent")
	String agent;
	
	@Column(name="latitude")
	String latitude;
	
	@Column(name="longitude")
	String longitude;
	
	@Column(name="adresse")
	String adresse;
	
	@Column(name="created_at")
	Date created_at;
	
	@Column(name="updated_at")
	Date updated_at;
	
	@Column(name="nom_agent")
	String nom_agent;

	@Column(name="servi")
	String servi;

	public Declaration() {
		super();
		}

	public Declaration(String email, String danger, String agent, String latitude, String longitude, String adresse, Date created_at,Date updated_at, String nom_agent, String servi) {
		super();
		this.email = email;
		this.danger = danger;
		this.agent = agent;
		this.latitude= latitude;
		this.longitude= longitude;
		this.adresse = adresse;
		this.created_at = created_at;
		this.updated_at= updated_at;
	}
	
	
	public String getNom_agent() {
		return nom_agent;
	}

	public void setNom_agent(String nom_agent) {
		this.nom_agent = nom_agent;
	}

	public String getServi() {
		return servi;
	}

	public void setServi(String servi) {
		this.servi = servi;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDanger() {
		return danger;
	}

	public void setDanger(String danger) {
		this.danger = danger;
	}

	public String getAgent() {
		return agent;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setAgent(String agent) {
		this.agent = agent;
	}

	

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
}
