//String : ���ڿ��� ����
/*
 * java.lang => import�� ������ �� �ִ�.
 * ���ڿ��� �����ϴ� ���
 * 	1. String + name of variable + "=" + real string;
 * 	2. String + name of variable + "=" + new String("real string");
 * 										**new :: ���ο� �޸𸮿� ����
 * 
 * 
 *******************************************************
 *	String���� �����ϴ� ���
 *	equals				(true / false)
 *			-> ID, PWD���� Ȯ���� �� ���ȴ� : ��ҹ��� ����
 *				���ڿ��� ==���� �ȵȴ�
 *
 *				String s = "Hello"
 *				String s1 = "Hello"
 *				===================
 *				s1 == s ?????? -> String s = "Hello";
									String s1 = "Hello";
									String s2 = new String("Hello");
							 		System.out.println(s == s1);
									System.out.println(s == s2); -> "Hello"�� �ּҿ� "Hello"�� �ּҴ� ����.
 *	substring
 *	length
 *	trim
 *	startsWith, endsWith
 *	indexOf, lastIndexOf
 *	������ ��ġ(indexOf : �տ���, lastIndexOf : �ڿ���)
 *	String s = "Hello Java";
 *	s.lastIndexOf('a') //s.indexOf('a');
 *	��θ��� ã�� �� �����ø� ã�� ���ؼ� ����Ѵ�. or �ð��� ������ �� '��'�� �ڸ��� ���ؼ� index�� ã�� �ʿ䰡 �ִ�
 *	split
 *	String s = "�̺���, ������, ������, ������, ����"
 *	->String[] names = s.split(","); << �̷������� ���
 *	toUpperCase, toLowerCase
 *	replace , replaceAll
 */

package StringPracticePackage;

import java.util.Scanner;

public class ���ڿ���� {

	static String[] findData(String data) {
		String[] ss = {
				"�ڹٿ� JSP", "�ڹ� ���α׷���", "������ 5.0", "Ajax�� JSP", "�������� ����Ʈ",
				"�ڹ� ����Ŭ", "MVC ����", "��Ʋ���� �ȵ���̵�", "��Ʋ�� ���α׷�", "������ ������",
				"ȥ�� ���� �ڹ�","������ �� ���α׷�","�����α׷���","�ڹ� �� ���α׷�",
				"����Ŭ �ڹ�"
				
		};
		
		String[] findData = new String[10];
		
		int j = 0;
		for(int i = 0; i < ss.length; i++) {
			if(ss[i].contains(data)) {
				findData[j] = ss[i];
				j++;
			}
		}
		return findData;
	}
	public static void main(String[] args) {
		
		/*
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s == s1);
		System.out.println(s == s2);
		
		String ss = "hello my name is sim";
		String[] names = ss.split(" "); 
		for(String i : names) {
			System.out.println(i);
		}
		
		String s3 = "113��";
		s3 = s3.replaceAll("[^0-9]", "");
		System.out.println(s3);
		*/
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("�˻��� �Է�");
		String data = scn.next();
		String[] ans = findData(data);
		for(String i : ans) {
			if(i != null)
				System.out.println(i);
		}
	}

}