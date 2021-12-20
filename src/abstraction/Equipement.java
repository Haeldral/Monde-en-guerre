package abstraction;

//import regles.RegleEquipementLeger.equipementAutorise;

public abstract class Equipement {
	
	public enum equipement {
		FUSIL,
		PISTOLET,
		BAZOOKA
	}
	//public equipementAutorise type = equipementAutorise.FUSIL;
	public equipement type;
	
	protected String nomEquipement;
	
	public Equipement() {
		
	}
	
	public void afficherEquipement() {
		System.out.println("Nom de l'equipement : " + nomEquipement );
	}
	
	
}
