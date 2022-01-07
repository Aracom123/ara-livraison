package com.aratech.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "materiel_roulant")
public class MaterielRoulant {
	@Id
	@Column(name="id_materiel_roulant")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idMaterielRoulant;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="type")
	private String type;
	
	@Column(name="etat")
	private String etat;
	
	@Column(name="matricule")
	private String matricule;
	
	private String description;

	public MaterielRoulant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MaterielRoulant(long idMaterielRoulant, String libelle, String type, String etat, String description, String matricule) {
		super();
		this.idMaterielRoulant = idMaterielRoulant;
		this.libelle = libelle;
		this.type = type;
		this.etat = etat;
		this.description = description;
		this.matricule = matricule;
	}

	public long getIdMaterielRoulant() {
		return idMaterielRoulant;
	}

	public void setIdMaterielRoulant(long idMaterielRoulant) {
		this.idMaterielRoulant = idMaterielRoulant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

}
