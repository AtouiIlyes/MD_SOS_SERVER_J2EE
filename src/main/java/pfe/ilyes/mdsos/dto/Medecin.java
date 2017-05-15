package pfe.ilyes.mdsos.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



	@Entity
	public class Medecin implements Serializable{
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="id")
		int id;
		
		@Column(name="nom")
		String nom;
		
		@Column(name="password")
		String password;
		
		@Column(name="cin")
		String cin;
		
		
		@Column(name="specialite")
		String specialite;
		
		

		public Medecin() {
			super();
		}

		public Medecin(String nom, String password,String cin , String specialite) {
			super();
			this.nom = nom;
			this.password = password;
			this.cin = cin;
			this.specialite = specialite;
			
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		
		public String getSpecialite() {
			return specialite;
		}

		public int getId() {
			return id;
		}

		public void setSpecialite(String specialite) {
			this.specialite = specialite;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCin() {
			return cin;
		}

		public void setCin(String cin) {
			this.cin = cin;
		}

		

}
