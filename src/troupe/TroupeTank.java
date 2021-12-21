package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import regles.RegleEquipement;

public class TroupeTank extends Troupe{
	
	public TroupeTank(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeEquipementAutorise.add(RegleEquipement.typeEquipement.VEHICULELOURD);
		nomTroupe = "Troupe Tank";
	}
	

}
