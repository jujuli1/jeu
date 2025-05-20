/**
 * 
 */
package fr.eni.tp.julien.bo;

/**
 * Programme en charge de
 * 
 * @date 19 mai 2025 - 12:29:03
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Personnage {

	private int id;
	private String nom;
	private int attaque;
	private int defense;
	private int niveau;
	private int PointDeVie;
	
	

	public void attaque(Personnage personnage) {

	}

	public void communique() {

	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Personnage [id=");
		builder.append(id);
		builder.append(", nom=");
		builder.append(nom);
		builder.append(", attaque=");
		builder.append(attaque);
		builder.append(", defense=");
		builder.append(defense);
		builder.append(", niveau=");
		builder.append(niveau);
		builder.append(", PointDeVie=");
		builder.append(PointDeVie);
		builder.append("]");
		return builder.toString();
	}

	public Personnage() {
		super();
		this.nom = "roger";
		this.defense = 10;
		this.niveau = 8;
		this.PointDeVie = 50;
	}

	public Personnage(int id, String nom, int defense, int niveau, int PointDeVie) {
		super();
		this.id = id;
		this.nom = nom;
		
		this.defense = defense;
		this.niveau = niveau;
		this.PointDeVie = PointDeVie;
	}

	public Personnage(String nom, int defense, int niveau, int PointDeVie) {
		super();
		this.nom = nom;
		this.defense = defense;
		this.niveau = niveau;
		this.PointDeVie = PointDeVie;
	}

	/**
	 * Getter pour id.
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Getter pour nom.
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter pour attaque.
	 * @return the attaque
	 */
	public int getAttaque() {
		return attaque;
	}

	/**
	 * Getter pour defense.
	 * @return the defense
	 */
	public int getDefense() {
		return defense;
	}

	/**
	 * Getter pour niveau.
	 * @return the niveau
	 */
	public int getNiveau() {
		return niveau;
	}

	/**
	 * Getter pour pointDeVie.
	 * @return the pointDeVie
	 */
	public int getPointDeVie() {
		return PointDeVie;
	}

	/**
	 * Setter pour id.
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Setter pour nom.
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter pour attaque.
	 * @param attaque the attaque to set
	 */
	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	/**
	 * Setter pour defense.
	 * @param defense the defense to set
	 */
	public void setDefense(int defense) {
		this.defense = defense;
	}

	/**
	 * Setter pour niveau.
	 * @param niveau the niveau to set
	 */
	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	/**
	 * Setter pour pointDeVie.
	 * @param pointDeVie the pointDeVie to set
	 */
	public void setPointDeVie(int pointDeVie) {
		PointDeVie = pointDeVie;
	}
	
	public void LoozPts() {
		this.PointDeVie -= 1;
	}
	public void LoozPtsBoss() {
		this.PointDeVie -= 3;
	}

}
