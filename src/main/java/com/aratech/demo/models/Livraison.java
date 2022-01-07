package com.aratech.demo.models;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="livraison")
public class Livraison extends Auditable<String>{
	@Id
	@Column(name="id_livraison")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	protected long idLivraison;
	
	@Basic
	@Column(name="date_livraison")
	private Date dateLivraison;
	
	@Column(name="frais_livraison")
	private long fraisLivraison;
	
	@Column(name="adresse_livraison")
	private String adresseLivraison;
	
//	@JsonBackReference(value="livraisons")
	@ManyToOne
	private Client client;
	
	@ManyToOne
	private Livreur livreur;
	
	@JsonManagedReference(value="colis")
	@OneToMany(mappedBy = "livraison", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Collection<Coli> colis;
	
//	@JsonBackReference(value="compagnies")
	@ManyToOne
	private CompagniePartenaire compagniePartenaire;

	public Livraison() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livraison(Date dateLivraison, long fraisLivraison, String adresseLivraison, Client client, Livreur livreur,
			Collection<Coli> colis, CompagniePartenaire compagniePartenaire) {
		super();
		this.dateLivraison = dateLivraison;
		this.fraisLivraison = fraisLivraison;
		this.adresseLivraison = adresseLivraison;
		this.client = client;
		this.livreur = livreur;
		this.colis = colis;
		this.compagniePartenaire = compagniePartenaire;
	}

	public long getIdLivraison() {
		return idLivraison;
	}

	public void setIdLivraison(long idLivraison) {
		this.idLivraison = idLivraison;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public long getFraisLivraison() {
		return fraisLivraison;
	}

	public void setFraisLivraison(long fraisLivraison) {
		this.fraisLivraison = fraisLivraison;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Livreur getLivreur() {
		return livreur;
	}

	public void setLivreur(Livreur livreur) {
		this.livreur = livreur;
	}

	public Collection<Coli> getColis() {
		return colis;
	}

	public void setColis(Collection<Coli> colis) {
		this.colis = colis;
	}

	public CompagniePartenaire getCompagniePartenaire() {
		return compagniePartenaire;
	}

	public void setCompagniePartenaire(CompagniePartenaire compagniePartenaire) {
		this.compagniePartenaire = compagniePartenaire;
	}

	public String getAdresseLivraison() {
		return adresseLivraison;
	}

	public void setAdresseLivraison(String adresseLivraison) {
		this.adresseLivraison = adresseLivraison;
	}
	
	
	
}
