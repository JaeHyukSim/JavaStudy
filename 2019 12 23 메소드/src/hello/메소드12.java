package hello;

import java.util.Scanner;

//��Ģ����
// + - * /
public class �޼ҵ�12 {
	static void calc(int a, int b, char op) {
		if(op == '+') {
			System.out.println(a + b);
		}else if(op == '-') {
			System.out.println(a - b);
		}else if(op == '*') {
			System.out.println(a * b);
		}else if(op == '/') {
			if(b != 0) {
				System.out.println(a / b);
			}else {
				System.out.println("0���� ���� �� �����ϴ�");
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		String s = scn.next();
		calc(a, b, s.charAt(0));
	}

}
