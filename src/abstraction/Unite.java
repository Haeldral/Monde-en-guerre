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
	
	public void assignerTroupe(Troupe troupe) {

		boolean autorisation = false;

		try {
			// Test de chaque règle d'équipment
			for(RegleTroupe.typeTroupe typeTr : typeTroupeAutorise) {
				if (RegleTroupe.verifierTroupe(troupe, typeTr))
					autorisation = true;
			}
			 // A CHANGER, pas le mm ordre que equipement
			/*// Assignation
			if (autorisation) {
				System.out.println(troupe.typeTroupe.toString()+" ajouté");
				listeTroupe.add(troupe);
			}else {
				System.out.println("équipement interdit");
			}*/


		} catch (Exception e) {
			e.printStackTrace();
		}

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
