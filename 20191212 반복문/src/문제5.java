
/*
 * 1 ~ 100 합
 * 짝수 / 홀수 합 출력
 * 결과 1~100까지 합 : xxx
 * 1~100까지의 짝수 합 : xxx
 * 1~100까지의 홀수 합 : xxx
 */
public class 문제5 {

	public static void main(String[] args) {
		int sum = 0, even = 0, odd = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		
		System.out.println("1부터 100까지의 합 : " + sum);
		System.out.println("1부터 100까지의 짝수 합 : " + even);
		System.out.println("1부터 100까지의 홀수 합 : " + odd);
	}
	
}
