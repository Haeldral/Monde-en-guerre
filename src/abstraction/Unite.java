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
		typeEquipementAutorise.addAll(equiUnite);  // On r�cup�re les r�gles de l'arm�e choisie
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
	
	
	// M�thode qui v�rifie si la troupe choisie est autoris�e dans l'unit�
	public boolean verifierTroupe(Troupe troupe) {
		try {
			// Test de chaque r�gle de troupe
			for(VerificationTroupe.typeTroupe typeTr : this.typeTroupeAutorise) {
				if (VerificationTroupe.verifierTroupe(troupe, typeTr)) {
					System.out.println(troupe.typeTroupe.toString()+" autoris�e");
					return  true;
				}
			}
			
			System.out.println("Troupe " + troupe.typeTroupe.toString() +"  interdite pour cette unit�");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}
	
	public void afficherUnite() {
		System.out.println("Nom de l'unit� : " + nomUnite+ "\n");
		System.out.println("Nombre de troupe(s) : " + listeTroupe.size());
		for(Troupe t : listeTroupe) {
			t.afficherTroupe();
			System.out.println("");
		}
	}

}
