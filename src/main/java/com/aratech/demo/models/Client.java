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
 * @author BAKO ADAMOU
 *
 */
@Entity
@Table(name="client")
public class Client extends Auditable<String>{
	
	@Id
	@Column(name = "id_client")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
	protected long idClient;
	
	@Column(name="nom")
	protected String nom;
	
	@Column(name="prenom")
	protected String prenom;
	
	@Column(name="numero", nullable=false, unique=true)
	protected long numero;
	
	@Column(name="email", length=50)
	protected String email;
	
	@Column(name="type")
	private String type;
	
	@Column(name="rccm")
	private String rccm;
	
	@Column(name="ninia")
	private String ninia;
	
//	@JsonManagedReference(value="livraisons")
//	@OneToMany(mappedBy = "client")
//	private Collection<Livraison> livraisons;
	

	/**
	 * 
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param numero
	 * @param email
	 * @param login
	 * @param password
	 * @param type
	 * @param rccm
	 * @param ninia
	 */
	public Client(long id, String nom, String prenom, long numero, String email,
			String type, String rccm, String ninia) {
		super();
		this.idClient = id;
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.email = email;
		this.type = type;
		this.rccm = rccm;
		this.ninia = ninia;
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



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public long getNumero() {
		return numero;
	}



	public void setNumero(long numero) {
		this.numero = numero;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
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



	public long getIdClient() {
		return idClient;
	}



	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}



//	public Collection<Livraison> getLivraisons() {
//		return livraisons;
//	}
//
//
//
//	public void setLivraisons(Collection<Livraison> livraisons) {
//		this.livraisons = livraisons;
//	}
	
	

}
