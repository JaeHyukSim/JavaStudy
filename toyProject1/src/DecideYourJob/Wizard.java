package DecideYourJob;

public class Wizard implements Job{
	public void display() {
		System.out.println("��½ ������, ����Ʈ�� ���밡 Ƣ��Դ�");
	}
	public void job() {
		System.out.println("Wizard");
	}
	/*
	 * public void weapon() { System.out.println("������� ����ִ�"); }
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
