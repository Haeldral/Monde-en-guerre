package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import verificationRegles.VerificationEquipement;

public class TroupeBazooka extends Troupe {
	
	public TroupeBazooka(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeEquipementAutorise.add(VerificationEquipement.typeEquipement.BAZOOKA);
		nomTroupe = "Troupe Bazooka";
		typeTroupe = troupe.BAZOOKA;
	}

}
