package implementation;

import java.util.ArrayList;

import abstraction.Unite;
import regles.RegleEquipement;

public class UniteSoldat extends Unite {
	
	public UniteSoldat(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		nomUnite = "Unite Soldat";
	}

}
