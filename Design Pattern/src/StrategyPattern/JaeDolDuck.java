package StrategyPattern;

public class JaeDolDuck extends Duck{
	public void display() {
		System.out.println("저는 새롭게 만들어진 오리 입니다!");
	}
	public JaeDolDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Sqeak();
	}
}
