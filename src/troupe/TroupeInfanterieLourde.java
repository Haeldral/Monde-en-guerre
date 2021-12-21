package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import verificationRegles.VerificationEquipement;
import verificationRegles.VerificationEquipement.typeEquipement;

public class TroupeInfanterieLourde extends Troupe{

	public TroupeInfanterieLourde(ArrayList<VerificationEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeTroupe = typeTroupe.INFANTERIELOURDE;
		typeEquipementAutorise.add(VerificationEquipement.typeEquipement.LOURD);
		nomTroupe = "Troupe Infanterie Lourde";
	}

}
