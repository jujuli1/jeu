/**
 * 
 */
package fr.eni.tp.julien.bo;

/**
 * Programme en charge de
 * @date 19 mai 2025 - 13:07:01
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Armes extends Joueur{
	
	
private String nom;
private String type;
public int atk;
private int def;
private int lvl;


public Armes() {
	super();
}

/**
 * Constructeur
 * @param nom
 * @param type
 * @param atk
 * @param def
 * @param lvl
 */
public Armes(String nom, String type, int atk, int def, int lvl) {
	super();
	this.nom = nom;
	this.type = type;
	this.atk = atk;
	this.def = def;
	this.lvl = lvl;
}




/**
 * Getter pour nom.
 * @return the nom
 */
public String getNom() {
	return nom;
}
/**
 * Getter pour type.
 * @return the type
 */
public String getType() {
	return type;
}
/**
 * Getter pour atk.
 * @return the atk
 */
public int getAtk() {
	return atk;
}
/**
 * Getter pour def.
 * @return the def
 */
public int getDef() {
	return def;
}
/**
 * Getter pour lvl.
 * @return the lvl
 */
public int getLvl() {
	return lvl;
}
/**
 * Setter pour nom.
 * @param nom the nom to set
 */
public void setNom(String nom) {
	this.nom = nom;
}
/**
 * Setter pour type.
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}
/**
 * Setter pour atk.
 * @param atk the atk to set
 */
public void setAtk(int atk) {
	this.atk = atk;
}
/**
 * Setter pour def.
 * @param def the def to set
 */
public void setDef(int def) {
	this.def = def;
}
/**
 * Setter pour lvl.
 * @param lvl the lvl to set
 */
public void setLvl(int lvl) {
	this.lvl = lvl;
}



}
