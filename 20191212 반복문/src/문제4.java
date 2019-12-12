
//1 - 2 + 3 - 4 + 5 - 6 + ...
public class ¹®Á¦4 {

	public static void main(String[] args) {
		int head = 1;
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			System.out.print(i * head + " ");
			sum += head * i;
			head *= -1;
		}
		System.out.println();
		System.out.println("sum : " + sum);
		
		for(int i = 1; i <= 4; i++) {
			System.out.print("¢¼ ¢¾ ¢À ¢Â ");
		}
	}

}
