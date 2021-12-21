package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import verificationRegles.VerificationEquipement;

public class TroupeTransporteur extends Troupe {
	
	public TroupeTransporteur(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeEquipementAutorise.add(VerificationEquipement.typeEquipement.VEHICULE);
		nomTroupe = "Troupe Transporteur";
		typeTroupe = troupe.TRANSPORTEUR;
	}

}
