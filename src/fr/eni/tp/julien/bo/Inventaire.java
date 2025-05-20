/**
 * 
 */
package fr.eni.tp.julien.bo;

import java.util.ArrayList;
import java.util.List;

/**
 * Programme en charge de
 * @date 20 mai 2025 - 11:17:40
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Inventaire extends Joueur {

	private double bourse;
	private String nom;
	
	
	
	public Inventaire(double bourse, String nom) {
		this.bourse = bourse;
		this.nom = nom;
	}

	/**
	 * Getter pour bourse.
	 * @return the bourse
	 */
	public double getBourse() {
		return bourse;
	}

	/**
	 * Setter pour bourse.
	 * @param bourse the bourse to set
	 */
	public void setBourse(double bourse) {
		this.bourse = bourse;
	}

	/**
	 * Getter pour nom.
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour nom.
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		 return "Inventaire de " + nom + " : " + bourse + " pièces d'or";
	}
}
