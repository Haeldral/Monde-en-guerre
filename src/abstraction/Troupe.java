package abstraction;

import java.util.ArrayList;

import abstraction.Equipement.equipement;
import verificationRegles.VerificationEquipement;

public abstract class Troupe {

	public enum troupe {
		INFANTERIE,
		BAZOOKA,
		TANK,
		TRANSPORTEUR,
		INFANTERIELOURDE
	}

	public troupe typeTroupe;
	protected ArrayList<Equipement> listeEquipement;
	public ArrayList<VerificationEquipement.typeEquipement> typeEquipementAutorise;
	protected String nomTroupe;



	public Troupe(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		listeEquipement = new ArrayList<Equipement>();
		typeEquipementAutorise = new ArrayList<VerificationEquipement.typeEquipement>();
		typeEquipementAutorise.addAll(equiUnite); // On récupère les regles de l'unité choisie
	}


	// GETTERS AND SETTERS
	public void setListeEquipement(ArrayList<Equipement> listeEquipement) {this.listeEquipement = listeEquipement;}
	public ArrayList<Equipement> getListeEquipement() {return listeEquipement;}
	public void setNomTroupe(String nomTroupe) {this.nomTroupe = nomTroupe;}
	public String getNomTroupe() {return nomTroupe;}



	public void afficherTroupe() {
		System.out.println("Nom de la troupe : " + nomTroupe + "\n");
		System.out.println("Nombre d'équipement(s) : " + listeEquipement.size());
		for(Equipement eq : listeEquipement) {
			eq.afficherEquipement();
		}
	}

	// Méthode qui vérifie si les équipements sont compatibles avec les regles et les assigne le cas échéant
	public void assignerEquipement(Equipement equipement) {
		boolean equipementAccepte = false;
		boolean equipementPresent = false;

		try {
			// Vérification si l'equipement est deja présent dans la liste d'equipement de la troupe
			Class c = equipement.getClass();
			for(Equipement eq : listeEquipement) {
				if(c.isInstance(eq) )
					equipementPresent = true;
			}

			if(!equipementPresent) {
				// Test de chaque règle d'équipement
				for(VerificationEquipement.typeEquipement typeEqu : typeEquipementAutorise) {
					if (VerificationEquipement.verifierEquipement(equipement, typeEqu)) {
						equipementAccepte = true;
					}
				}

				if(equipementAccepte) {
					System.out.println(equipement.typeEquipement.toString()+" ajout");
					listeEquipement.add(equipement);
				}
				else
					System.out.println("équipement interdit");
			}
			else
				System.out.println("Equipement déjà présent");

			


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
