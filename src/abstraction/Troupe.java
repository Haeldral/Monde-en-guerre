package abstraction;

import java.util.ArrayList;

import regles.Regle;

public abstract class Troupe {

	protected ArrayList<Equipement> listeEquipement;
	public static Regle.typeEquipement typeEquipementAutorise;
	protected String nomTroupe;

	public Troupe() {
		listeEquipement = new ArrayList<Equipement>();
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

		try {
			if (Regle.assignerEquipement(equipement, typeEquipementAutorise)) {
				System.out.println(equipement.type.toString()+" ajouté");
				listeEquipement.add(equipement);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
