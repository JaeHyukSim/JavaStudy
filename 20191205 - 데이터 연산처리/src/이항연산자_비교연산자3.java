
//1,2 -> ���� �߻�, Ȧ(1), ¦(2)

import java.util.Scanner;
public class ���׿�����_�񱳿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int num = (int)(Math.random()*100 + 1);
		int res = num % 2 == 0 ? 2: 1;
		System.out.println("res : " + res);
		System.out.println("num : " + num);
		
		System.out.println("input String(Ȧ,¦) : ");
		String EvenOrOdd = scn.next();
		int res2 = (EvenOrOdd.equals("Ȧ")) ? 1 : 2;
		System.out.println("res2 : " + res2);
	}

}
