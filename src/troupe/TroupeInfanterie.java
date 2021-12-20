package troupe;


import java.util.ArrayList;

import abstraction.Troupe;
import regles.*;



public class TroupeInfanterie extends Troupe {
	
	public TroupeInfanterie (ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeEquipementAutorise.add(RegleEquipement.typeEquipement.LEGER);
		nomTroupe = "Troupe Infanterie";
	}
	

	
	
}