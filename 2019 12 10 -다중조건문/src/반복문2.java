import java.util.Scanner;

/*
 * while ==> 1���� 100������ ¦���� ��, Ȧ���� ��, �� ���� ���ؼ� ����ض�!
 * 1~(����� �Է°�)
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("���ڸ� �Է� : " );
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
		System.out.printf("¦���� ���� : %d, Ȧ���� ���� : %d, ���� : %d\n", eTot, oTot, tot);
		
	}

}
