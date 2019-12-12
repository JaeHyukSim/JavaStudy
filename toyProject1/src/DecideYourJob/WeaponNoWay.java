package DecideYourJob;

public class WeaponNoWay implements Weapon{
	public void weapon() {
		System.out.println("아무 일도 일어나지 않았다");
	}
	public String getId() {
		return "WeaponNoWay";
	}
}
