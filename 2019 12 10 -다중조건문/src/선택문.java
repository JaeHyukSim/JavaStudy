import java.util.Scanner;

public class 선택문 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1 = scn.nextInt();
		System.out.println("두번째 정수:");
		int num2 = scn.nextInt();
		System.out.println("연산자(+,-,*,/):");
		String op = scn.next();
		
		int res = 0;
		
		switch(op) {
			case "+":
				res = num1 + num2; break;
			case "-":
				res = num1 - num2; break;
			case "*":
				res = num1 * num2; break;
			case "/":
				if(num2 == 0) {
					System.out.println("0으로 나눌 수없다 짜쌰");
					break;
				}
				res = num1 / num2; break;
			default:
				System.out.println("operate입력이 잘못되었다 짜샤");
				break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,res);
	}

}
