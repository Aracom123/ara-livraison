package com.aratech.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class Service extends Auditable<String>{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private long idService;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="description", length=255)
	private String description;

	public Service(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}

	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getIdService() {
		return idService;
	}

	public void setIdService(long idService) {
		this.idService = idService;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
