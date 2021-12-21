package troupe;


import java.util.ArrayList;

import abstraction.Troupe;

import verificationRegles.VerificationEquipement;

public class TroupeInfanterie extends Troupe {
	
	public TroupeInfanterie (ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeTroupe = typeTroupe.INFANTERIE;
		typeEquipementAutorise.add(VerificationEquipement.typeEquipement.LEGER);
		nomTroupe = "Troupe Infanterie";
	}
	

	
	
}