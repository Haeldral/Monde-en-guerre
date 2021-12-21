package abstraction;

import java.util.ArrayList;

import regles.Regle;
import regles.RegleEquipement;
import regles.RegleTroupe;

public abstract class Unite {

	protected ArrayList<Troupe> listeTroupe;
	public static ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise;
	public static ArrayList<RegleTroupe.typeTroupe> typeTroupeAutorise;
	
	protected String nomUnite;
	
	public Unite(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		
		listeTroupe = new ArrayList<Troupe>();
		typeEquipementAutorise = new ArrayList<RegleEquipement.typeEquipement>();
		typeEquipementAutorise.addAll(equiUnite);
		typeTroupeAutorise = new ArrayList<RegleTroupe.typeTroupe>();
	}
	
	
	// GETTERS AND SETTERS
	public static void setTypeEquipementAutorise(ArrayList<RegleEquipement.typeEquipement> typeEquipementAutorise) {Unite.typeEquipementAutorise = typeEquipementAutorise;}
	public static ArrayList<RegleEquipement.typeEquipement> getTypeEquipementAutorise() {return typeEquipementAutorise;}
	public ArrayList<Troupe> getListeTroupe() {return listeTroupe;}
	public void setListeTroupe(ArrayList<Troupe> listeTroupe) {this.listeTroupe = listeTroupe;}
	
	
	public String getNomUnite() {return nomUnite;}
	public void setNomUnite(String nomUnite) {this.nomUnite = nomUnite;}
	public void ajouterTroupe(Troupe t) {this.listeTroupe.add(t);}
	
	
	
	public boolean verifierTroupe(Troupe troupe) {

		boolean autorisation = false;
	

		try {
			// Test de chaque r�gle d'�quipement
			for(RegleTroupe.typeTroupe typeTr : typeTroupeAutorise) {
				if (RegleTroupe.verifierTroupe(troupe, typeTr))
					autorisation = true;
			}
			 // A CHANGER, pas le mm ordre que equipement
			// Assignation
			if (autorisation) {
				System.out.println(troupe.typeTroupe.toString()+" autoris�e");
				
			}else {
				System.out.println("Troupe " + troupe.typeTroupe.toString() +"  interdite pour cette unit�");
			}


		} catch (Exception e) {
			e.printStackTrace();
		}
		return autorisation;

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
