import java.util.Scanner;

//���������� ==> 5 ==> 1�� 3�� 1��
public class �ݺ���3 {

	public static void main(String[] args) {
		String[] name = {"����", "����", "��"};
		int i = 1;
		int win = 0, lose = 0, same = 0;
		Scanner scn = new Scanner(System.in);
		int input, com;
		while(i <= 5) {
			System.out.println("����(1) ����(2) ��(3)");
			input = scn.nextInt();
			com = (int)(Math.random()*3) + 1;
			System.out.printf("����� �� �� : %s, ���� �� �� : %s ,",name[input-1],name[com-1] );
			/*
			 * if(com == input) { System.out.printf("��� : %s\n","����"); same++; } else
			 * if(com - input == 1 || com - input == -2) {
			 * System.out.printf("��� : %s\n","����"); lose++; } else {
			 * System.out.printf("��� : %s\n","�̰��"); win++; }
			 */
			
			switch(input - com) {
			case 0:
				System.out.printf("��� : %s\n","����"); same++; break;
			case 1: case -2:
				System.out.printf("��� : %s\n","����"); lose++; break;
			default:
				System.out.printf("��� : %s\n","�̰��"); win++;
			}
			//���� ���� �� ����
			
			
			i++;
		}
		System.out.printf("�̱� �� : %d, �� �� : %d, ��� �� : %d",win,lose,same);
	}

}
