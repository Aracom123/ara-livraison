//package com.aratech.demo.models;
//
//import java.util.List;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;
//
///**
// * @author Amadou Ali Ousseini
// *
// */
//@Entity
//@Table(name="facture")
//public class Facture extends Auditable<String>{
//	
//	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private long idFacture;
//	
//	
//	@Column(name="montant_due")
//	private double montant_due;
//	
//	@Column(name="montant_encaisse")
//	private double montant_encaisse;
//	
//	@Column(name="reste_a_payer")
//	private double reste_a_payer;
//	
//	@Column(name="somme_recu")
//	private double somme_recu;
//	
//	
//	@Column(name="monaie")
//	private double monaie;
//	
//	@Column(name="reduction")
//	private double reduction;
//	
//	@ManyToOne
//	private Vente vente;
//	
//	
//	@OneToMany(mappedBy="facture")
//	private List<Reglement> reglements;
//
//
//	/**
//	 * 
//	 */
//	public Facture() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	
//
//
//	/**
//	 * @param idFacture
//	 * @param montant_due
//	 * @param montant_encaisse
//	 * @param reste_a_payer
//	 * @param somme_recu
//	 * @param monaie
//	 * @param reduction
//	 * @param vente
//	 * @param reglements
//	 */
//	public Facture(long idFacture, double montant_due, double montant_encaisse, double reste_a_payer, double somme_recu,
//			double monaie, double reduction, Vente vente, List<Reglement> reglements) {
//		super();
//		this.idFacture = idFacture;
//		this.montant_due = montant_due;
//		this.montant_encaisse = montant_encaisse;
//		this.reste_a_payer = reste_a_payer;
//		this.somme_recu = somme_recu;
//		this.monaie = monaie;
//		this.reduction = reduction;
//		this.vente = vente;
//		this.reglements = reglements;
//	}
//
//
//
//
//	/**
//	 * @return the idFacture
//	 */
//	public long getIdFacture() {
//		return idFacture;
//	}
//
//
//	/**
//	 * @param idFacture the idFacture to set
//	 */
//	public void setIdFacture(long idFacture) {
//		this.idFacture = idFacture;
//	}
//
//
//	/**
//	 * @return the vente
//	 */
//	public Vente getVente() {
//		return vente;
//	}
//
//
//	/**
//	 * @param vente the vente to set
//	 */
//	public void setVente(Vente vente) {
//		this.vente = vente;
//	}
//
//
//	/**
//	 * @return the reglements
//	 */
//	public List<Reglement> getReglements() {
//		return reglements;
//	}
//
//
//	/**
//	 * @param reglements the reglements to set
//	 */
//	public void setReglements(List<Reglement> reglements) {
//		this.reglements = reglements;
//	}
//
//
//
//
//	public double getMontant_due() {
//		return montant_due;
//	}
//
//
//
//
//	public void setMontant_due(double montant_due) {
//		this.montant_due = montant_due;
//	}
//
//
//
//
//	public double getMontant_encaisse() {
//		return montant_encaisse;
//	}
//
//
//
//
//	public void setMontant_encaisse(double montant_encaisse) {
//		this.montant_encaisse = montant_encaisse;
//	}
//
//
//
//
//	public double getReste_a_payer() {
//		return reste_a_payer;
//	}
//
//
//
//
//	public void setReste_a_payer(double reste_a_payer) {
//		this.reste_a_payer = reste_a_payer;
//	}
//
//
//
//
//	public double getSomme_recu() {
//		return somme_recu;
//	}
//
//
//
//
//	public void setSomme_recu(double somme_recu) {
//		this.somme_recu = somme_recu;
//	}
//
//
//
//
//	public double getMonaie() {
//		return monaie;
//	}
//
//
//
//
//	public void setMonaie(double monaie) {
//		this.monaie = monaie;
//	}
//
//
//
//
//	public double getReduction() {
//		return reduction;
//	}
//
//
//
//
//	public void setReduction(double reduction) {
//		this.reduction = reduction;
//	}
//	
//	
//
//}