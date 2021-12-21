package unite;

import java.util.ArrayList;

import abstraction.Unite;
import verificationRegles.VerificationEquipement;
import verificationRegles.VerificationTroupe;

public class UniteVehicule extends Unite {
	
	public UniteVehicule(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeTroupeAutorise.add(VerificationTroupe.typeTroupe.VEHICULE);
		nomUnite = "Unite Vehicule";
	}

}
