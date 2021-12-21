package abstraction;

import java.util.ArrayList;

import regles.Regle;
import regles.RegleEquipement;

public abstract class Armee {
	
	protected ArrayList<Unite> listeUnite;
	public  ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise;
	protected String nomArmee;
	
	public Armee() {
		listeUnite = new ArrayList<Unite>();
		typeEquipementAutorise = new ArrayList<RegleEquipement.typeEquipement>();
	}
	
	
	public ArrayList<Unite> getListeUnite() {
		return listeUnite;
	}


	public void setListeUnite(ArrayList<Unite> listeUnite) {
		this.listeUnite = listeUnite;
	}
	

	public  ArrayList<RegleEquipement.typeEquipement> getTypeEquipementAutorise() {
		return typeEquipementAutorise;
	}


	public  void setTypeEquipementAutorise(ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise) {
		typeEquipementAutorise = typeEquipementAutorise;
	}


	public String getNomArmee() {
		return nomArmee;
	}


	public void setNomArmee(String nomArmee) {
		this.nomArmee = nomArmee;
	}


	public void ajoutUnite(Unite unite) {
		this.listeUnite.add(unite);
	}
	
	public void afficherArmee() {
		System.out.println("Nom de l'armée : " + nomArmee + "\n");
		System.out.println("Nombre d'unité(s) : " + listeUnite.size());
		
		for(Unite u : listeUnite) {
			u.afficherUnite();
			System.out.println("");
		}
		
	}

}
