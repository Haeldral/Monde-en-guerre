package regles;

import java.util.LinkedList;

import abstraction.Equipement;
import abstraction.Troupe;
import regles.RegleEquipement.typeEquipement;

public class RegleTroupe {
	
	public enum typeTroupe {
		VEHICULE,
		LOURD,
		CEQUETUVEUX
	}
	
	public static boolean verifierTroupe(Troupe trou, typeTroupe type) throws Exception { 
		
		LinkedList<Troupe.troupe> listeTroupe = new LinkedList<Troupe.troupe>();
		
		switch (type) {
		case VEHICULE:
			listeTroupe.add(Troupe.troupe.TRANSPORTEUR);
			listeTroupe.add(Troupe.troupe.TANK);
			
			break;
		case LOURD:
			//listeTroupe.add(Equipement.equipement.BAZOOKA);
			break;
		case CEQUETUVEUX:
			break;
		default:
			throw new Exception("Erreur type de troupe non déclaré");
		}
		
		if (listeTroupe.contains(trou.typeTroupe)) {
			return true;
		}else {
			return false;
		}
	}

}

	


