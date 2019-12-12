import java.util.Scanner;

/*
 * &&와 ||가 있다 
 * && ==> 직렬처리 (둘 다 참이어야 한다) -> 범위안에 있는 경우
 * 	=> score >= 90 && score <= 100
 * || ==> 병렬처리 (둘 중 하나만 참) -> 범위 밖인 경우
 *  => score < 0 || score > 100
 *  
 *  id와 password가 들어왔다.
 *  id == "" && pass == 1234라면 성공!
 *  id != "" || pwd!= "" 실패!
 * 
 * 문법형식 : (조건) && or ||
 * 
 * 
 *  (조건)
 *  
 *  	*** 효율적 연산 *** 
 *  	and연산자는 앞의 조건이 false이면 뒤의 조건을 연산하지 않는다
 *  	or연산자는 앞의 조건이  true이면 뒤의 조건을 연산하지 않는다
 *  	=-> and연산자는 왼쪽에 false일 확률이 높은 조건을 사용하고,
 *  		or연산자는 왼쪽에 true일 확률이 높은 조건을 사용하면 성능 UP!
 *  
 *  	***논리라는 말은 true of false를 결정하는 것 : 논리연산자
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		
		//알파벳을 저장후에 소문자인지, 대문자인지 구분해주세요
		char c = 'f';
		char result = (c >= 'A' && c <= 'Z') ? (char)(c - 'A' + 'a') : (char)(c - 'a' + 'A');
		char result2 = (c >= 'A' && c <= 'Z') ? (char)(c +32) : (char)(c - 32);
		System.out.println(result);
		System.out.println(result2);
		
		int a = 1;
		System.out.println(a + a + (a++ * 2));
		a = 1;
		System.out.println(++a * 2 + a + a);
		a = 1;
		a++;
		System.out.println(a);
	}

}
