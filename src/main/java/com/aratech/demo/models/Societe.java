/**
 * 
 */
package com.aratech.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Amadou Ali Ousseini
 *
 */
@Entity
@Table(name="societe")
public class Societe extends Auditable<String>{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	protected long id;
	
	@Column(name="raisonSociale")
	private String raisonSociale;
	
	@Column(name="numeroTelephone")
	private String numeroTelephone;
	
	@Column(name="adresseEmail")
	private String adresseEmail;
	
	@Column(name="rccm")
	private String RCCM;
	
	@Column(name="ninia")
	private String NINIA;
	
	@Column(name="logo")
	private String logo;

	/**
	 * 
	 */
	public Societe() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param raisonSociale
	 * @param numeroTelephone
	 * @param adresseEmail
	 * @param rCCM
	 * @param nINIA
	 * @param logo
	 */
	public Societe(long id, String raisonSociale, String numeroTelephone, String adresseEmail, String rCCM,
			String nINIA, String logo) {
		super();
		this.id = id;
		this.raisonSociale = raisonSociale;
		this.numeroTelephone = numeroTelephone;
		this.adresseEmail = adresseEmail;
		RCCM = rCCM;
		NINIA = nINIA;
		this.logo = logo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getNumeroTelephone() {
		return numeroTelephone;
	}

	public void setNumeroTelephone(String numeroTelephone) {
		this.numeroTelephone = numeroTelephone;
	}

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getRCCM() {
		return RCCM;
	}

	public void setRCCM(String rCCM) {
		RCCM = rCCM;
	}

	public String getNINIA() {
		return NINIA;
	}

	public void setNINIA(String nINIA) {
		NINIA = nINIA;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Societe [id=" + id + ", raisonSociale=" + raisonSociale + ", numeroTelephone=" + numeroTelephone
				+ ", adresseEmail=" + adresseEmail + ", RCCM=" + RCCM + ", NINIA=" + NINIA + ", logo=" + logo + "]";
	}
	
	
	

}
