import java.util.Scanner;

/*
 * 알파벳을 대문자
 * DDD --> AAA
 * ZZZ --> WWW
 * 
 */
public class 문제6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		String ans = "";
		char x = 'a';
		for(int i = 0; i < s.length(); i++) {
			x = (char)(s.charAt(i) - 'A');
			x = (char)((x - 2 + 'Z' - 'A') % ((int)('Z'-'A'+1)) + 'A');
			ans += x;
		}
		System.out.println(ans);
	}

}
