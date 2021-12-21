package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import abstraction.Troupe.troupe;
import regles.RegleEquipement;

public class TroupeBazooka extends Troupe {
	
	public TroupeBazooka(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		nomTroupe = "Troupe Bazooka";
		typeTroupe = troupe.BAZOOKA;
	}

}
