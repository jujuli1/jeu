/**
 * 
 */
package fr.eni.tp.julien.bo;

/**
 * Programme en charge de
 * @date 19 mai 2025 - 13:03:03
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Donjon{
	
	private String nom;
	private int niveau;
	private int butinOr;
	
	
	public Donjon(String nom, int niveau, int butinOr) {
		this.nom = nom;
		this.niveau = niveau;
		this.butinOr = butinOr;
	}
	
	
	
	
	
	/**
	 * Getter pour nom.
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * Getter pour niveau.
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}
	/**
	 * Getter pour butinOr.
	 * @return the butinOr
	 */
	public int getButinOr() {
		return butinOr;
	}
	/**
	 * Setter pour nom.
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * Setter pour niveau.
	 * @param niveau the niveau to set
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	/**
	 * Setter pour butinOr.
	 * @param butinOr the butinOr to set
	 */
	public void setButinOr(int butinOr) {
		this.butinOr = butinOr;
	}
	
	

	
	
	

}
