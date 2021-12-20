package abstraction;

import java.util.ArrayList;

import regles.Regle;
import regles.RegleEquipement;

public abstract class Unite {

	protected ArrayList<Troupe> listeTroupe;
	public static ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise;
	
	protected String nomUnite;
	
	public Unite(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		
		listeTroupe = new ArrayList<Troupe>();
		typeEquipementAutorise = new ArrayList<RegleEquipement.typeEquipement>();
		typeEquipementAutorise.addAll(equiUnite);
	}
	
	
	
	public ArrayList<Troupe> getListeTroupe() {
		return listeTroupe;
	}



	public void setListeTroupe(ArrayList<Troupe> listeTroupe) {
		this.listeTroupe = listeTroupe;
	}
	
	



	public static ArrayList<RegleEquipement.typeEquipement> getTypeEquipementAutorise() {
		return typeEquipementAutorise;
	}



	public static void setTypeEquipementAutorise(ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise) {
		Unite.typeEquipementAutorise = typeEquipementAutorise;
	}



	public String getNomUnite() {
		return nomUnite;
	}



	public void setNomUnite(String nomUnite) {
		this.nomUnite = nomUnite;
	}


	public void ajouterTroupe(Troupe t) {
		this.listeTroupe.add(t);
	}
	
	public void afficherUnite() {
		System.out.println("Nom de l'unité : " + nomUnite+ "\n");

		
		System.out.println("Nombre de troupe(s) : " + listeTroupe.size());
		for(Troupe t : listeTroupe) {
			t.afficherTroupe();
			System.out.println("");
		}
		
	
	}

}
