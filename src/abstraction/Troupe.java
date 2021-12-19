package abstraction;

import java.util.ArrayList;

import regles.Regle;

public abstract class Troupe {
	protected ArrayList<Regle> listeRegle;
	protected ArrayList<Equipement> listeEquipement;
	protected String nomTroupe;
	
	public Troupe() {
		listeRegle = new ArrayList<Regle>();
		listeEquipement = new ArrayList<Equipement>();
	}

	public ArrayList<Regle> getListeRegleArmee() {
		return listeRegle;
	}

	public void setListeRegleArmee(ArrayList<Regle> listeRegleArmee) {
		this.listeRegle = listeRegleArmee;
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
	
	public void ajouterEquipement(Equipement eq) {
		this.listeEquipement.add(eq);
	}
	
	public void afficherTroupe() {
		System.out.println("Nom de la troupe : " + nomTroupe + "\n");
		
		System.out.println("Nombre d'équipement(s) : " + listeEquipement.size());
		for(Equipement eq : listeEquipement) {
			eq.afficherEquipement();
		}
		
	}
	
}
