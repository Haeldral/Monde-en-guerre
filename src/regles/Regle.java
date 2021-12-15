package regles;

import java.util.Arrays;
import java.util.LinkedList;
import java.lang.reflect.*;
import abstraction.Equipement;

public class Regle {
	
	public enum typeEquipement {
		LEGER,
		LOURD,
		CEQUETUVEUX
	}
	
	public static boolean assignerEquipement(Equipement equ, typeEquipement type) throws Exception { 
		
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
			throw new Exception("Erreur type d'�quipement non d�clar�");
		}
		
		if (listeEquipement.contains(equ.type)) {
			System.out.println("ok");
			return true;
		}else {
			System.out.println("�quipement interdit");
			return false;
		}
	}

}



/*
package regles;

import java.util.Arrays;
import java.lang.reflect.*;
import abstraction.Equipement;

public interface Regle {
	
	
	public static <T> boolean assignerEquipement(Equipement equ, Class<T> nomClasse) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Field attribut = nomClasse.getDeclaredField("equipementAutorise");
		
		for(Equipement.equipement e:(Arrays)attribut.get(Equipement.equipement[].class)){
			System.out.println(e.name);
		}
		
		
		if (Arrays.asList(attribut.get(Equipement.equipement[].class)).contains(equ.type)) {
			System.out.println("ok");
			return true;
		}else {
			System.out.println("�quipement interdit");
			return false;
		}
	}

}
*/