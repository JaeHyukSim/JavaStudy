import java.util.Scanner;

public class ����_����_�� {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3);
		
		if(com == 0) {
			System.out.println("����");
		} else if(com == 1) {
			System.out.println("����");
		} else {
			System.out.println("��");
		}
		
		System.out.println("����, ����, ��(1,2,3) :");
		Scanner scn = new Scanner(System.in);
		
		String[] hand = new String[] {"����", "����", "��"};
		
		int you = scn.nextInt()-1;
		System.out.println("�� : " + hand[you] + " , �� : " + hand[com]);
		
		if(com == you) {
			System.out.println("���º�");
		} else if(com - you == 1 || com - you == -2) {
			System.out.println("�� ��");
		} else {
			System.out.println("�� ��");
		}
	}

}
