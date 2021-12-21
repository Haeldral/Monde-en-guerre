package abstraction;

import java.util.ArrayList;
import regles.RegleEquipement;

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
	public ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise;
	protected String nomTroupe;
	
	protected ArrayList<Equipement> listeEquipement;
	public  ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise;

	public Troupe(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		listeEquipement = new ArrayList<Equipement>();
		typeEquipementAutorise = new ArrayList<RegleEquipement.typeEquipement>();
		typeEquipementAutorise.addAll(equiUnite);
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

	public void assignerEquipement(Equipement equipement) {

		boolean autorisation = false;

		try {
			// Test de chaque r�gle d'�quipment
			for(RegleEquipement.typeEquipement typeEqu : typeEquipementAutorise) {
				if (RegleEquipement.verifierEquipement(equipement, typeEqu))
					autorisation = true;
			}

			// Assignation
			if (autorisation) {
				System.out.println(equipement.typeEquipement.toString()+" ajout�");
				listeEquipement.add(equipement);
			}else {
				System.out.println("�quipement interdit");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
