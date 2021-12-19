package implementation;

import java.util.LinkedList;

import abstraction.Equipement;
import abstraction.Troupe;
import regles.Regle;


public class TroupeInfanterie extends Troupe {
	
	public TroupeInfanterie() {
		super();
		nomTroupe = "Infanterie";
		
	}
	
	/*private LinkedList<Equipement> equipementInfanterie = new LinkedList<Equipement>(); 
	public static Regle.typeEquipement typeEquipementAutorise = Regle.typeEquipement.LEGER;

	/*public void assignerEquipement(Equipement equipement) {
		
		try {
			if (Regle.assignerEquipement(equipement, typeEquipementAutorise)) {
				System.out.println(equipement.type.toString()+" ajouté");
				equipementInfanterie.add(equipement);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}*/
	
}