package troupe;

import java.util.ArrayList;

import abstraction.Troupe;

import verificationRegles.VerificationEquipement;

public class TroupeTank extends Troupe{
	
	public TroupeTank(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeEquipementAutorise.add(VerificationEquipement.typeEquipement.VEHICULELOURD);
		nomTroupe = "Troupe Tank";
		typeTroupe = troupe.TANK;
	}
	

}
