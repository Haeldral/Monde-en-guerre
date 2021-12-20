import java.util.ArrayList;
import java.util.Scanner;

import abstraction.*;
import armee.*;
import equipement.*;
import troupe.*;
import unite.*;



public class Main {
	
	static Armee armeeCourante;
	static Unite uniteCourante;
	static Troupe troupeCourante;
	static Equipement equipementCourant;
	static ArrayList<Armee> listeArmee = new ArrayList<Armee>();

	public static void main(String[] args) /*throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException */{
		
		// Création des règles
		
		
		// Création des troupes
		
	/*	TroupeInfanterie t = new TroupeInfanterie();
		
		EquipementFusil e1 = new EquipementFusil();
		EquipementPistolet e2 = new EquipementPistolet();
		EquipementBazooka e3 = new EquipementBazooka();
		
		t.assignerEquipement(e1);
		t.assignerEquipement(e2);
		t.assignerEquipement(e3);*/
		
		menuPrincipal();
		
	}
	
	// Fonctions de menu (affichage & choix)
	public static void menuPrincipal() {
		int choix =  4;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Menu Armee");
			System.out.println(" 1 - Charger une armee");
			System.out.println(" 2 - Afficher les armees deja chargees");
			System.out.println(" 3 - Quitter  \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				choixArmee();
				break;
			case 2:
				for (Armee a : listeArmee)
					a.afficherArmee();
				break;
			case 3:
				System.out.println("Au revoir");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
		}while(choix !=3);
		
	}
	
	// Choix de l'armée
	public static void choixArmee() {
		int choix =  4;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix Armee");
			System.out.println(" 1 - ArmeeOrangeStar");
			System.out.println(" 2 - ArmeeYellowVComet");
			System.out.println(" 3 - Retour \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				armeeCourante = new ArmeeOrangeStar();
				choixUnite();
				listeArmee.add(armeeCourante);
				System.out.println("Armee creee \n");
				//armeeCourante = null;
				break;
			case 2:
				armeeCourante = new ArmeeYellowComet();
				choixUnite();
				listeArmee.add(armeeCourante);
				System.out.println("Armee creee \n");
				break;
			case 3:
				System.out.println("Retour");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
		}while(choix !=3);
	}
	
	// Choix des unités
	
	public static void choixUnite() {
		
		int choix =  4;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix unite");
			System.out.println(" 1 - Soldats");
			System.out.println(" 2 - Transport");
			System.out.println(" 3 - Retour \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				uniteCourante = new UniteSoldat(armeeCourante.getTypeEquipementAutorise());
				choixTroupe();
				armeeCourante.ajoutUnite(uniteCourante);
				System.out.println("Unite creee \n");
				break;
			case 2:
				uniteCourante = new UniteVehicule(armeeCourante.getTypeEquipementAutorise());
				choixTroupe();
				armeeCourante.ajoutUnite(uniteCourante);
				System.out.println("Unite creee \n");
				break;
			case 3:
				System.out.println("Retour");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
		}while(armeeCourante.getListeUnite().size() < 2 && choix !=3 ) ;
		
		if(choix != 3)
			System.out.println("Deux unites ajoutees a l'unite, retour au choix des armee \n");
		
	}
	
	
	// Choix des troupes
	public static void choixTroupe() {
		int choix =  6;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix Troupe");
			System.out.println(" 1 - Infanterie");
			System.out.println(" 2 - Troupe Bazooka");
			System.out.println(" 3 -  Tank");
			System.out.println(" 4 -  Transporteur");
			System.out.println(" 5 - Annuler \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				troupeCourante = new TroupeInfanterie(uniteCourante.getTypeEquipementAutorise());
				choixEquipement();
				uniteCourante.ajouterTroupe(troupeCourante);
				System.out.println("Troupe creee \n");
				break;
			case 2:
				troupeCourante = new TroupeBazooka(uniteCourante.getTypeEquipementAutorise());
				choixEquipement();
				uniteCourante.ajouterTroupe(troupeCourante);
				System.out.println("Troupe creee \n");
				break;
			case 3:
				troupeCourante = new TroupeTank(uniteCourante.getTypeEquipementAutorise());
				choixEquipement();
				uniteCourante.ajouterTroupe(troupeCourante);
				System.out.println("Troupe creee \n");
				break;
			case 4:
				troupeCourante = new TroupeTransporteur(uniteCourante.getTypeEquipementAutorise());
				choixEquipement();
				uniteCourante.ajouterTroupe(troupeCourante);
				System.out.println("Troupe creee \n");
				break;
			case 5:
				System.out.println("Retour");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
		}while(uniteCourante.getListeTroupe().size() < 2 && choix !=5 ) ;
		if(choix != 5)
			System.out.println("Deux troupes ajoutees a l'unite, retour au choix des unites \n");
	}
	
	
	// Choix des équipements
	public static void choixEquipement() {
		
		int choix =  6;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix Equipement");
			System.out.println(" 1 - Fusil");
			System.out.println(" 2 - Pistolet");
			System.out.println(" 3 - Bazooka");
			System.out.println(" 4 -  Mitrailleuse");
			System.out.println(" 5 -  Canon");
			System.out.println(" 6 -  Carburant");
			System.out.println(" 7 - Retour \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				equipementCourant = new EquipementFusil();
				troupeCourante.assignerEquipement(equipementCourant);
				break;
			case 2:
				equipementCourant = new EquipementPistolet();
				troupeCourante.assignerEquipement(equipementCourant);
				break;
			case 3:
				equipementCourant = new EquipementBazooka();
				troupeCourante.assignerEquipement(equipementCourant);
			case 4:
				equipementCourant = new EquipementMitrailleuse();
				troupeCourante.assignerEquipement(equipementCourant);
				break;
			case 5:
				equipementCourant = new EquipementCanon();
				troupeCourante.assignerEquipement(equipementCourant);
				break;
			case 6:
				equipementCourant = new EquipementCarburant();
				troupeCourante.assignerEquipement(equipementCourant);
				break;
			case 7:
				System.out.println("Fin");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
		}while(choix !=7 ) ;
	}
		
}
