package abstraction;



public abstract class Equipement {
	
	public enum equipement {
		FUSIL,
		PISTOLET,
		BAZOOKA,
		MITRAILLEUSE,
		CANON,
		CARBURANT
	}
	
	public equipement typeEquipement;
	
	protected String nomEquipement;
	
	public Equipement() {
		
	}
	
	public void afficherEquipement() {
		System.out.println("Nom de l'équipement : " + nomEquipement );
	}
	
	
}
