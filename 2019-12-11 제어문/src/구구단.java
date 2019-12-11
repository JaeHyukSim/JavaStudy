import java.util.Scanner;

//구구단 => dan을 입력 받아서 
public class 구구단 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("단 입력:");
		int dan = scn.nextInt();
		
		int i = 1;
		while(i <= 9) {
			System.out.printf("%2d * %2d = %2d\n",dan,i,dan*i);
			i++;
		}

	}

}
