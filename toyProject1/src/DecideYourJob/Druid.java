package DecideYourJob;

public class Druid implements Job{
	public void display() {
		System.out.println("덩치가 매우 크고 나무로 된 모자를 쓰고있다 누더기 옷을 입고있다");
	}
	public void job() {
		System.out.println("Druid");
	}
	/*
	 * public void weapon() { System.out.println("club을 들고있다"); }
	 */
	public void weapon(Weapon weapon) {
		weapon.weapon();
	}
}
