



class Super{
	public void display() {
		System.out.println("Super:display() : call");
	}
}
// be extended by Super
class Sub extends Super{
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.display();
	}

}
