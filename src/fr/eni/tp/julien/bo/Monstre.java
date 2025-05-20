/**
 * 
 */
package fr.eni.tp.julien.bo;

/**
 * Programme en charge de
 * @date 19 mai 2025 - 13:06:17
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Monstre{
private String type;
private int atk;
private int def;
private Donjon donjon;

public Monstre(String type, Donjon donjon, int atk, int def) {
	this.type = type;
	this.donjon = donjon;
	this.atk = atk;
	this.def= def;
}

/**
 * Constructeur
 * @param donjon 
 * @param type 
 * @param type2
 * @param dj
 */
public Monstre() {
	// TODO Auto-generated constructor stub
}

public void communique() {
	System.out.println("Monstre du donjon de : " + donjon.getNom() + " de type " + type + " et de niveau " + donjon.getNiveau());
}

/**
 * Getter pour type.
 * @return the type
 */
public String getType() {
	return type;
}

/**
 * Getter pour donjon.
 * @return the donjon
 */
public Donjon getDonjon() {
	return donjon;
}

/**
 * Setter pour type.
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}

/**
 * Setter pour donjon.
 * @param donjon the donjon to set
 */
public void setDonjon(Donjon donjon) {
	this.donjon = donjon;
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
}
