import java.util.Scanner;

/*
 * String������ �غ��� ==> ���� ==> charAt(0~len-1);
 * 1. ���� ����� a�� ����� Ȯ���غ���
 */
public class ����2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("�Է� ��Ʈ�� : ");
		String input = scn.next();
		
		int i = 0;
		int sum = 0;
		while(i <= input.length()) {
			if(input.charAt(i) == 'a' || input.charAt(i) == 'A') {
				sum++;
			}
			i++;
		}
		System.out.println("���� : " + sum);
	}

}
