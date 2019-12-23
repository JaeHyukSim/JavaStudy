package hello;

import java.util.*;
public class �޼ҵ�7 {
	//���� �߻�
	static int[] getRand(int no) {
		int[] com = new int[no];
		
		int su = 0; boolean bCheck = false;
		for(int i = 0; i < no; i++) {
			bCheck = true;
			while(bCheck) {
				//���� �߻�
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
	//����� �Է�
	static int[] userInput() {
		int[] user = new int[3];
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("3�ڸ� ���� �Է��غ� ¥�X");
			int input = scn.nextInt();
			if(input < 100 || input > 999) {
				System.out.println("�߸� �Է��ߴ� �ٽ��غ� ¥��");
				continue;
			}
			for(int i = user.length-1; i >=0 ; i--) {
				user[i] = input % 10;
				input /= 10;
			}
			if(user[0] == user[1] || user[0] == user[2] ||user[1] == user[2]) {
				System.out.println("�ߺ��� �� �Ұ���");
				continue;
			}
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				System.out.println("0�� ��� �Ұ�");
				continue;
			}
			return user;
		}
	}
	//��
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
	//��Ʈ
	static void hint(int[] user, int s, int b) {
		System.out.printf("Inpt Number:%d%d%d,Result:%dS-%dB\n",
				user[0],user[1],user[2],s,b);
	}
	//���Ῡ��
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
				System.out.print("�����ұ�? ¥��? y / n");
				String decision = scn.next();
				if(decision.equals("y")) {
					process();
				}else {
					System.out.println("�ٿ���W!");
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
