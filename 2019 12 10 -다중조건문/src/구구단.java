/*
 * 
 * 형상관리 => 깃허브 ...
 */

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("(2단 ~ 9단)단 입력");
		
		int dan = scn.nextInt();
		
		int i = 1;
		while(i <= 9) {
			//System.out.println(dan + " * " + i + " = " + dan*i);
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			i++;
		}
		
		for(i = 1; i <= 9 ; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%2d * %2d = %2d ",j,i,j*i);
			}
			System.out.println();
		}
	}

}
