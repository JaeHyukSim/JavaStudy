import java.util.Scanner;

/*
 * while ==> 1에서 100까지의 짝수의 합, 홀수의 합, 총 합을 구해서 출력해라!
 * 1~(사용자 입력값)
 */
public class 반복문2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력 : " );
		int num = scn.nextInt();
		
		int eTot = 0, oTot = 0, tot = 0;
		int i = 1;
		while(i <= num) {
			if(i%2 == 0) {
				eTot += i;
			}
			if(i%2 == 1) {
				oTot += i;
			}
			tot += i;
			i++;
		}
		System.out.printf("짝수의 총합 : %d, 홀수의 총합 : %d, 총합 : %d\n", eTot, oTot, tot);
		
	}

}
