package DecideYourJob;

public class Wand implements Weapon{
	@Override
	public void weapon() {
		System.out.println("������� �����");
	}
	public String getId() {
		return "Wand";
	}
}
