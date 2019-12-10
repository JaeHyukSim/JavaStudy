
/*
 * 값 표현
 * char ==> ''
 * int => 10진법, 8진법, 16진법, 2진법
 * long ==> 10L,  10l
 * float ==> 10.5F, 10.5f
 * boolean = true or false
 * String ==> ""
 * 
 * 비교연산자 => 결과값 = boolean : true , false
 * ===========
 * 1. 같다 ==
 * 2. 같지 않다 !=
 * 3. 작다 < , 작거나 같다 <=
 * 4. 크다 > , 크거나 같다 >=
 * 
 */

import java.util.Scanner;
public class 이항연산자 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = 10 == 11;
		System.out.println(b1);
		
		b1 = 10!= 11;
		System.out.println(b1);
		
		b1 = 10 < 11;
		System.out.println(b1);
		
		b1 = 10>11;
		System.out.println(b1);
		
		b1 = 65 >= 'A';
		System.out.println(b1);
		
		//두개의 정수를 받아서 큰 값을 출력
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int result = a > b ? a+b : Math.abs(a-b);
		System.out.println(result);
		//Scanner는 char를 가지고 있지 않다. 그렇다면???
		//next()로, String으로 받아서 쓴다.
		//nextLine()은 String으로 한다
		
		String k = (a % 2 == 0) ? "Even" : "Odd";
		System.out.println(a + "%" + b + "=" + k + " number");
	}

}
