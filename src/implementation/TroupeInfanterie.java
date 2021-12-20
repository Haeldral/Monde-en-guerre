package implementation;


import abstraction.Troupe;
import regles.Regle;


public class TroupeInfanterie extends Troupe {
	
	public TroupeInfanterie () {
		typeEquipementAutorise = Regle.typeEquipement.LEGER;
		nomTroupe = "Troupe Infanterie";
	}
	

	
	
}