
/*
 * ���� : �Ѱ��� �����͸� ����
 * 
 * 1. ���� ����.
 * 2. ����� ���ÿ� ���� �Է�.
 * 
 *	====================
 *  ������ ������ �϶� 
 *  int kor;
 *  int eng;
 *  int math;
 *  
 *  =============> int kor, eng, math;
 *  
 *  �ʱⰪ
 *  int kor = 100;
 *  int eng = 100;
 *  int math = 100;
 *  
 *  =============> int kor=100, eng=100, math=100;
 *  int kor=eng=math=100;
 *  
 *  ������ ==> �ǹ̸� �ο��ؼ� �������� ������. readability
 */

public class ����������1 {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.println(a);
		
//		int kor=100, eng=100, math=100;
		
		int kor,eng,math;
		kor = eng = math = 100;
		
		System.out.println(kor + "," + eng + "," + math);
		
		String first_name = "ȫ";	//������� = firstName - �밡�� ǥ���
		String last_name = "�浿";
		
		System.out.println("�̸� : " + first_name + last_name);
		// ���ڿ� ���� ==> '+'�� �̿� println print printf format ... 
		/*
		 * 1. Ŭ������ ==> �빮�� ����
		 * 2. �޼ҵ�, ���� ==> �ҹ��� ����
		 * 3. ��� ==> ��ü �빮��
		 * 4. �鿩����
		 */
		
	}

}
