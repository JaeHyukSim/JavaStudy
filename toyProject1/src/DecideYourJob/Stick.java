package DecideYourJob;

public class Stick implements Weapon{
	public void weapon() {
		System.out.println("나뭇가지를 들고있다");
	}
	public String getId() {
		return "Stick";
	}
}
