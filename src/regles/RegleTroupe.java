package regles;

import java.util.LinkedList;

import abstraction.Equipement;
import abstraction.Troupe;
import regles.RegleEquipement.typeEquipement;

public abstract class RegleTroupe {
	
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

	


