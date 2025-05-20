/**
 * 
 */
package fr.eni.tp.julien.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * Programme en charge de
 * @date 19 mai 2025 - 13:01:18
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Joueur extends Personnage{
	
	
	private String prenom;
	private String metier;
	private double or;
	private int PointDeVie;
	
	
	
	
	public Joueur() {
		super();
	}


	/**
	 * Constructeur
	 * @param nom
	 * @param attaque
	 * @param defense
	 * @param niveau
	 * @param PointDeVie
	 */
	public Joueur(String nom, int defense, int niveau, int PointDeVie, double or, String metier, String prenom) {
		super(nom, defense, niveau, PointDeVie);
		this.or = or;
		this.prenom = prenom;
		this.metier  = metier;
		this.PointDeVie= PointDeVie;
		
	}
	
	/**
	 * Constructeur
	 * @param id
	 * @param nom
	 * @param attaque
	 * @param defense
	 * @param niveau
	 * @param PointDeVie
	 */
	public Joueur(int id, String nom, int defense, int niveau, int PointDeVie, double or, String prenom, String metier) {
		super(id, nom, defense, niveau, PointDeVie);
		this.or = or;
		this.prenom = prenom;
		this.metier  = metier;
		this.PointDeVie = PointDeVie;
	}
	
	
	
	public void Loot(Butin butin) {
		
		this.or = this.or + butin.getOr();
		System.out.println("Vous avez gagné " + butin.getOr() + " or !");
	}


	/**
	 * Getter pour prenom.
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}


	/**
	 * Getter pour metier.
	 * @return the metier
	 */
	public String getMetier() {
		return metier;
	}


	/**
	 * Getter pour or.
	 * @return the or
	 */
	public double getOr() {
		return or;
	}


	/**
	 * Setter pour prenom.
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/**
	 * Setter pour metier.
	 * @param metier the metier to set
	 */
	public void setMetier(String metier) {
		this.metier = metier;
	}


	/**
	 * Setter pour or.
	 * @param or the or to set
	 */
	public void setOr(int or) {
		this.or = or;
	}
	
	
	
	

	
}
