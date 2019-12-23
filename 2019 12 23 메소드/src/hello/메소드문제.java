package hello;



/*
 * 달력 만들기
 * 	1. 년도, 월을 입력 받는다
 * 	2. 첫 1일자가 무슨 요일인지 알아야 한다
 * 	3. 며칠까지 갈 것인가(마지막 날까지의 수)
 * 	4. 출력하면 된다.
 * 		->4개를 메소드로 나눠서 해결하면 나중에 재사용하기 쉽다.(5~6개 까지 나올 수도 있다)
 */

import java.util.*;	import java.text.*;
public class 메소드문제{

	static void datePrint(int mon, int week) {
		String weekData[] = {"일","월","화","수","목","금","토"};
		for(int i = 0; i < 7; i++) {
			System.out.print(weekData[i] + "\t");
		}
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println("\n");
		for(int i = 1; i <= lastDay[mon-1]; i++, week++) {
			if(i == 1) {
				for(int j = 0; j < week; j++) {
					System.out.print('\t');
				}
			}
			if(i != 1 && week % 7 == 0) {
				System.out.println();
			}
			System.out.printf("%2d\t",i);
		}
		System.out.println();
	}
	static void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = scn.nextInt();
		
		System.out.print("월 입력 : ");
		int mon = scn.nextInt();
		
		System.out.println("일 입력 :");
		int day = scn.nextInt();
		
		System.out.println(year + "년도 " + mon + "월");
		System.out.println("\n");
		
		String weekData[] = {"일","월","화","수","목","금","토"};
		//outputNow(weekData);
		getWeek(year, mon, day);
	}
	static void printOutputNow(int y,int m,int d,int w) {
		int[] weekData = lastDayIs();
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println("======== 오늘 날짜는 " + y + "년도 " + m + "월 " + d + "일 "
				+ week[weekData[w-1]%7] + "요일 =======");
		System.out.print(' ');
		for(int i = 0; i < 7; i++) {
			System.out.print(weekData[i] + "\t");
		}
		System.out.println();
	}
	static void today() {
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH) + 1;
		int d = cal.get(cal.DATE);
		int w = cal.get(cal.DAY_OF_WEEK);
		printOutputNow(y, m, d, w);
	}
	static int input(String msg) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		return a;
	}
	static int[] lastDayIs() {
		int[] lastDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		return lastDay;
	}
	static int totalDay(int year, int mon, int day) {
		int total = (year - 1) * 365 + (year-1) / 4 - (year-1) / 100 + (year-1) / 400;
		int[] lastDay = lastDayIs();
		if((year % 4 == 0 &&year%100 != 0) || (year % 400 == 0)) {
			lastDay[1] = 29;
		} else {
			lastDay[1] = 28;
		}
		for(int i = 0; i < mon-1; i++) {
			total += lastDay[i];
		}
		int myDay = total + day;
		return myDay;
	}
	static int getWeek(int year, int mon, int day) {
		int total = totalDay(year, mon, day);
		int week = (total + 1) % 7;
		int[] lastDay = lastDayIs();
		for(int i = 1; i <= lastDay[mon-1]; i++, week++) {
			if(i == 1) {
				for(int j = 0; j < week; j++) {
					System.out.print('\t');
				}
			}
			if(i != 1 && week % 7 == 0) {
				System.out.println();
			}
			System.out.printf("%2d\t",i);
		}
		System.out.println();
		//System.out.println(year + "년 " + mon + "월 " + day + "일 : " + weekData[myDay%7] + "입니다");
		return total;
	}
	static void process() {
		today();
		int year = input("년도 입력:");
		int mon = input("월 입력");
		System.out.println(year + "년도 " + mon + "월");
		System.out.println('\n');
		int day = input("일 입력");
		int week = getWeek(year, mon, day);
	}
	public static void main(String[] args) {
		process();
	}

}
