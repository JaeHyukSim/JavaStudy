import java.util.Scanner;

/*
 * &&�� ||�� �ִ� 
 * && ==> ����ó�� (�� �� ���̾�� �Ѵ�) -> �����ȿ� �ִ� ���
 * 	=> score >= 90 && score <= 100
 * || ==> ����ó�� (�� �� �ϳ��� ��) -> ���� ���� ���
 *  => score < 0 || score > 100
 *  
 *  id�� password�� ���Դ�.
 *  id == "" && pass == 1234��� ����!
 *  id != "" || pwd!= "" ����!
 * 
 * �������� : (����) && or ||
 * 
 * 
 *  (����)
 *  
 *  	*** ȿ���� ���� *** 
 *  	and�����ڴ� ���� ������ false�̸� ���� ������ �������� �ʴ´�
 *  	or�����ڴ� ���� ������  true�̸� ���� ������ �������� �ʴ´�
 *  	=-> and�����ڴ� ���ʿ� false�� Ȯ���� ���� ������ ����ϰ�,
 *  		or�����ڴ� ���ʿ� true�� Ȯ���� ���� ������ ����ϸ� ���� UP!
 *  
 *  	***����� ���� true of false�� �����ϴ� �� : ��������
 */
public class ���׿�����_�������� {

	public static void main(String[] args) {
		
		//���ĺ��� �����Ŀ� �ҹ�������, �빮������ �������ּ���
		char c = 'f';
		char result = (c >= 'A' && c <= 'Z') ? (char)(c - 'A' + 'a') : (char)(c - 'a' + 'A');
		char result2 = (c >= 'A' && c <= 'Z') ? (char)(c +32) : (char)(c - 32);
		System.out.println(result);
		System.out.println(result2);
		
		int a = 1;
		System.out.println(a + a + (a++ * 2));
		a = 1;
		System.out.println(++a * 2 + a + a);
		a = 1;
		a++;
		System.out.println(a);
	}

}
