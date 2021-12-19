package abstraction;

import java.util.ArrayList;

import regles.Regle;

//import regles.RegleEquipementLeger.equipementAutorise;

public abstract class Equipement {
	
	protected ArrayList<Regle> listeRegle;
	protected String nomEquipement;
	
	public  Equipement() {
		// TODO Auto-generated constructor stub
		listeRegle = new ArrayList<Regle>();
	}

	
	public void afficherEquipement() {
		System.out.println("Nom de l'equipement : " + nomEquipement );
	}
	
	/*public enum equipement {
	FUSIL,
	PISTOLET,
	BAZOOKA
}
//public equipementAutorise type = equipementAutorise.FUSIL;
public equipement type;*/
	
	
}
