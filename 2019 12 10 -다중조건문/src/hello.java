import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("�⵵ �Է�:");
		int year = scn.nextInt(); // ����
		System.out.print("�� �Է�");
		int mon = scn.nextInt(); // ������ �� ?
		
		int lastDay = 0;
		
		if(mon == 4 || mon == 6 || mon == 9 || mon == 11) {
			lastDay = 30;
		} else if(mon == 2) {
			if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {
				lastDay = 29;
			} else {
				lastDay = 28;
			}
		} else {
			lastDay = 31;
		}
		
		System.out.println("lastDay : " + lastDay);
	}

}
