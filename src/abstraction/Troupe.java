package abstraction;

import java.util.ArrayList;

import regles.Regle;
import regles.RegleEquipement;

public abstract class Troupe {

	protected ArrayList<Equipement> listeEquipement;
	public static ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise;
	protected String nomTroupe;

	public Troupe(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		listeEquipement = new ArrayList<Equipement>();
		typeEquipementAutorise = new ArrayList<RegleEquipement.typeEquipement>();
		typeEquipementAutorise.addAll(equiUnite);
	}



	public ArrayList<Equipement> getListeEquipement() {
		return listeEquipement;
	}



	public void setListeEquipement(ArrayList<Equipement> listeEquipement) {
		this.listeEquipement = listeEquipement;
	}



	public String getNomTroupe() {
		return nomTroupe;
	}



	public void setNomTroupe(String nomTroupe) {
		this.nomTroupe = nomTroupe;
	}



	public void afficherTroupe() {
		System.out.println("Nom de la troupe : " + nomTroupe + "\n");

		System.out.println("Nombre d'équipement(s) : " + listeEquipement.size());
		for(Equipement eq : listeEquipement) {
			eq.afficherEquipement();
		}

	}

	public void assignerEquipement(Equipement equipement) {

		boolean autorisation = false;

		try {
			// Test de chaque règle d'équipment
			for(RegleEquipement.typeEquipement typeEqu : typeEquipementAutorise) {
				if (RegleEquipement.verifierEquipement(equipement, typeEqu))
					autorisation = true;
			}

			// Assignation
			if (autorisation) {
				System.out.println(equipement.type.toString()+" ajouté");
				listeEquipement.add(equipement);
			}else {
				System.out.println("équipement interdit");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
