import java.util.Scanner;

/*
 * if, else�� ���
 * 
 * 1. ������ �Է¹��� (�Ѱ�) - ¦�� or Ȧ�� �Ǵ�
 * 2. ������ ���ĺ��� �޾Ƽ� - �빮�� or �ҹ��� �Ǵ�(if�� else�� ���)
 * 3. ���� 3�� �Է¹��� ����� ���� -> 90�� �̻��̸� A, 
 * 								80�� �̻��̸� B,
 * 								70�� �̻��̸� C,
 * 								60�� �̻��̸� D,
 * 								60�� �̸��̸� F
 */

public class ����3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		int firstNum = scn.nextInt();
		
		if(firstNum % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}
		
		System.out.println();
		
		
		
		char c = 'A';
		System.out.print(c + " : ");
		if(c >= 'a' && c <= 'z') {
			System.out.println("�ҹ���");
		} else {
			if(c >= 'A' && c <= 'Z') {
				System.out.println("�빮��");
			} else {
				System.out.println("���ĺ��� �ƴ�");
			}
		}
		
		System.out.println();
		
		int num1, num2, num3;
		System.out.println("���� 3�� �Է�:");
		num1 = scn.nextInt();
		num2 = scn.nextInt();
		num3 = scn.nextInt();
		
		char resc = 'x';
		int res = num1 + num2 + num3;
		System.out.println("��� : " + res / 3.0);
		res /= 10;
		
		if(res > 30 || res < 0) {
			System.out.println("�߸��� �Է�");
		} else {
			if(res >= 27) {
				System.out.println('A');
			} else {
				if(res >= 24) {
					System.out.println('B');
				} else {
					if(res >= 21) {
						System.out.println('C');
					}else {
						if(res >= 18) {
							System.out.println('D');
						} else {
							System.out.println('F');
						}
					}
				}
			}
		}
	}

}
