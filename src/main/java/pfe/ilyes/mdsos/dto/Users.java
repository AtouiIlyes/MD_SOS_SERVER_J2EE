package pfe.ilyes.mdsos.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Users implements Serializable{


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="uid")
	int uid; 
	
	@Column(name="unique_id",unique=true,length=23)
	int unique_id;
	
	@Column(name="name")
	String name;
	
	@Column(name="email",unique=true)
	String email;
	
	@Column(name="type")
	String type;
	
	@Column(name="encrypted_password")
	String encrypted_password;
	
	@Column(name="salt")
	String salt;
	
	@Column(name="created_at")
	Date created_at;
	
	@Column(name="updated_at")
	Date updated_at;
	
	

	



	public Users() {
		super();
	}

	

	public Users(int unique_id, String name, String email, String type,
			String encrypted_password, String salt, Date created_at,
			Date updated_at) {
		super();
		this.unique_id = unique_id;
		this.name = name;
		this.email = email;
		this.type = type;
		this.encrypted_password = encrypted_password;
		this.salt = salt;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public int getUnique_id() {
		return unique_id;
	}



	public void setUnique_id(int unique_id) {
		this.unique_id = unique_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEncrypted_password() {
		return encrypted_password;
	}



	public void setEncrypted_password(String encrypted_password) {
		this.encrypted_password = encrypted_password;
	}



	public String getSalt() {
		return salt;
	}



	public void setSalt(String salt) {
		this.salt = salt;
	}



	public Date getCreated_at() {
		return created_at;
	}



	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}



	public Date getUpdated_at() {
		return updated_at;
	}



	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}



	public int getUid() {
		return uid;
	}




	
	
}
