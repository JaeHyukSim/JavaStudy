package DecideYourJob;

public class Xiamen implements Job{
	public void display() {
		System.out.println("���� ������ �Ƹ޸�ĭ ���� ���� �԰� �ľ���");
	}
	public void job() {
		System.out.println("Xiamen");
	}
	/*
	 * public void weapon() { System.out.println("�����̸� ��� �ִ�"); }
	 */
	public void weapon(Weapon weapon) {
		weapon.weapon();
	}
}
