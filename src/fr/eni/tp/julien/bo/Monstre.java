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
private int PointDeVie;

public Monstre(String type, int PointDeVie, int atk, int def) {
	this.type = type;
	this.PointDeVie = PointDeVie;
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
	System.out.println(   type );
}

/**
 * Getter pour type.
 * @return the type
 */
public String getType() {
	return type;
}



/**
 * Setter pour type.
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
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

/**
 * Getter pour pointDeVie.
 * @return the pointDeVie
 */
public int getPointDeVie() {
	return PointDeVie;
}

/**
 * Setter pour pointDeVie.
 * @param pointDeVie the pointDeVie to set
 */
public void setPointDeVie(int pointDeVie) {
	PointDeVie = pointDeVie;
}

public void LoozPtsE(PointDeVie pointDeVie) {
	this.PointDeVie = this.pointDeVie - pointDeVie;
	this.PointDeVie -= 1;
}
}
