import java.util.Scanner;

public class �迭1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i = 0 ;i < 3; i++) {
			arr[i] = scn.nextInt();
		}
		for(int i = 0; i < 3; i++) {
			System.out.print(arr[i] + "  " );
		}
		
		//max�� min�� ���غ���
		int max = -978987978;
		int min = 987978978;
		
		for(int i = 0; i < 3; i++) {
			max = max > arr[i] ? max : arr[i];
			min = min > arr[i] ? arr[i] : min;
		}
		System.out.println("max : " + max + " , min : " + min);
		
	}

}
