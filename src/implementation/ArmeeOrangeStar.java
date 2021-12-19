package implementation;

import java.util.ArrayList;

import abstraction.Armee;
import abstraction.Troupe;
import abstraction.Unite;
import regles.Regle;

public class ArmeeOrangeStar extends Armee {
	
	
	
	public ArmeeOrangeStar() {
		super();
		nomArmee = "Armée Orange Star";
		
	}
	
	public void ajouterUnite(Unite unite) {
		if(verifierRegle())
			listeUnite.add(unite);
		else
			System.err.println("Unite non ajoute, cette arme ne peut pas avoir ce type d'unite");
		
	}
	
	public boolean verifierRegle() {
		return false;
	}

	
	
	
	
	

}
