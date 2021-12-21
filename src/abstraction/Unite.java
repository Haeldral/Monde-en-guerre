package abstraction;

import java.util.ArrayList;

import verificationRegles.VerificationEquipement;
import verificationRegles.VerificationTroupe;

public abstract class Unite {

	protected ArrayList<Troupe> listeTroupe;
	public ArrayList<VerificationEquipement.typeEquipement> typeEquipementAutorise;
	public ArrayList<VerificationTroupe.typeTroupe> typeTroupeAutorise;
	
	protected String nomUnite;
	
	public Unite(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		
		listeTroupe = new ArrayList<Troupe>();
		typeEquipementAutorise = new ArrayList<VerificationEquipement.typeEquipement>();
		typeEquipementAutorise.addAll(equiUnite);  // On récupère les régles de l'armée choisie
		typeTroupeAutorise = new ArrayList<VerificationTroupe.typeTroupe>();
	}
	
	
	// GETTERS AND SETTERS
	public void setTypeEquipementAutorise(ArrayList<VerificationEquipement.typeEquipement> typeEquipementAutorise) {this.typeEquipementAutorise = typeEquipementAutorise;}
	public ArrayList<VerificationEquipement.typeEquipement> getTypeEquipementAutorise() {return typeEquipementAutorise;}
	public ArrayList<Troupe> getListeTroupe() {return listeTroupe;}
	public void setListeTroupe(ArrayList<Troupe> listeTroupe) {this.listeTroupe = listeTroupe;}
	public String getNomUnite() {return nomUnite;}
	public void setNomUnite(String nomUnite) {this.nomUnite = nomUnite;}
	public void ajouterTroupe(Troupe t) {this.listeTroupe.add(t);}
	
	
	// Méthode qui vérifie si la troupe choisie est autorisée dans l'unité
	public boolean verifierTroupe(Troupe troupe) {
		try {
			// Test de chaque règle de troupe
			for(VerificationTroupe.typeTroupe typeTr : this.typeTroupeAutorise) {
				if (VerificationTroupe.verifierTroupe(troupe, typeTr)) {
					System.out.println(troupe.typeTroupe.toString()+" autorisée");
					return  true;
				}
			}
			
			System.out.println("Troupe " + troupe.typeTroupe.toString() +"  interdite pour cette unité");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
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
