
/*
 * �� ǥ��
 * char ==> ''
 * int => 10����, 8����, 16����, 2����
 * long ==> 10L,  10l
 * float ==> 10.5F, 10.5f
 * boolean = true or false
 * String ==> ""
 * 
 * �񱳿����� => ����� = boolean : true , false
 * ===========
 * 1. ���� ==
 * 2. ���� �ʴ� !=
 * 3. �۴� < , �۰ų� ���� <=
 * 4. ũ�� > , ũ�ų� ���� >=
 * 
 */

import java.util.Scanner;
public class ���׿����� {
	
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
		
		//�ΰ��� ������ �޾Ƽ� ū ���� ���
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int result = a > b ? a+b : Math.abs(a-b);
		System.out.println(result);
		//Scanner�� char�� ������ ���� �ʴ�. �׷��ٸ�???
		//next()��, String���� �޾Ƽ� ����.
		//nextLine()�� String���� �Ѵ�
		
		String k = (a % 2 == 0) ? "Even" : "Odd";
		System.out.println(a + "%" + b + "=" + k + " number");
	}

}
