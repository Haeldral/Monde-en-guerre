package abstraction;

import java.util.ArrayList;

import verificationRegles.VerificationEquipement;

public abstract class Armee {
	
	protected ArrayList<Unite> listeUnite;
	public  ArrayList<VerificationEquipement.typeEquipement> typeEquipementAutorise;
	protected String nomArmee;
	
	public Armee() {
		listeUnite = new ArrayList<Unite>();
		typeEquipementAutorise = new ArrayList<VerificationEquipement.typeEquipement>();
	}
	
	
	public ArrayList<Unite> getListeUnite() {
		return listeUnite;
	}


	public void setListeUnite(ArrayList<Unite> listeUnite) {
		this.listeUnite = listeUnite;
	}
	

	public  ArrayList<VerificationEquipement.typeEquipement> getTypeEquipementAutorise() {
		return typeEquipementAutorise;
	}


	public  void setTypeEquipementAutorise(ArrayList<VerificationEquipement.typeEquipement> typeEquipementAutorise) {
		this.typeEquipementAutorise = typeEquipementAutorise;
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
