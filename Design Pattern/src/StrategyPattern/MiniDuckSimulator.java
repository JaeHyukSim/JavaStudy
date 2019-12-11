/*
 * 구현 내용.
 *   1. 오리를 구현한다
 *   2. 모든 오리는 기본적으로 swim, display(각각이 모두 다르다)을 가지고 있다
 *   3. 자주 변하는 기능으로는 fly()와 quack()가 있다.
 *   4. 각 기능들을 재사용할 수 있도록 strategy pattern을 설계한다.
 */

package StrategyPattern;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MalladDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
		
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.swim();
		
		Duck jaeDuck = new JaeDolDuck();
		jaeDuck.display();
		jaeDuck.performFly();
		jaeDuck.performQuack();
		jaeDuck.swim();
		
		Hunter babarian = new Babarian();
		babarian.display();
		babarian.wear();
		babarian.performQuack();
		babarian.performWeapon();
		
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
		mallard.swim();
	}

}
