import java.util.Scanner;

public class 배열4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int year, month;
		System.out.println("년도 입력:");
		year = scn.nextInt();
		System.out.println("월 입력");
		month = scn.nextInt();
		
		int[] lastDay = {31, 28,31,30,31,30,31,31,30,31,30,31};
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			lastDay[1] = 29;
		} else {
			lastDay[1] = 28;
		}
		for(int i = 0; i < 12; i++) {
			if(i == month-1) {
				System.out.println(lastDay[i]);
			}
		}
	}

}
