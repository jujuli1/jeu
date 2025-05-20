/**
 * 
 */
package fr.eni.tp.julien.bo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



/**
 * Programme en charge de
 * @date 19 mai 2025 - 13:20:47
 * @version TpJulien_V1.0
 * @author jlefevre2025
 */
public class Main {

	/**
	 * Méthode en charge de
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("hola aventurier, ou souhaitez vous vous rendre ? : ");
		int saisie = scanner .nextInt();
		
		
		
		
		
		
		Donjon donjon = new Donjon("Krakagar", 12, 80);
		Donjon donjon2 = new Donjon("Morte-Mines", 20, 160);
		Donjon donjon3 = new Donjon("Rouge-Mer", 20, 160);
		Monstre monstre = new Monstre("Murloc", donjon, 9, 10);
		Joueur joueur = new Joueur("PexInSafety",10, 3, 10, 4, 5,"Enchanteur", "PexInSafety");
		Armes arme = new Armes("hache en papier bulle"," Arme a une main", 10, 10, 4);
		Armes arme2 = new Armes("Epée en polystyrène"," Arme a deux mains", 12, 10, 5);
		
		List<Armes> armes = new ArrayList<>();

		armes.add(arme);
		armes.add(arme2);
		
		
		
		switch(saisie) {
		case 1:
			System.out.println("Vous vous dirigez vers " + donjon.getNom());
			System.out.println(joueur.getPrenom() + "decide de rentrer dans le donjon ...");
			System.out.println(joueur.getPrenom() 
			+ " rencontre un " + " "  
			+ monstre.getType() 
			+ " ATK : " + monstre.getAtk()
			+ " DEF : " + monstre.getDef());
			
			//choix de l'arme
			System.out.println("Choisissez entre : 1- hache en papier bulle | 2- Epée en polystyrène");
			Scanner scannerArme = new Scanner(System.in);
			int weapon = scannerArme .nextInt();
			
			

			
			
			
			if(weapon == 1) {
				System.out.println("Vous vous équipez de :  " + armes.get(weapon-1).getNom() + "ATK : " + armes.get(weapon-1).getAtk() + " DEF : " + arme.getDef());
			}
			if(weapon == 2) {
				System.out.println("Vous vous équipez de :  " + armes.get(weapon-1).getNom() + "ATK : " + armes.get(weapon-1).getAtk() + " DEF : " + arme.getDef());
			}
			
			Armes  armeChoisi = armes.get(weapon-1);
			
			
			
			
			
			System.out.println(" Combattre ? ");
			Scanner scannerAtk = new Scanner(System.in);
			int combat = scannerAtk .nextInt();
			
			
			
			
			
				if(combat == 1) {
					System.out.println("FIGHT ! ");
					if(armeChoisi.getNom().equals("hache en papier bulle")) {
						if(armeChoisi.getAtk() <= monstre.getDef()) {
							System.out.println("Failed ! ");
							if(monstre.getAtk() <= joueur.getDefense()) {
								System.out.println(" L'attaque du monstre contre le joueur à échouée !");
							}else {
								System.out.println(" Le joueur a été toucher par l'attaque du " + monstre.getType() + " : " + " Fatality");
							}
							
						}else {
							System.out.println("U win ! ");
						}
					}
					if(armeChoisi.getNom().equals("Epée en polystyrène")) {
						if(armeChoisi.getAtk() <= monstre.getDef()) {
							System.out.println("Failed ! ");
							if(monstre.getAtk() <= joueur.getDefense()) {
								System.out.println(" L'attaque du monstre contre le joueur à échouée !");
							}else {
								System.out.println(" Le joueur a été toucher par l'attaque du " + monstre.getType() + " : " + " Fatality");
							}
							
						}else {
							System.out.println("U win ! ");
						}
					}
					
					
				}
				if(combat == 2) {
					System.out.println("* Fuit courageusement ...* ");
				}
				
		
				
			break;
		
		
		case 2:
			System.out.println("Vous vous dirigez vers " + donjon2.getNom());
			break;
			
		
			
			
			
		}
		}
	}
		
			
	
	
		
		
		
			
		

	


