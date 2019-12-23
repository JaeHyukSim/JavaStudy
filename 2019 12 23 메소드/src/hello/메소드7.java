package hello;

import java.util.*;
public class 메소드7 {
	//난수 발생
	static int[] getRand(int no) {
		int[] com = new int[no];
		
		int su = 0; boolean bCheck = false;
		for(int i = 0; i < no; i++) {
			bCheck = true;
			while(bCheck) {
				//난수 발생
				su = (int)(Math.random() * 9) + 1;
				bCheck = false;
				for(int j = 0; j < i; j++) {
					if(com[j] == su) {
						bCheck = true;
						break;
					}
				}
				com[i] = su;
			}
		}
		return com;
	}
	//사용자 입력
	static int[] userInput() {
		int[] user = new int[3];
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("3자리 정수 입력해봐 짜쌰");
			int input = scn.nextInt();
			if(input < 100 || input > 999) {
				System.out.println("잘못 입력했다 다시해봐 짜샤");
				continue;
			}
			for(int i = user.length-1; i >=0 ; i--) {
				user[i] = input % 10;
				input /= 10;
			}
			if(user[0] == user[1] || user[0] == user[2] ||user[1] == user[2]) {
				System.out.println("중복된 수 불가능");
				continue;
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0은 사용 불가");
				continue;
			}
			return user;
		}
	}
	//비교
	static int compare(int[] com, int[] user) {
		int s = 0, b = 0;
		System.out.print("com : ");
		for(int i = 0; i < 3; i++) {
			System.out.print(com[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == j && com[i] == user[j]) {
					s++;
				}else if(com[i] == user[j]) {
					b++;
				}
			}
		}
		
		hint(user,s,b);
		return s;
	}
	//힌트
	static void hint(int[] user, int s, int b) {
		System.out.printf("Inpt Number:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	//종료여부
	static boolean isEnd(int s) {
		boolean bCheck = false;
		
		if(s == 3) {
			bCheck = true;
		}
		return bCheck;
	}
	static void process() {
		int[] com = getRand(3);
		int[] user = new int[3];
		Scanner scn = new Scanner(System.in);
		while(true) {
			user = userInput();
			int s = compare(com, user);
			if(isEnd(s)) {
				System.out.print("종료할까? 짜샤? y / n");
				String decision = scn.next();
				if(decision.equals("y")) {
					process();
				}else {
					System.out.println("꾸우우우웉!");
					System.exit(0);
				}
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		process();
	}

}
