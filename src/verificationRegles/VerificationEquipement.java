package verificationRegles;

import java.util.LinkedList;
import abstraction.Equipement;


public abstract class VerificationEquipement {
	
	public enum typeEquipement {
		LEGER,
		EQUIPEMENTBAZOOKA,
		LOURD,
		EQUIPEMENTCARBURANT,
		CANON,
		EQUIPEMENTCAISSES
	}
	
	public static boolean verifierEquipement(Equipement equ, typeEquipement type) throws Exception { 
		
		LinkedList<Equipement.equipement> listeEquipement = new LinkedList<Equipement.equipement>();
		
		switch (type) {
		case LEGER:
			listeEquipement.add(Equipement.equipement.FUSIL);
			listeEquipement.add(Equipement.equipement.PISTOLET);
			break;
		case EQUIPEMENTBAZOOKA:
			listeEquipement.add(Equipement.equipement.BAZOOKA);
			break;
		case LOURD:
			listeEquipement.add(Equipement.equipement.MITRAILLEUSE);
			listeEquipement.add(Equipement.equipement.MORTIER);
			break;
		case EQUIPEMENTCARBURANT:
			listeEquipement.add(Equipement.equipement.CARBURANT);
			break;
		case EQUIPEMENTCAISSES:
			listeEquipement.add(Equipement.equipement.CAISSESDERAVITAILLEMENT);
			break;
		case CANON:
			listeEquipement.add(Equipement.equipement.CANON);
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
