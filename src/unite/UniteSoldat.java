package unite;

import java.util.ArrayList;

import abstraction.Unite;
import verificationRegles.VerificationEquipement;
import verificationRegles.VerificationTroupe;

public class UniteSoldat extends Unite {
	
	public UniteSoldat(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeTroupeAutorise.add(VerificationTroupe.typeTroupe.SOLDAT);
		nomUnite = "Unite Soldat";
		
	}

}
