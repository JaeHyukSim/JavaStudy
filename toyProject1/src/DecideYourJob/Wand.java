package DecideYourJob;

public class Wand implements Weapon{
	@Override
	public void weapon() {
		System.out.println("요술봉을 들었다");
	}
	public String getId() {
		return "Wand";
	}
}
