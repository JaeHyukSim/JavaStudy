package StrategyPattern;

public abstract class Hunter {
	
	Weapon weapon;
	QuackBehavior quackBehavior;
	
	public abstract void display();
	public void wear() {
		System.out.println("호피무늬 촌스러운 옷을 입고 있습니다");
	}
	public void performWeapon() {
		weapon.weapon();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
}
