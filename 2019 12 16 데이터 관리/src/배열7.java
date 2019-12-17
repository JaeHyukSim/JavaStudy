import java.util.Scanner;

//5개의 정수를 입력받아서 => 5개 정수를 출력 + 합, 평균을 출력
public class 배열7 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int total; double avg;
		
		Scanner scn = new Scanner(System.in);
		
		total = 0; avg = 0.0;
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "번째 정수 입력");
			arr[i] = scn.nextInt();
			total += arr[i];
		}
		avg = total / 5;
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println(total + " " + avg);
		

	}

}
