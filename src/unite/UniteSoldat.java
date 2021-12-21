package unite;

import java.util.ArrayList;

import abstraction.Unite;
import regles.RegleEquipement;
import regles.RegleTroupe;

public class UniteSoldat extends Unite {
	
	public UniteSoldat(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		typeTroupeAutorise.add(RegleTroupe.typeTroupe.SOLDAT);
		nomUnite = "Unite Soldat";
		System.out.println("Constructeur fini");
	}

}
