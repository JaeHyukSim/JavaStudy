import java.util.Scanner;

public class 배열 {

	public static void makeArr(int x, int[] arr) {
		for(int i = 0; i < 3; i++) {
			arr[2-i] = x % 10;
			x /= 10;
		}
	}
	public static boolean check(int[] arr) {
		for(int i = 0; i < 2; i++) {
			for(int j = i+1; j < 3; j++) {
				if(arr[i] == arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	public static int strike(int[] user, int[] com) {
		int num = 0;
		for(int i = 0; i < 3; i++) {
			if(user[i] == com[i]) {
				num++;
			}
		}
		return num;
	}
	public static int ball(int[] user, int[] com) {
		int num = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j) {
					continue;
				}
				if(user[i] == com[j]) {
					num++;
				}
			}
		}
		return num;
	}
	public static void main(String[] args) {
		
		int com = 0;
		int user;
		int strike, ball;
		int[] inCom = new int[3];
		int[] inUser = new int[3];
		boolean suc = false;
		
		while(suc == false) {
			com = (int)(Math.random() * 900) + 100;
			makeArr(com, inCom);
			if(check(inCom) == true) {
				suc = true;
			}
		}
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
			strike = 0; ball = 0;
			
			System.out.print("수를 입력해라 : ");
			user = scn.nextInt();
			if(user < 100 || user >= 1000) {
				System.out.println("잘못된 입력. 다시 입력하시오");
				continue;
			}
			makeArr(user, inUser);
			strike = strike(inUser, inCom);
			ball = ball(inUser, inCom);
			
			System.out.print("S:");
			for(int i = 0; i < strike; i++) {
				System.out.print("●");
			}
			System.out.println();
			System.out.print("B:");
			for(int i = 0; i < ball; i++) {
				System.out.print("○");
			}
			System.out.println();
			if(strike == 3) {
				System.out.println("정답!" + com);
				break;
			}
		}
		
		
	}

}
