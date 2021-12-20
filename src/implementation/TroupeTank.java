package implementation;

import java.util.ArrayList;

import abstraction.Troupe;
import regles.RegleEquipement;

public class TroupeTank extends Troupe{
	
	public TroupeTank(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		nomTroupe = "Troupe Tank";
	}
	

}
