package unite;

import java.util.ArrayList;

import abstraction.Unite;
import regles.RegleEquipement;

public class UniteVehicule extends Unite {
	
	public UniteVehicule(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		nomUnite = "Unite Vehicule";
	}

}
