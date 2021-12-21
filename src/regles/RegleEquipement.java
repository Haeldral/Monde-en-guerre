package regles;

import java.util.Arrays;
import java.util.LinkedList;

import abstraction.Equipement;


public abstract class RegleEquipement {
	
	public enum typeEquipement {
		LEGER,
		LOURD,
		VEHICULELOURD,
		CEQUETUVEUX
	}
	
	public static boolean verifierEquipement(Equipement equ, typeEquipement type) throws Exception { 
		
		LinkedList<Equipement.equipement> listeEquipement = new LinkedList<Equipement.equipement>();
		
		switch (type) {
		case LEGER:
			listeEquipement.add(Equipement.equipement.FUSIL);
			listeEquipement.add(Equipement.equipement.PISTOLET);
			
			break;
		case LOURD:
			listeEquipement.add(Equipement.equipement.BAZOOKA);
			break;
		case CEQUETUVEUX:
			break;
		default:
			throw new Exception("Erreur type d'équipement non déclaré");
		}
		
		if (listeEquipement.contains(equ.typeEquipement)) {
			return true;
		}else {
			return false;
		}
	}

}
