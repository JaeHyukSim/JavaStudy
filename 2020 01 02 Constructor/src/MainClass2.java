
class MyData{
	int[] arr=new int[6];
	{
		for(int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyData m1 = new MyData();
		for(int i = 0; i < 6; i++) {
			System.out.print(m1.arr[i] + " ");
		}
		System.out.println();
		MyData m2 = new MyData();
		for(int i = 0; i < 6; i++) {
			System.out.print(m2.arr[i] + " ");
		}
	}

}
