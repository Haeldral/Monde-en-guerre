package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import regles.RegleEquipement;

public class TroupeBazooka extends Troupe {
	
	public TroupeBazooka(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		nomTroupe = "Troupe Bazooka";
	}

}
