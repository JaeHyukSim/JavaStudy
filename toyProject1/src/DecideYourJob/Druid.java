package DecideYourJob;

public class Druid implements Job{
	public void display() {
		System.out.println("��ġ�� �ſ� ũ�� ������ �� ���ڸ� �����ִ� ������ ���� �԰��ִ�");
	}
	public void job() {
		System.out.println("Druid");
	}
	/*
	 * public void weapon() { System.out.println("club�� ����ִ�"); }
	 */
	public void weapon(Weapon weapon) {
		weapon.weapon();
	}
}
