/**
 * 
 */
package com.aratech.demo.models;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;

/**
 * @author BAKO ADAMOU
 *
 */
//@Data @NoArgsConstructor @AllArgsConstructor
//@Getter @Setter

@Entity
public class GroupeAction extends Auditable<String>{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idGroup;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="icone")
	private String icone;
	
	@Column(name="ordre_affichage")
	private int ordreAffichage;
	

	@OneToMany(mappedBy="groupeAction", cascade = CascadeType.REMOVE, orphanRemoval = true)
	private Collection<Action> actions;

	public long getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(long idGroup) {
		this.idGroup = idGroup;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "GroupeAction [idGroup=" + idGroup + ", libelle=" + libelle + "]";
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public Collection<Action> getActions() {
		return actions;
	}

	public void setActions(Collection<Action> actions) {
		this.actions = actions;
	}

	public int getOrdreAffichage() {
		return ordreAffichage;
	}

	public void setOrdreAffichage(int ordreAffichage) {
		this.ordreAffichage = ordreAffichage;
	}
	
	

//	public Collection<Action> getActions() {
//		return actions;
//	}
//
//	public void setActions(Collection<Action> actions) {
//		this.actions = actions;
//	}
	
	

}
