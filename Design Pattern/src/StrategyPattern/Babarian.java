package StrategyPattern;

public class Babarian extends Hunter{
	public void display() {
		System.out.println("나는 바바리안이다!");
	}
	public Babarian() {
		weapon = new Gun();
		quackBehavior = new Sqeak();
	}
}
