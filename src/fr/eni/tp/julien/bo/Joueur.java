/**
 * 
 */
package fr.eni.tp.julien.bo;

/**
 * Programme en charge de
 * @date 19 mai 2025 - 13:01:18
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Joueur extends Personnage{
	
	
	private String prenom;
	private String metier;
	private int or;
	
	
	
	public Joueur() {
		super();
	}


	/**
	 * Constructeur
	 * @param nom
	 * @param attaque
	 * @param defense
	 * @param niveau
	 * @param PontDeVie
	 */
	public Joueur(String nom, int attaque, int defense, int niveau, int PointDeVie, int or, String metier, String prenom) {
		super(nom, attaque, defense, niveau, PointDeVie);
		this.or = or;
		this.prenom = prenom;
		this.metier  = metier;
		
	}
	
	/**
	 * Constructeur
	 * @param id
	 * @param nom
	 * @param attaque
	 * @param defense
	 * @param niveau
	 * @param PontDeVie
	 */
	public Joueur(int id, String nom, int attaque, int defense, int niveau, int PontDeVie, int or, String prenom, String metier) {
		super(id, nom, attaque, defense, niveau, PontDeVie);
		this.or = or;
		this.prenom = prenom;
		this.metier  = metier;
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
	public int getOr() {
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
