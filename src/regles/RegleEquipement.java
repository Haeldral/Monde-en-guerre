package regles;

import java.util.Arrays;

import abstraction.Equipement;

public abstract class RegleEquipement implements Regle {

	
	public static Equipement.equipement equipementAutorise[];
	
	public static void AssignerEquipement(Equipement equ) {
		if (Arrays.asList(equipementAutorise).contains(equ.type)) {
			System.out.println("ok");
		}else {
			System.out.println("équipement interdit");
		}
	}
}
