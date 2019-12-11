package StrategyPattern;

public class RubberDuck extends Duck{
	public  void display() {
		System.out.println("저는 고무 오리 입니당~~~ ㅎㅎ");
	}
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Sqeak();
	}
}
