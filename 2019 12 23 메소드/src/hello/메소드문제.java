package hello;



/*
 * �޷� �����
 * 	1. �⵵, ���� �Է� �޴´�
 * 	2. ù 1���ڰ� ���� �������� �˾ƾ� �Ѵ�
 * 	3. ��ĥ���� �� ���ΰ�(������ �������� ��)
 * 	4. ����ϸ� �ȴ�.
 * 		->4���� �޼ҵ�� ������ �ذ��ϸ� ���߿� �����ϱ� ����.(5~6�� ���� ���� ���� �ִ�)
 */

import java.util.*;	import java.text.*;
public class �޼ҵ幮��{

	static void datePrint(int mon, int week) {
		String weekData[] = {"��","��","ȭ","��","��","��","��"};
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
		System.out.print("�⵵ �Է� : ");
		int year = scn.nextInt();
		
		System.out.print("�� �Է� : ");
		int mon = scn.nextInt();
		
		System.out.println("�� �Է� :");
		int day = scn.nextInt();
		
		System.out.println(year + "�⵵ " + mon + "��");
		System.out.println("\n");
		
		String weekData[] = {"��","��","ȭ","��","��","��","��"};
		//outputNow(weekData);
		getWeek(year, mon, day);
	}
	static void printOutputNow(int y,int m,int d,int w) {
		int[] weekData = lastDayIs();
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println("======== ���� ��¥�� " + y + "�⵵ " + m + "�� " + d + "�� "
				+ week[weekData[w-1]%7] + "���� =======");
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
		//System.out.println(year + "�� " + mon + "�� " + day + "�� : " + weekData[myDay%7] + "�Դϴ�");
		return total;
	}
	static void process() {
		today();
		int year = input("�⵵ �Է�:");
		int mon = input("�� �Է�");
		System.out.println(year + "�⵵ " + mon + "��");
		System.out.println('\n');
		int day = input("�� �Է�");
		int week = getWeek(year, mon, day);
	}
	public static void main(String[] args) {
		process();
	}

}
