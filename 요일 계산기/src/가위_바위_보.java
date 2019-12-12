import java.util.Scanner;

public class 가위_바위_보 {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3);
		
		if(com == 0) {
			System.out.println("가위");
		} else if(com == 1) {
			System.out.println("바위");
		} else {
			System.out.println("보");
		}
		
		System.out.println("가위, 바위, 보(1,2,3) :");
		Scanner scn = new Scanner(System.in);
		
		String[] hand = new String[] {"가위", "바위", "보"};
		
		int you = scn.nextInt()-1;
		System.out.println("너 : " + hand[you] + " , 컴 : " + hand[com]);
		
		if(com == you) {
			System.out.println("무승부");
		} else if(com - you == 1 || com - you == -2) {
			System.out.println("컴 승");
		} else {
			System.out.println("너 승");
		}
	}

}
