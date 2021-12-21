import java.util.ArrayList;
import java.util.Scanner;

import abstraction.*;
import armee.*;
import equipement.*;
import troupe.*;
import unite.*;



public class Main {
	public static final int NBARMEES = 2;
	public static final int NBUNITES = 2;
	public static final int NBTROUPES = 5;
	public static final int NBEQUIPEMENTS = 7;
	
	static Armee armeeCourante;
	static Unite uniteCourante;
	static Troupe troupeCourante;
	static Equipement equipementCourant;
	static ArrayList<Armee> listeArmee = new ArrayList<Armee>();

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
	
		menuPrincipal();
	}
	
	
	// Fonctions de menu (affichage & choix)
	public static void menuPrincipal() {
		int choix =  4;
		@SuppressWarnings("resource")
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
		@SuppressWarnings("resource")
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
			
		}while(choix !=NBARMEES + 1);
		// 
	}
	
	// Choix des unités
	
	public static void choixUnite() {
		
		int choix =  4;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix unite");
			System.out.println(" 1 - Soldats");
			System.out.println(" 2 - Véhicules");
			System.out.println(" 3 - Retour \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				uniteCourante = new UniteSoldat(armeeCourante.getTypeEquipementAutorise());
				break;
			case 2:
				uniteCourante = new UniteVehicule(armeeCourante.getTypeEquipementAutorise());
				break;
			case 3:
				System.out.println("Retour");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
			if (choix <NBUNITES +1) {
				choixTroupe();
				armeeCourante.ajoutUnite(uniteCourante);
				System.out.println("Unite creee \n");
			}
			
		}while(armeeCourante.getListeUnite().size() < 2 && choix !=NBUNITES + 1 ) ;
		
		if(choix != 3)
			System.out.println("Deux unités ajoutées a l'armée, retour au choix des armées \n");
		// 
	}
	
	
	// Choix des troupes
	public static void choixTroupe() {
		int choix =  6;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix Troupe");
			System.out.println(" 1 - Infanterie");
			System.out.println(" 2 - Infanterie Lourde");
			System.out.println(" 3 - Troupe Bazooka");
			System.out.println(" 4 - Tank");
			System.out.println(" 5 - Transporteur");
			System.out.println(" 6 - Annuler \n");
			choix = scan.nextInt();
			
			switch (choix) {
			case 1:
				troupeCourante = new TroupeInfanterie(uniteCourante.getTypeEquipementAutorise());
				break;
				
			case 2:
				troupeCourante = new TroupeInfanterieLourde(uniteCourante.getTypeEquipementAutorise());
				break;
				
			case 3:
				troupeCourante = new TroupeBazooka(uniteCourante.getTypeEquipementAutorise());
				break;
				
			case 4:
				troupeCourante = new TroupeTank(uniteCourante.getTypeEquipementAutorise());
				break;
				
			case 5:
				troupeCourante = new TroupeTransporteur(uniteCourante.getTypeEquipementAutorise());
				break;
				
			case 6:
				System.out.println("Retour");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
			
			if( choix < 6) {
				if(uniteCourante.verifierTroupe(troupeCourante)) {
					choixEquipement();
					uniteCourante.ajouterTroupe(troupeCourante);
					System.out.println("Troupe creee \n");
				}
			}
			
		}while(uniteCourante.getListeTroupe().size() < 2 && choix !=NBTROUPES + 1 ) ;
		if(choix != NBTROUPES + 1 )
			System.out.println("Deux troupes ajoutees a l'unite, retour au choix des unites \n");
	}
	
	// Choix des équipements
	public static void choixEquipement() {
		
		int choix =  6;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Choix Equipement");
			System.out.println(" 1 - Fusil");
			System.out.println(" 2 - Pistolet");
			System.out.println(" 3 - Bazooka");
			System.out.println(" 4 -  Mitrailleuse");
			System.out.println(" 5 -  Canon");
			System.out.println(" 6 -  Carburant");
			System.out.println(" 7 -  Mortier");
			System.out.println(" 8 - Retour \n");
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
				equipementCourant = new EquipementMortier();
				troupeCourante.assignerEquipement(equipementCourant);
				break;
			case 8:
				System.out.println("Fin");
				break;
				
			default:
				System.out.println(" Choix invalide, recommencez");
			}
			
		}while(choix !=NBEQUIPEMENTS + 1 ) ;
		
	}
		
}
