package StrategyPattern;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("저는 날 수 없습니다... 하핫");
	}
}
