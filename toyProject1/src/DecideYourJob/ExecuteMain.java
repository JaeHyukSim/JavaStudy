package DecideYourJob;

public class ExecuteMain {

	public static void main(String[] args) {
		User warrior = new Player(11, 123, "Player1");
		warrior.setJob(new Warrior());
		warrior.performWeapon(new Wand());
		warrior.performDisplay();
		warrior.performJob();
		//warrior.performWeapon();
		
		User wizard = new Player(12, 124, "Player2");
		wizard.setJob(new Wizard());
		wizard.performWeapon(new Wand());
		wizard.performDisplay();
		wizard.performJob();
		//wizard.performWeapon();
		
		System.out.println("Warrior to Wizard : Job change");
		warrior.setJob(new Wizard());
		warrior.performDisplay();
		warrior.performJob();
		//warrior.performWeapon();
	}

}
