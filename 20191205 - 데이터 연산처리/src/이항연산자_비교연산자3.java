
//1,2 -> ³­¼ö ¹ß»ı, È¦(1), Â¦(2)

import java.util.Scanner;
public class ÀÌÇ×¿¬»êÀÚ_ºñ±³¿¬»êÀÚ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		int num = (int)(Math.random()*100 + 1);
		int res = num % 2 == 0 ? 2: 1;
		System.out.println("res : " + res);
		System.out.println("num : " + num);
		
		System.out.println("input String(È¦,Â¦) : ");
		String EvenOrOdd = scn.next();
		int res2 = (EvenOrOdd.equals("È¦")) ? 1 : 2;
		System.out.println("res2 : " + res2);
	}

}
