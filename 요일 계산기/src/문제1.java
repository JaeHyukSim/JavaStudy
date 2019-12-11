import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		//정수 두개와 연산자를 받아서 사칙연산
		//첫번째 정수 입력 : 10
		//두번째 정수 입력 : 20
		//연산자 입력 : +
		//=>결과값 : "10 + 20 = 30이다" (*,/,- 도 마저 구현)
		
		Scanner scn = new Scanner(System.in);
		
		char op;
		int first, second;
		
		System.out.print("첫번째 정수 입력:");
		first = scn.nextInt();
		System.out.print("두번째 정수 입력:");
		second = scn.nextInt();
		System.out.print("연산자 입력:");
		op = scn.next().charAt(0);	//char만 받을 수는 없다
		//연산 시작
		double res = 0;
		if(op == '+') {
			res = first + second;
		}if(op == '-') {
			res = first - second;
		}if(op == '*') {
			res = first * second;
		}if (op == '/'){
			if(second == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			} else {
				res = (double)first / second;
			}
		}
		
		System.out.println(first + "" + op + second + " : " + res + "입니다.");
	}

}
