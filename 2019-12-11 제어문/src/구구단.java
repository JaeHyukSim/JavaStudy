import java.util.Scanner;

//������ => dan�� �Է� �޾Ƽ� 
public class ������ {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�� �Է�:");
		int dan = scn.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
			i++;
		}

	}

}
