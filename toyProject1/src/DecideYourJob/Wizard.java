package DecideYourJob;

public class Wizard implements Job{
	public void display() {
		System.out.println("»ßÂ½ ¸»¶ú°í, ·ÕÄÚÆ®¿¡ ±¤´ë°¡ Æ¢¾î³ª¿Ô´Ù");
	}
	public void job() {
		System.out.println("Wizard");
	}
	/*
	 * public void weapon() { System.out.println("¿ä¼úºÀÀ» µé°íÀÖ´Ù"); }
	 */
	public void weapon(Weapon weapon) {
		if(weapon.getId().equals("Cane") || weapon.getId().equals("Wand")) {
			weapon.weapon();
		} else {
			weapon = new WeaponNoWay();
			weapon.weapon();
		}
	}
}
