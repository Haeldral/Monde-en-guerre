package abstraction;

import java.util.ArrayList;

import regles.Regle;

public abstract class Unite {
	
	protected ArrayList<Regle> listeRegle;
	protected ArrayList<Troupe> listeTroupe;
	protected String nomUnite;
	
	public Unite() {
		listeRegle = new ArrayList<Regle>();
		listeTroupe = new ArrayList<Troupe>();
	}

	public ArrayList<Regle> getListeRegleArmee() {
		return listeRegle;
	}

	public void setListeRegleArmee(ArrayList<Regle> listeRegleArmee) {
		this.listeRegle = listeRegleArmee;
	}

	public ArrayList<Troupe> getListeTroupe() {
		return listeTroupe;
	}

	public void setListeTroupe(ArrayList<Troupe> listeTroupe) {
		this.listeTroupe = listeTroupe;
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
