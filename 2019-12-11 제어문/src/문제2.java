import java.util.Scanner;

/*
 * String가지고 해보자 ==> 문자 ==> charAt(0~len-1);
 * 1. 문자 만들고 a자 몇개인지 확인해보자
 */
public class 문제2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("입력 스트링 : ");
		String input = scn.next();
		
		int i = 0;
		int sum = 0;
		while(i <= input.length()) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'A') {
				sum++;
			}
			i++;
		}
		System.out.println("개수 : " + sum);
	}

}
