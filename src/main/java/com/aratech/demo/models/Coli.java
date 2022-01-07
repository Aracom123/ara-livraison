/**
 * 
 */
package com.aratech.demo.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


/**
 * @author Amadou Ali Ousseini
 *
 */

@Entity
@Table(name="colis")
public class Coli extends Auditable<String>{
	@Id
	@Column(name="id_colis")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idColis;
	
	@Column(name="code_colis")
	private String codeColis;
	
	@Column(name="nature")
	private String nature;
	
	@Column(name="valeur_colis")
	private double valeurColis;
	
	@Column(name="quantite_colis")
	private int quantite;
	
	@Column(name="description")
	private String description;
	
	@JsonBackReference(value="colis")
	@ManyToOne
	private Livraison livraison;
	
	
	/**
	 * 
	 */
	public Coli() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coli(long idColis, String codeColis, String nature, double valeurColis, int quantite, String description, Livraison livraison) {
		super();
		this.idColis = idColis;
		this.codeColis = codeColis;
		this.nature = nature;
		this.valeurColis = valeurColis;
		this.quantite = quantite;
		this.description = description;
		this.livraison = livraison;
	}


	public long getIdColis() {
		return idColis;
	}


	public void setIdColis(long idColis) {
		this.idColis = idColis;
	}

	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}


	public String getCodeColis() {
		return codeColis;
	}




	public void setCodeColis(String codeColis) {
		this.codeColis = codeColis;
	}




	public String getNature() {
		return nature;
	}




	public void setNature(String nature) {
		this.nature = nature;
	}




	public double getValeurColis() {
		return valeurColis;
	}




	public void setValeurColis(double valeurColis) {
		this.valeurColis = valeurColis;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}


	public Livraison getLivraison() {
		return livraison;
	}


	public void setLivraison(Livraison livraison) {
		this.livraison = livraison;
	}
	
}
