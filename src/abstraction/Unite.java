package abstraction;

import java.util.ArrayList;

import regles.Regle;

public abstract class Unite {

	protected ArrayList<Troupe> listeTroupe;
	protected String nomUnite;
	
	public Unite() {
		
		listeTroupe = new ArrayList<Troupe>();
	}
	
	
	
	public ArrayList<Troupe> getListeTroupe() {
		return listeTroupe;
	}



	public void setListeTroupe(ArrayList<Troupe> listeTroupe) {
		this.listeTroupe = listeTroupe;
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
