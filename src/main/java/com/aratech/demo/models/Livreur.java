package com.aratech.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Amadou Ali Ousseini
 *
 */
@Entity
@Table(name = "livreur")
public class Livreur extends Auditable<String>{
	@Id
	@Column(name="id_livreur")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	protected long idLivreur;
	
	@Column(name="nom")
	protected String nom;
	
	@Column(name="prenom")
	protected String prenom;
	
	@Column(name="numero", nullable=false, unique=true)
	protected String numero;
	
	@Column(name="email", length=50)
	protected String email;
	
	@Column(name="adresse", length=255)
	protected String adresse;
	
//	@Column(name="login", nullable=false, unique=true, length=45)
//	protected String login;
	
//	@Column(name="password",nullable=false,  length=255)
//	protected String motdepasse;
	

	@Column(name="statut")
	private boolean statut;
	
	private String profileImageUrl;
	
	private String[] authorities;
	
	private Date lastLoginDate;
	
	private Date lastLoginDateDisplay;
	
	
	private Date joinDate;
	
	
//	private boolean isNotLocked;
	
	@ManyToOne
	private MaterielRoulant materielRoulant;

	public Livreur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livreur(String nom, String prenom, String numero, MaterielRoulant materielRoulant) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.email = email;
//		this.login = login;
//		this.motdepasse = motdepasse;
		this.materielRoulant = materielRoulant;
	}


	public long getId() {
		return idLivreur;
	}


	public void setId(long id) {
		this.idLivreur = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


//	public String getLogin() {
//		return login;
//	}
//
//
//	public void setLogin(String login) {
//		this.login = login;
//	}


//	public String getMotdepasse() {
//		return motdepasse;
//	}
//
//
//	public void setMotdepasse(String motdepasse) {
//		this.motdepasse = motdepasse;
//	}


	public boolean isStatut() {
		return statut;
	}


	public void setStatut(boolean statut) {
		this.statut = statut;
	}


	public String getProfileImageUrl() {
		return profileImageUrl;
	}


	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}


	public String[] getAuthorities() {
		return authorities;
	}


	public void setAuthorities(String[] authorities) {
		this.authorities = authorities;
	}


	public Date getLastLoginDate() {
		return lastLoginDate;
	}


	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}


	public Date getLastLoginDateDisplay() {
		return lastLoginDateDisplay;
	}


	public void setLastLoginDateDisplay(Date lastLoginDateDisplay) {
		this.lastLoginDateDisplay = lastLoginDateDisplay;
	}


	public Date getJoinDate() {
		return joinDate;
	}


	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public long getIdLivreur() {
		return idLivreur;
	}

	public void setIdLivreur(long idLivreur) {
		this.idLivreur = idLivreur;
	}

	public MaterielRoulant getMaterielRoulant() {
		return materielRoulant;
	}

	public void setMaterielRoulant(MaterielRoulant materielRoulant) {
		this.materielRoulant = materielRoulant;
	}

	@Override
	public String toString() {
		return "Livreur [id=" + idLivreur + ", nom=" + nom + ", prenom=" + prenom + ", numero=" + numero + ", email=" + email
				+ ", login=" + ", statut=" + statut + "]";
	}
	
	
}