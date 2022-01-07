/**
 * 
 */
package com.aratech.demo.models;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * @author Amadou Ali Ousseini
 *
 */

@Entity
@Table(name="compagnie_partenaire")
public class CompagniePartenaire extends Auditable<String>{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	protected long idCompagnie;
	
	@Column(name="libelle")
	protected String libelle;
	
	@Column(name="adresse")
	protected String adresse;
	
	@Column(name="numero", nullable=false, unique=true)
	protected String numero;
	
	@Column(name="email", nullable=false, unique=true, length=100)
	protected String email;
	
	@Column(name="rccm")
	private String rccm;
	
	@Column(name="ninia")
	private String ninia;
	
//	@JsonManagedReference(value="compagnies")
//	@OneToMany(mappedBy="compagniePartenaire")
//	private Collection<Livraison> livraison;

	/**
	 * 
	 */
	public CompagniePartenaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CompagniePartenaire(long idCompagnie, String libelle, String adresse, String numero, String email,
			String rccm, String ninia) {
		super();
		this.idCompagnie = idCompagnie;
		this.libelle = libelle;
		this.adresse = adresse;
		this.numero = numero;
		this.email = email;
		this.rccm = rccm;
		this.ninia = ninia;
//		this.livraison = livraison;
	}



	public long getIdCompagnie() {
		return idCompagnie;
	}

	public void setIdCompagnie(long idCompagnie) {
		this.idCompagnie = idCompagnie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
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

	public String getRccm() {
		return rccm;
	}

	public void setRccm(String rccm) {
		this.rccm = rccm;
	}

	public String getNinia() {
		return ninia;
	}

	public void setNinia(String ninia) {
		this.ninia = ninia;
	}

//	public Collection<Livraison> getLivraison() {
//		return livraison;
//	}
//
//	public void setLivraison(Collection<Livraison> livraison) {
//		this.livraison = livraison;
//	}

}
