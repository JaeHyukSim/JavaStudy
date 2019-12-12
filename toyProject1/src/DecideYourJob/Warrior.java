package DecideYourJob;

public class Warrior implements Job{
	
	public void display() {
		System.out.println("¼ö¿°ÀÌ ´þ¼ö·èÇÏ°í, ±ÙÀ°Áú¿¡ ´Ä¾ú´Ù");
	}

	/*
	 * public void weapon() { System.out.println("µµ³¢¸¦ µç´Ù"); }
	 */
	public void job() {
		System.out.println("Warrior");
	}
	
	public void weapon(Weapon weapon) {
		if(weapon.getId().equals("Knife") || weapon.getId().equals("Ax")) {
			weapon.weapon();
		} else {
			weapon = new WeaponNoWay();
			weapon.weapon();
		}
	}
}
