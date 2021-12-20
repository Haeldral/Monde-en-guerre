package regles;

import java.util.Arrays;
import java.util.LinkedList;

import abstraction.Equipement;


public abstract class RegleEquipement {
	
	public enum typeEquipement {
		LEGER,
		LOURD,
		CEQUETUVEUX
	}
	
	public static boolean verifierEquipement(Equipement equ, typeEquipement type) throws Exception { 
		System.out.println("print a la con");
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
		System.out.println("print n2");
		if (listeEquipement.contains(equ.type)) {
			System.out.println("ok");
			return true;
		}else {
			
			return false;
		}
	}

}
