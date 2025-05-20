/**
 * 
 */
package fr.eni.tp.julien.bo;

import java.util.ArrayList;
import fr.eni.tp.julien.bo.Inventaire;
import java.util.List;
import java.util.Random;
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

		
		
;		
		
		
		
		
		//donjon
		Donjon donjon = new Donjon("Krakagar", 12, 80);
		Donjon donjon2 = new Donjon("Morte-Mines", 20, 160);
		Donjon donjon3 = new Donjon("Rouge-Mer", 20, 160);
		
		//monstre
		Monstre monstre = new Monstre("Murloc", 5, 9, 6);
		Monstre monstre2 = new Monstre("Ours", 14, 12, 10);
		Monstre monstre3 = new Monstre("fantomas", 13, 19, 3);
		Monstre boss = new Monstre("Roi-Liche", 5, 59, 30);
		
		//joueur
		Joueur joueur = new Joueur("PexInSafety", 3, 10, 4, 5,"Enchanteur", "PexInSafety");
		System.out.println(joueur);
		
		//armes
		Armes arme = new Armes("hache en papier bulle"," Arme a une main", 7, 10, 4);
		Armes arme2 = new Armes("Epée en polystyrène"," Arme a deux mains", 12, 10, 5);
		
		//Loot
		Butin butin = new Butin("Bourse conséquente d'or", 3);
		Butin butin2 = new Butin("petite monnaie", 0.5);
		Butin butin3 = new Butin("Porte-monnaie égaré", 1.5);
		
		
		
		Random random = new Random();
		
		
		
		//Loot aléatoire
		Butin[] butins = {butin, butin2, butin3};
		
		
		
		int index = random.nextInt(butins.length);
		
		Butin butinChoisit =  butins[index];
		
		// tableau des loots
		List<Butin> butinLoot = new ArrayList<>();
		
		//Monstre aleatoire
		Monstre[] mobs = {monstre, monstre2, monstre3};
		int pokedex = random.nextInt(mobs.length);
		Monstre mob =  mobs[pokedex];
		
		
		//tableau d'armes
		List<Armes> armes = new ArrayList<>();

		armes.add(arme);
		armes.add(arme2);
		
		
		//Bourse du joueur
		//Inventaire
		Inventaire bourse = new Inventaire(butinChoisit.getOr(), "mon porte monnaie : ");
		List<Inventaire> monSac = new ArrayList<>();
		
		
		
		
		
		switch(saisie) {
		
		//donjon de Krakagar
		case 1:
			
			
				
				System.out.println("Vous vous dirigez vers " + donjon.getNom());
				System.out.println(joueur.getPrenom() + " decide de rentrer dans le donjon ...");
				
				for(int i =0; i < 10;i++){
				System.out.println(joueur.getPrenom() 
				+ " rencontre un " + " "  
				+ mob.getType() 
				+ " ATK : " + mob.getAtk()
				+ " DEF : " + mob.getDef()
				+ " LP : " + mob.getPointDeVie());
				
				
				
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
				
				
				
				
				// Combat
				System.out.println(" Combattre ? ");
				Scanner scannerAtk = new Scanner(System.in);
				int combat = scannerAtk .nextInt();
				
				
				
				//Choisit de combattre
					if(combat == 1) {
						System.out.println("FIGHT ! ");
						//Choisit de combattre avec hache en papier bulle
						if(armeChoisi.getNom().equals("hache en papier bulle")) {
							if(armeChoisi.getAtk() <= mob.getDef()) {
								System.out.println("Failed ! ");
								if(mob.getAtk() <= joueur.getDefense()) {
									System.out.println(" L'attaque de l ennemi contre le joueur à échouée !");
								}else {
									System.out.println(" Le joueur a été toucher par l'attaque de l ennemi :  Fatality");
									joueur.LoozPts();
									System.out.println("Ils vous reste " + joueur.getPointDeVie() + " LP");
									
								}
								
							}else {
								//calcul des dégats des armes sur les LP des ennemis
				                
								monstre.LoozPtsE();
								int ptsE = monstre.getPointDeVie() - armeChoisi.getAtk();
								System.out.println(monstre.getPointDeVie());
								
								if(monstre.getPointDeVie() <= 0){
									System.out.println("U win ! ");
								System.out.println("Vous avez ramassé " + butinChoisit.getNom() + " D'une valeur de " + butinChoisit.getOr());
								joueur.Loot(butinChoisit);
								System.out.println("Vous disposez de : " + joueur.getOr() + " or ");
								break;


								}else{
									System.out.println(monstre.getPointDeVie());
								}
								
								
								//Pour plus tard
								monSac.add(bourse);
								
								
								
							}
						}
						//Choisit de combattre avec épée en polystyrene
						if(armeChoisi.getNom().equals("Epée en polystyrène")) {
							if(armeChoisi.getAtk() <= monstre.getDef()) {
								System.out.println("Failed ! ");
								if(monstre.getAtk() <= joueur.getDefense()) {
									System.out.println(" L'attaque du monstre contre le joueur à échouée !");
								}else {
									System.out.println(" Le joueur a été toucher par l'attaque du " + monstre.getType() + " : " + " Fatality");
									joueur.LoozPts();
									System.out.println("Ils vous reste " + joueur.getPointDeVie() + " LP");
								}
								
							}else {
								
								//calcul des dégats des armes sur les LP des ennemis
								monstre.LoozPtsE();
								int ptsE = monstre.getPointDeVie() - armeChoisi.getAtk();
								
								if(monstre.getPointDeVie() <= 0){
									
									System.out.println("U win ! ");
								System.out.println("Vous avez ramassé " + butinChoisit.getNom() + " D'une valeur de " + butinChoisit.getOr());
								joueur.Loot(butinChoisit);
								System.out.println("Vous disposez de : " + joueur.getOr() + " or ");
								break;


								}else{
									System.out.println(monstre.getPointDeVie());
								}
								//Pour plus tard
								monSac.add(bourse);
								
							}
							
						}
						
						
					}
					//refuse le combat
					if(combat == 2) {
						System.out.println("* Fuit courageusement ...* ");
					}
					
				}
				System.out.println("La boucle a terminé après 3 itérations.");
				for(int i =0; i < 3; i++) {
					
					
					System.out.println( 
							 boss.getType() + " fait son entrée" 
							+ " ATK : " + boss.getAtk()
							+ " DEF : " + boss.getDef());
							
							
							
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
							
							
							
							
							// Combat
							System.out.println(" Combattre ? ");
							Scanner scannerAtk = new Scanner(System.in);
							int combat = scannerAtk .nextInt();
							
							
							
							
							//Choisit de combattre le Boss
								if(combat == 1) {
									System.out.println("FIGHT ! ");
									//Choisit de combattre avec hache en papier bulle
									if(armeChoisi.getNom().equals("hache en papier bulle")) {
										if(armeChoisi.getAtk() <= boss.getDef()) {
											System.out.println("Failed ! ");
											if(boss.getAtk() <= joueur.getDefense()) {
												System.out.println(" L'attaque de l ennemi contre le joueur à échouée !");
											}else {
												System.out.println(" Le joueur a été toucher par l'attaque du" + boss.getType()  + " :  Fatality");
												joueur.LoozPtsBoss();
												System.out.println("Ils vous reste " + joueur.getPointDeVie() + " LP");
												if(joueur.getPointDeVie() < 0){
													System.out.println("Vous avez mourru ! ");
													break;
												}
											}
											
										}else {
											
								
									System.out.println("U win ! ");
								System.out.println("Vous avez ramassé " + butinChoisit.getNom() + " D'une valeur de " + butinChoisit.getOr());
								joueur.Loot(butinChoisit);
								System.out.println("Vous disposez de : " + joueur.getOr() + " or ");


											
											//Pour plus tard
											monSac.add(bourse);
											
											
											
										}
									}
									//Choisit de combattre avec épée en polystyrene
									if(armeChoisi.getNom().equals("Epée en polystyrène")) {
										if(armeChoisi.getAtk() <= boss.getDef()) {
											System.out.println("Failed ! ");
											if(boss.getAtk() <= joueur.getDefense()) {
												System.out.println(" L'attaque du " + boss.getType() +" contre le joueur à échouée !");
											}else {
												System.out.println(" Le joueur a été toucher par l'attaque du " + boss.getType() + " : " + " Fatality");
												joueur.LoozPtsBoss();
												System.out.println("Ils vous reste " + joueur.getPointDeVie() + " LP");
												if(joueur.getPointDeVie() < 0){
													System.out.println("Vous avez mourru ! ");
													break;
												}
											}
											
										}else {
											System.out.println("U win ! ");
											System.out.println("Vous avez ramassé " + butinChoisit.getNom() + " D'une valeur de " + butinChoisit.getOr());
											joueur.Loot(butinChoisit);
											System.out.println("Vous disposez de : " + joueur.getOr() + " or ");
											//Pour plus tard
											monSac.add(bourse);
											
										}
										
									}
									
									
								}
								//refuse le combat
								if(combat == 2) {
									System.out.println("* Fuit courageusement ...* ");
								}


							}
								
								
							
			

		

				
			break;	  
		
		case 2:
			System.out.println("Vous vous dirigez vers " + donjon2.getNom());
			System.out.println(joueur.getPrenom() + " decide de rentrer dans le donjon ...");
			System.out.println(joueur.getPrenom() 
			+ " rencontre un " + " "  
			+ mob.getType() 
			+ " ATK : " + mob.getAtk()
			+ " DEF : " + mob.getDef());
			
			//choix de l'arme
			System.out.println("Choisissez entre : 1- hache en papier bulle | 2- Epée en polystyrène");
			Scanner scannerArmeDonjon2 = new Scanner(System.in);
			int weaponDonjon2 = scannerArmeDonjon2 .nextInt();
			
			

			
			
			
			if(weaponDonjon2 == 1) {
				System.out.println("Vous vous équipez de :  " + armes.get(weaponDonjon2-1).getNom() + "ATK : " + armes.get(weaponDonjon2-1).getAtk() + " DEF : " + arme.getDef());
			}
			if(weaponDonjon2 == 2) {
				System.out.println("Vous vous équipez de :  " + armes.get(weaponDonjon2-1).getNom() + "ATK : " + armes.get(weaponDonjon2-1).getAtk() + " DEF : " + arme.getDef());
			}
			
			Armes  armeChoisiDonjon2 = armes.get(weaponDonjon2-1);
			
			
			
			
			// Combat
			System.out.println(" Combattre ? ");
			Scanner scannerAtkDonjon2 = new Scanner(System.in);
			int combatDonjon2 = scannerAtkDonjon2 .nextInt();
			
			
			
			
			//Choisit de combattre
				if(combatDonjon2 == 1) {
					System.out.println("FIGHT ! ");
					//Choisit de combattre avec hache en papier bulle
					if(armeChoisiDonjon2.getNom().equals("hache en papier bulle")) {
						if(armeChoisiDonjon2.getAtk() <= mob.getDef()) {
							System.out.println("Failed ! ");
							if(mob.getAtk() <= joueur.getDefense()) {
								System.out.println(" L'attaque de l ennemi contre le joueur à échouée !");
							}else {
								System.out.println(" Le joueur a été toucher par l'attaque de l ennemi :  Fatality");
								joueur.LoozPts();
								System.out.println("Ils vous reste " + joueur.getPointDeVie() + " LP");
								
							}
							
						}else {
							System.out.println("U win ! ");
							System.out.println("Vous avez ramassé " + butinChoisit.getNom() + " D'une valeur de " + butinChoisit.getOr());
							joueur.Loot(butinChoisit);
							System.out.println("Vous disposez de : " + joueur.getOr() + " or ");
							//Pour plus tard
							monSac.add(bourse);
							
							
						}
					}
					//Choisit de combattre avec épée en polystyrene
					if(armeChoisiDonjon2.getNom().equals("Epée en polystyrène")) {
						if(armeChoisiDonjon2.getAtk() <= monstre.getDef()) {
							System.out.println("Failed ! ");
							if(monstre.getAtk() <= joueur.getDefense()) {
								System.out.println(" L'attaque du monstre contre le joueur à échouée !");
							}else {
								System.out.println(" Le joueur a été toucher par l'attaque du " + monstre.getType() + " : " + " Fatality");
								joueur.LoozPts();
								System.out.println("Ils vous reste " + joueur.getPointDeVie() + " LP");
							}
							
						}else {
							System.out.println("U win ! ");
							System.out.println("Vous avez ramassé " + butinChoisit.getNom() + " D'une valeur de " + butinChoisit.getOr());
							joueur.Loot(butinChoisit);
							System.out.println("Vous disposez de : " + joueur.getOr() + " or ");
							//Pour plus tard
							monSac.add(bourse);
						}
					}
					
					
				}
				//refuse le combat
				if(combatDonjon2 == 2) {
					System.out.println("* Fuit courageusement ...* ");
				}
				
		
				
			break;
			
		
			
			
			
		}
		}
}
	
		
			
	
	
		
		
		
			
		

	


