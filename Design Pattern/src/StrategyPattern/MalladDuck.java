package StrategyPattern;

public class MalladDuck extends Duck{
	public void display() {
		System.out.println("저는 Mallard Duck 입니다!");
	}
	public MalladDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}
