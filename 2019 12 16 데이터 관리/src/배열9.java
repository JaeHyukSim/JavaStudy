import java.util.Scanner;

public class 배열9 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int max, min;
		
		Scanner scn = new Scanner(System.in);
		for(int i = 0 ; i < 5; i++) {
			System.out.print(i+1 + "번째 정수를 입력하시오 : ");
			arr[i] = scn.nextInt();
		}
		max = arr[0];
		min = arr[0];
		for(int i = 1; i < 5; i++) {
			max = max > arr[i] ? max : arr[i];
			min = min > arr[i] ? arr[i] : min;
		}
		System.out.println("max : " + max +" , min : " + min);
	}

}
