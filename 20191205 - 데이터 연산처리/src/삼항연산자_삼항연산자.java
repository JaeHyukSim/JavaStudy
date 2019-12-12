

	/*
	 * 문제 : 나이를 입력 -> 15세 이상이면 영화 관람 가능 / or 불가능
	 * 문제 2 : 좌석 => 1, 2, 3, 4, 5가 있다 => 1,2,4=>좌석예매가 불가능, 3,5는 가능
	 */
import java.util.Scanner;
public class 삼항연산자_삼항연산자 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		/*
		 * System.out.println("국어 점수 : "); int kor = scn.nextInt();
		 * System.out.println("영어 점수 : "); int eng = scn.nextInt();
		 * System.out.println("수학 점수 : "); int mat = scn.nextInt();
		 * 
		 * int tot = kor + eng + mat; String res = tot >= 180 ? "Pass" : "Fail";
		 * System.out.println("결과 : " + res);
		 */
		
		/*
		 * System.out.println("나이를 입력하시오 : "); int age = scn.nextInt(); String res = age
		 * >= 15 ? "영화 관람 가능" : "영화 관람 불가능"; System.out.println("res : " + res);
		 */
		
		System.out.println("좌석 번호를 입력하시오(1~5) : ");
		int data = scn.nextInt();
		if(data < 1 || data > 5) {
			System.out.println("입력을 잘못했습니다.");
			return;
		}
		String res2 = (data == 1 || data == 2 || data == 4) ? "좌석 예매 불가능" : "좌석 예매 가능";
		System.out.println("res2 : " + res2);
		
		
		
	}

}
