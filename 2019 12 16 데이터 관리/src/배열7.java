import java.util.Scanner;

//5���� ������ �Է¹޾Ƽ� => 5�� ������ ��� + ��, ����� ���
public class �迭7 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int total; double avg;
		
		Scanner scn = new Scanner(System.in);
		
		total = 0; avg = 0.0;
		for(int i = 0; i < 5; i++) {
			System.out.println(i+1 + "��° ���� �Է�");
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
