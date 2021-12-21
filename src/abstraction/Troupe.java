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
		typeEquipementAutorise.addAll(equiUnite); // On r�cup�re les regles de l'unit� choisie
	}


	// GETTERS AND SETTERS
	public void setListeEquipement(ArrayList<Equipement> listeEquipement) {this.listeEquipement = listeEquipement;}
	public ArrayList<Equipement> getListeEquipement() {return listeEquipement;}
	public void setNomTroupe(String nomTroupe) {this.nomTroupe = nomTroupe;}
	public String getNomTroupe() {return nomTroupe;}



	public void afficherTroupe() {
		System.out.println("Nom de la troupe : " + nomTroupe + "\n");
		System.out.println("Nombre d'�quipement(s) : " + listeEquipement.size());
		for(Equipement eq : listeEquipement) {
			eq.afficherEquipement();
		}
	}

	// M�thode qui v�rifie si les �quipements sont compatibles avec les regles et les assigne le cas �ch�ant
	public void assignerEquipement(Equipement equipement) {
		boolean equipementAccepte = false;
		boolean equipementPresent = false;

		try {
			// V�rification si l'equipement est deja pr�sent dans la liste d'equipement de la troupe
			Class c = equipement.getClass();
			for(Equipement eq : listeEquipement) {
				if(c.isInstance(eq) )
					equipementPresent = true;
			}

			if(!equipementPresent) {
				// Test de chaque r�gle d'�quipement
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
					System.out.println("�quipement interdit");
			}
			else
				System.out.println("Equipement d�j� pr�sent");

			


		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
