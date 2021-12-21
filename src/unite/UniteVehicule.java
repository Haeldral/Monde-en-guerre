package unite;

import java.util.ArrayList;

import abstraction.Unite;
import regles.RegleEquipement;
import regles.RegleTroupe;

public class UniteVehicule extends Unite {
	
	public UniteVehicule(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeTroupeAutorise.add(RegleTroupe.typeTroupe.VEHICULE);
		nomUnite = "Unite Vehicule";
	}

}
