package pfe.ilyes.mdsos.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FicheSante implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	int id;
	
	@Column(name="email",unique=true)
	String email;
	
	@Column(name="sname")
	String sname;
	
	@Column(name="snassurance")
	String snassurance;

	@Column(name="sdonorgane")
	String sdonorgane;

	@Column(name="stypesang")
	String stypesang;

	@Column(name="stypeassurence")
	String stypeassurence;

	@Column(name="spathologie1")
	String spathologie1;

	@Column(name="spathologie2")
	String spathologie2;

	@Column(name="sallergie1")
	String sallergie1;

	@Column(name="sallergie2")
	String sallergie2;

	@Column(name="santfamil1")
	String santfamil1;

	@Column(name="santfamil2")
	String santfamil2;

	@Column(name="straitement")
	String straitement;

	@Column(name="smedecin")
	String smedecin;

	@Column(name="certification")
	String certification;
	


	public FicheSante() {
		super();
	}

	public FicheSante(String email, String sname, String snassurance,
			String sdonorgane, String stypesang, String stypeassurence,
			String spathologie1, String spathologie2, String sallergie1,
			String sallergie2, String santfamil1, String santfamil2,
			String straitement, String smedecin, String certification) {
		super();
		this.email = email;
		this.sname = sname;
		this.snassurance = snassurance;
		this.sdonorgane = sdonorgane;
		this.stypesang = stypesang;
		this.stypeassurence = stypeassurence;
		this.spathologie1 = spathologie1;
		this.spathologie2 = spathologie2;
		this.sallergie1 = sallergie1;
		this.sallergie2 = sallergie2;
		this.santfamil1 = santfamil1;
		this.santfamil2 = santfamil2;
		this.straitement = straitement;
		this.smedecin = smedecin;
		this.certification = certification;
	}



	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSnassurance() {
		return snassurance;
	}

	public void setSnassurance(String snassurance) {
		this.snassurance = snassurance;
	}

	public String getSdonorgane() {
		return sdonorgane;
	}

	public void setSdonorgane(String sdonorgane) {
		this.sdonorgane = sdonorgane;
	}

	public String getStypesang() {
		return stypesang;
	}

	public void setStypesang(String stypesang) {
		this.stypesang = stypesang;
	}

	public String getStypeassurence() {
		return stypeassurence;
	}

	public void setStypeassurence(String stypeassurence) {
		this.stypeassurence = stypeassurence;
	}

	public String getSpathologie1() {
		return spathologie1;
	}

	public void setSpathologie1(String spathologie1) {
		this.spathologie1 = spathologie1;
	}

	public String getSpathologie2() {
		return spathologie2;
	}

	public void setSpathologie2(String spathologie2) {
		this.spathologie2 = spathologie2;
	}

	public String getSallergie1() {
		return sallergie1;
	}

	public void setSallergie1(String sallergie1) {
		this.sallergie1 = sallergie1;
	}

	public String getSallergie2() {
		return sallergie2;
	}

	public void setSallergie2(String sallergie2) {
		this.sallergie2 = sallergie2;
	}

	public String getSantfamil1() {
		return santfamil1;
	}

	public void setSantfamil1(String santfamil1) {
		this.santfamil1 = santfamil1;
	}

	public String getSantfamil2() {
		return santfamil2;
	}

	public void setSantfamil2(String santfamil2) {
		this.santfamil2 = santfamil2;
	}

	public String getStraitement() {
		return straitement;
	}

	public void setStraitement(String straitement) {
		this.straitement = straitement;
	}

	public String getSmedecin() {
		return smedecin;
	}

	public void setSmedecin(String smedecin) {
		this.smedecin = smedecin;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}


	
}
