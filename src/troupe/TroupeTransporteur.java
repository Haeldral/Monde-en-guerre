package troupe;

import java.util.ArrayList;

import abstraction.Troupe;
import regles.RegleEquipement;

public class TroupeTransporteur extends Troupe {
	
	public TroupeTransporteur(ArrayList<RegleEquipement.typeEquipement> equiUnite) {
		super(equiUnite);
		nomTroupe = "Troupe Transporteur";
	}

}
