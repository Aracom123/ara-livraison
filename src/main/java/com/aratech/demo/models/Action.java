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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
@Data @NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@Table(name="action")
public class Action extends Auditable<String>{

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAction;
	
	@Column(name="url")
	private String url;
	
	@Column(name="libelle")
	private String libelle;
	
	@Column(name="icone")
	private String icone;
	

	@ManyToOne
	private GroupeAction groupeAction;
	
	
	public Action(String url, String libelle, String icone, GroupeAction groupeAction) {
		super();
		this.url = url;
		this.libelle = libelle;
		this.icone = icone;
		this.groupeAction = groupeAction;
	}


	public long getIdAction() {
		return idAction;
	}

	public void setIdAction(long idAction) {
		this.idAction = idAction;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getIcone() {
		return icone;
	}

	public void setIcone(String icone) {
		this.icone = icone;
	}

	public GroupeAction getGroupe() {
		return groupeAction;
	}

	public void setGroupe(GroupeAction groupeAction) {
		this.groupeAction = groupeAction;
	}

	@Override
	public String toString() {
		return "Action [idAction=" + idAction + ", url=" + url + ", libelle=" + libelle + ", icone=" + icone + "]";
	}
	
}
