/*
		 * int totalYear = (year - 1) * 363
		 * 					+ (year-1)/4
		 * 					- (year-1)/100
		 * 					+ (year-1)/400
		 * 
		 * int[] lastDat = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 * if(����){
		 * 	lastDay[1] = 29;
		 * }	
		 * for(int i = 0; i < month-1; i++){
		 * 	total += lastDay[i];
		 * }
		 * total += day;
		 * int week = total%7;
		 */





import java.util.Scanner;

public class WhatdayToday {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int year, mon, day;
		
		int mon1 = 31;
		int mon2 = mon1 + 28;
		int mon3 = mon2 + 31;
		int mon4 = mon3 + 30;
		int mon5 = mon4 + 31;
		int mon6 = mon5 + 30;
		int mon7 = mon6 + 31;
		int mon8 = mon7 + 31;
		int mon9 = mon8 + 30;
		int mon10 = mon9 + 31;
		int mon11 = mon10 + 30;
		int mon12 = mon11 + 31;
		
		System.out.println("���� �Է��ϼ���:");
		year = scn.nextInt();
		System.out.println("���� �Է��ϼ���:");
		mon = scn.nextInt();
		System.out.println("���� �Է��ϼ���:");
		day = scn.nextInt();
		
		int calYear = year-1;
		int totalYear = (calYear/4) - (calYear/100) + (calYear/400);
		totalYear = 366 * totalYear + 365*(year-1-totalYear);
		
		int restYear = 0;
		if((year % 4 == 0 && year % 100 != 0)&& (year%400 == 0)) {
			if(mon == 2 && day == 29) {
				restYear++;
			} else if(mon > 3) {
				restYear++;
			}
		}
		
		totalYear += restYear;
		
		if(mon == 2) {
			totalYear += mon1;
		} else if(mon == 3) {
			totalYear += mon2;
		}else if(mon == 4) {
			totalYear += mon3;
		}else if(mon == 5) {
			totalYear += mon4;
		}else if(mon == 6) {
			totalYear += mon5;
		}else if(mon == 7) {
			totalYear += mon6;
		}else if(mon == 8) {
			totalYear += mon7;
		}else if(mon == 9) {
			totalYear += mon8;
		}else if(mon == 10) {
			totalYear += mon9;
		}else if(mon == 11) {
			totalYear += mon10;
		}else if(mon == 12) {
			totalYear += mon11;
		}
		
		totalYear += day;
		int res = totalYear % 7;
		
		System.out.print(year + "�⵵ " + mon + "�� " + day + "�� : ");
		if(res == 6) {
			System.out.print("�����");
		} else if(res == 0) {
			System.out.print("�Ͽ���");
		}else if(res == 1) {
			System.out.print("������");
		}else if(res == 2) {
			System.out.print("ȭ����");
		}else if(res == 3) {
			System.out.print("������");
		}else if(res == 4) {
			System.out.print("�����");
		}else if(res == 5) {
			System.out.print("�ݿ���");
		}
		System.out.println(" �Դϴ�.");
	}

}
