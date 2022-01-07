package com.aratech.demo.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import   com.aratech.demo.models.Service;

@Entity
@Table(name="depense")
public class Depense extends Auditable<String>{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="id")
	private long idDepense;
	
	@Column(name="montant")
	private double montant;
	
	private Date date;
	
	private String reference;
	
	@ManyToOne
	private Service service;

	public Depense() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depense(double montant, Date date, String reference, Service service) {
		super();
		this.montant = montant;
		this.date = date;
		this.reference = reference;
		this.service = service;
	}

	public long getIdDepense() {
		return idDepense;
	}

	public void setIdDepense(long idDepense) {
		this.idDepense = idDepense;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

}
