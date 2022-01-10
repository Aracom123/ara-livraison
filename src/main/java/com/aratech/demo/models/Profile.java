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
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

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
@Table(	name = "profile", 
uniqueConstraints = 
@UniqueConstraint(columnNames={"libelle"}))
public class Profile extends Auditable<String>{
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfile;

    @Column(name="libelle")
    private String libelle;

    @ManyToMany
    @JoinTable(
        name = "profile_actions", 
        joinColumns = @JoinColumn(
          name = "profile_id", referencedColumnName = "idProfile"), 
        inverseJoinColumns = @JoinColumn(
          name = "action_id", referencedColumnName = "idAction"))
    private Collection<Action> actions;
    
	public Long getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(Long idProfile) {
		this.idProfile = idProfile;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collection<Action> getActions() {
		return actions;
	}

	public void setActions(Collection<Action> actions) {
		this.actions = actions;
	}

	@Override
	public String toString() {
		return "Profile [idProfile=" + idProfile + ", libelle=" + libelle + ", actions=" + actions
				+ "]";
	}  
    
}