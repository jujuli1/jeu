/**
 * 
 */
package fr.eni.tp.julien.bo;

/**
 * Programme en charge de
 * @date 20 mai 2025 - 09:35:42
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Butin {

	private String nom;
	private double or;
	
	public Butin(String nom, double or) {
		this.nom =nom;
		this.or = or;
		
	}

	/**
	 * Getter pour nom.
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter pour or.
	 * @return the or
	 */
	public double getOr() {
		return or;
	}

	/**
	 * Setter pour nom.
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter pour or.
	 * @param or the or to set
	 */
	public void setOr(double or) {
		this.or = or;
	}
}
