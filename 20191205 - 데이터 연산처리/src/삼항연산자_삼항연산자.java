

	/*
	 * ���� : ���̸� �Է� -> 15�� �̻��̸� ��ȭ ���� ���� / or �Ұ���
	 * ���� 2 : �¼� => 1, 2, 3, 4, 5�� �ִ� => 1,2,4=>�¼����Ű� �Ұ���, 3,5�� ����
	 */
import java.util.Scanner;
public class ���׿�����_���׿����� {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		/*
		 * System.out.println("���� ���� : "); int kor = scn.nextInt();
		 * System.out.println("���� ���� : "); int eng = scn.nextInt();
		 * System.out.println("���� ���� : "); int mat = scn.nextInt();
		 * 
		 * int tot = kor + eng + mat; String res = tot >= 180 ? "Pass" : "Fail";
		 * System.out.println("��� : " + res);
		 */
		
		/*
		 * System.out.println("���̸� �Է��Ͻÿ� : "); int age = scn.nextInt(); String res = age
		 * >= 15 ? "��ȭ ���� ����" : "��ȭ ���� �Ұ���"; System.out.println("res : " + res);
		 */
		
		System.out.println("�¼� ��ȣ�� �Է��Ͻÿ�(1~5) : ");
		int data = scn.nextInt();
		if(data < 1 || data > 5) {
			System.out.println("�Է��� �߸��߽��ϴ�.");
			return;
		}
		String res2 = (data == 1 || data == 2 || data == 4) ? "�¼� ���� �Ұ���" : "�¼� ���� ����";
		System.out.println("res2 : " + res2);
		
		
		
	}

}
