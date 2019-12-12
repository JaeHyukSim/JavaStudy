package DecideYourJob;

public abstract class User {
	
	Job job;
	
	private int id;
	private int pass;
	private String name;
	
	public void performDisplay() {
		job.display();
	}

	/*
	 * public void performWeapon() { job.weapon(); }
	 */
	public void performWeapon(Weapon weapon) {
		job.weapon(weapon);
	}
	public void performJob() {
		job.job();
	}
	
	public void setJob(Job jb) {
		job = jb;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPass() {
		return pass;
	}
	public void setPass(int pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
