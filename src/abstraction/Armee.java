package abstraction;

import java.util.ArrayList;

import regles.Regle;

public abstract class Armee {
	
	protected ArrayList<Regle> listeRegle;
	protected ArrayList<Unite> listeUnite;
	protected String nomArmee;
	
	public Armee() {
		listeRegle = new ArrayList<Regle>();
		listeUnite = new ArrayList<Unite>();
	}

	public ArrayList<Regle> getListeRegleArmee() {
		return listeRegle;
	}

	public void setListeRegleArmee(ArrayList<Regle> listeRegleArmee) {
		this.listeRegle = listeRegleArmee;
	}

	public ArrayList<Unite> getListeUnite() {
		return listeUnite;
	}

	public void setListeUnite(ArrayList<Unite> listeTroupe) {
		this.listeUnite = listeTroupe;
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
