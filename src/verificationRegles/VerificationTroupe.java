package verificationRegles;

import java.util.LinkedList;
import abstraction.Troupe;

public abstract class VerificationTroupe {
	
	public enum typeTroupe {
		SOLDAT,
		VEHICULE
	}
	
	public static boolean verifierTroupe(Troupe troupe, typeTroupe type) throws Exception { 
		
		LinkedList<Troupe.troupe> listeTroupe = new LinkedList<Troupe.troupe>();
		
		switch (type) {
		case SOLDAT:
			listeTroupe.add(Troupe.troupe.INFANTERIE);
			listeTroupe.add(Troupe.troupe.BAZOOKA);
			listeTroupe.add(Troupe.troupe.INFANTERIELOURDE);
		case VEHICULE:
			listeTroupe.add(Troupe.troupe.TRANSPORTEUR);
			listeTroupe.add(Troupe.troupe.TANK);
			break;
		default:
			throw new Exception("Erreur type de troupe non déclaré");
		}
		
		if (listeTroupe.contains(troupe.typeTroupe)) {
			return true;
		}else {
			return false;
		}
	}

}

	


