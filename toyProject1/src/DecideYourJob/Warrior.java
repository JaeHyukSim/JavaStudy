package DecideYourJob;

public class Warrior implements Job{
	
	public void display() {
		System.out.println("������ �������ϰ�, �������� �ľ���");
	}

	/*
	 * public void weapon() { System.out.println("������ ���"); }
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
