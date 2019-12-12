import java.util.Scanner;

//정수 2개를 받아서 연산자 1개 => 4칙연산
public class 다중조건문 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1 = scn.nextInt();
		System.out.println("두번째 정수:");
		int num2 = scn.nextInt();
		System.out.println("연산자(+,-,*,/):");
		String op = scn.next();
		
		// 처리 
		// 결과값 출력
		int res = 0;
		if(op.equals("+")) {
			res = num1 + num2;
		} else if(op.equals("-")) {
			res = num1 - num2;
		} else if(op.equals("*")) {
			res = num1 * num2;
		}else if(op.equals("/")){
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}else {
				res = num1 / num2;
			}
		} else {
			System.out.println("잘못된 연산자입니다.");
		}
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);
		System.out.printf("%d %s %d = %d\n",num1,op,num2,res);
	}

}
