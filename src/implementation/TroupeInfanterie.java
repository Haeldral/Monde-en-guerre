package implementation;

import abstraction.Equipement;
import abstraction.Troupe;
import regles.RegleEquipementLeger;


public class TroupeInfanterie extends Troupe {
	
	
	public TroupeInfanterie() {
		
	}

	public void AssignerEquipement(Equipement equ) {
		
		RegleEquipementLeger.AssignerEquipement(equ);

	}
	
}