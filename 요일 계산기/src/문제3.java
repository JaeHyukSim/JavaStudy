import java.util.Scanner;

/*
 * if, else를 사용
 * 
 * 1. 정수를 입력받음 (한개) - 짝수 or 홀수 판단
 * 2. 임의의 알파벳을 받아서 - 대문자 or 소문자 판단(if와 else만 사용)
 * 3. 정수 3개 입력받음 평균을 내고 -> 90점 이상이면 A, 
 * 								80점 이상이면 B,
 * 								70점 이상이면 C,
 * 								60점 이상이면 D,
 * 								60점 미만이면 F
 */

public class 문제3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int firstNum = scn.nextInt();
		
		if(firstNum % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		System.out.println();
		
		
		
		char c = 'A';
		System.out.print(c + " : ");
		if(c >= 'a' && c <= 'z') {
			System.out.println("소문자");
		} else {
			if(c >= 'A' && c <= 'Z') {
				System.out.println("대문자");
			} else {
				System.out.println("알파벳이 아님");
			}
		}
		
		System.out.println();
		
		int num1, num2, num3;
		System.out.println("정수 3개 입력:");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		
		char resc = 'x';
		int res = num1 + num2 + num3;
		System.out.println("평균 : " + res / 3.0);
		res /= 10;
		
		if(res > 30 || res < 0) {
			System.out.println("잘못된 입력");
		} else {
			if(res >= 27) {
				System.out.println('A');
			} else {
				if(res >= 24) {
					System.out.println('B');
				} else {
					if(res >= 21) {
						System.out.println('C');
					}else {
						if(res >= 18) {
							System.out.println('D');
						} else {
							System.out.println('F');
						}
					}
				}
			}
		}
	}

}
