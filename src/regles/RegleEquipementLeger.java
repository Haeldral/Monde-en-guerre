package regles;


import java.util.Arrays;
import abstraction.Equipement;


public class RegleEquipementLeger extends RegleEquipement {
	
	public RegleEquipementLeger() {
		Arrays.asList(equipementAutorise).add(Equipement.equipement.FUSIL);
		Arrays.asList(equipementAutorise).add(Equipement.equipement.PISTOLET);
	}
}