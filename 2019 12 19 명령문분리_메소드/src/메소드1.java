import java.util.Scanner;

/*
 * 객체지향 -- 메소드
 * 			자바(객체지향 => 클래스) : 클래스 구성 요소 ( 변수, 메소드 )
 * 											  =============
 * 											   연산자 + 제어문
 */
public class 메소드1 {

	static double div(int a, int b) {
		return a / (double)b;
	}
	static int add(int a, int b) {
		return a + b;
	}
	static int minus(int a, int b) {
		return a - b;
	}
	static int multi(int a, int b) {
		return a * b;
	}
	static void process() {
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수 입력 : ");
		int a = scn.nextInt();
		
		System.out.println("두번째 정수 입력 : ");
		int b = scn.nextInt();
		
		System.out.println("연산자(+,-,*,/) 입력 : ");
		char op = (scn.next()).charAt(0);
		switch(op) {
		case '+':{
			int res = add(a,b); System.out.printf("%d%c%d=%d\n",a,op,b,res);
		}
			break;
		case '-':{
			int res = minus(a,b); System.out.printf("%d%c%d=%d\n",a,op,b,res);
		}
			break;
		case '*':{
			int res = multi(a,b); System.out.printf("%d%c%d=%d\n",a,op,b,res);
		}
			break;
		case '/':{
			double res = div(a,b); System.out.printf("%d%c%d=%f\n",a,op,b,res);
		}
			break;
		}
		
	}
	public static void main(String[] args) {
		process();
	}

}
