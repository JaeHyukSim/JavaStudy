import java.util.Scanner;

public class �迭12 {

	public static void main(String[] args) {
		char[] dap = new char[10];
		char[] user = new char[10];
		for(int i = 0; i < dap.length; i++) {
			int k = (int)(Math.random() * 2);
			if(k == 0) {
				dap[i] = 'O';
			} else {
				dap[i] = 'X';
			}
		}
		
		//���
		int score = 0;
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < dap.length; i++) {
			System.out.print("O or X�� ������ ����� : ");
			char input = (scn.next()).charAt(0);
			user[i] = input;
			if(input == dap[i]) {
				score++;
			}
		}
		
		//���
		System.out.print("computer : ");
		for(int i = 0; i < dap.length; i++) {
			System.out.printf("%c ",dap[i]);
		}
		System.out.println();
		System.out.print("you : ");
		for(int i = 0; i < user.length; i++) {
			System.out.printf("%c ",user[i]);
		}
		
		System.out.println();
		System.out.println("score : " + score*10);
	}

}
