import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ¹®Á¦2 {
	
	public static int max(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	public static int min(int a, int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int input = 0;
		int input1 = 0;
		int max = 0, min =0;
		int i = 1;
		do {
			if(i == 1) {
				System.out.println("ÀÔ·Â");
				input = scn.nextInt();
			} else {
				System.out.println("ÀÔ·Â");
				input1 = scn.nextInt();
			}
			i++;
		}while(i <= 2);
		
		if(input > input1) {
			max = input;
			min = input1;
		}else {
			max = input1;
			min = input;
		}
		System.out.println("max : " + max + ", min : " + min);
		
		System.out.println("max : " + (input > input1? input : input1) + 
				", min : " + (input < input1 ? input : input1));
		
		System.out.println("ÃÖ´ñ°ª : " + max(input, input1) + ", ÃÖ¼Ú°ª : " + min(input, input1));
		
	}

}
