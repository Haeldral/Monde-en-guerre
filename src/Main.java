import implementation.EquipementBazooka;
import implementation.EquipementFusil;
import implementation.EquipementPistolet;
import implementation.TroupeInfanterie;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		// Cr�ation des r�gles
		
		
		// Cr�ation des troupes
		
		TroupeInfanterie t = new TroupeInfanterie();
		
		EquipementFusil e1 = new EquipementFusil();
		EquipementPistolet e2 = new EquipementPistolet();
		EquipementBazooka e3 = new EquipementBazooka();
		
		t.assignerEquipement(e1);
		t.assignerEquipement(e2);
		t.assignerEquipement(e3);
	}

}
