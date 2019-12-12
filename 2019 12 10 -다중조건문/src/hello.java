import java.util.Scanner;

public class hello {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("년도 입력:");
		int year = scn.nextInt(); // 윤년
		System.out.print("월 입력");
		int mon = scn.nextInt(); // 마지막 날 ?
		
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
