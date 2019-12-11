package DecideYourJob;

public class Xiamen implements Job{
	public void display() {
		System.out.println("목이 굽었고 아메리칸 전통 옷을 입고 늙었다");
	}
	public void job() {
		System.out.println("Xiamen");
	}
	/*
	 * public void weapon() { System.out.println("지팡이를 들고 있다"); }
	 */
	public void weapon(Weapon weapon) {
		weapon.weapon();
	}
}
