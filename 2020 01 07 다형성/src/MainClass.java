
//Overloding

class Calc{
	public void display(int a) {
		System.out.println("a : " + a);
	}
	public void display(int a, int b, int c) {
		System.out.println("display(int a, int b, int c) call");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc c = new Calc();
		c.display('A');
		c.display(50);
		c.display(1, 2, 3);
	}

}
