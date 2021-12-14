import implementation.EquipementBazooka;
import implementation.EquipementFusil;
import implementation.EquipementPistolet;
import implementation.TroupeInfanterie;
import regles.RegleEquipementLeger;

public class Main {

	public static void main(String[] args) {
		
		// Cr�ation des r�gles
		RegleEquipementLeger r1 = new RegleEquipementLeger();
		
		
		// Cr�ation des troupes
		
		TroupeInfanterie t = new TroupeInfanterie();
		
		EquipementFusil e1 = new EquipementFusil();
		EquipementPistolet e2 = new EquipementPistolet();
		EquipementBazooka e3 = new EquipementBazooka();
		
		t.AssignerEquipement(e1);
		t.AssignerEquipement(e3);
		t.AssignerEquipement(e2);
	}

}
