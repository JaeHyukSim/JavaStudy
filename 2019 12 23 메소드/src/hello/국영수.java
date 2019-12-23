package hello;

import java.util.Scanner;

//국영수 받아서 -> 총점, 평균, 학점을 출력해라

public class 국영수 {
	static int input(String s) {
		System.out.println(s);
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		return a;
	}
	static double getAvg(int tot) {
		return tot / 3.0;
	}
	static int getTot(int kor, int eng, int mat) {
		return kor + eng + mat;
	}
	static char getHakjum(double avg) {
		int avgi = (int)avg;
		switch(avgi / 10) {
		case 10: case 9: return 'A';
		case 8: return 'B';
		case 7: return 'C';
		case 6: return 'D';
		default: return 'F';
		}
	}
	static void print(int kor, int eng, int mat, int tot, double avg, char hak) {
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점\t");
		System.out.printf("%d\t%d\t%d\t%d\t%f\t%c\t",kor,eng,mat,tot,avg,hak);
	}
	static void process() {
		int[] arr = new int[3];
		String[] dataArr = {"국어", "영어", "수학"};
		
		
		for(int i = 0; i < 3; i++) {
			arr[i] = input(dataArr[i] + "점수를 입력해라");
		}
		int tot = getTot(arr[0], arr[1], arr[2]);
		double avg = getAvg(tot);
		char hak = getHakjum(avg);
		print(arr[0], arr[1], arr[2], tot, avg, hak);
		
	}
	public static void main(String[] args) {
		process();
	}

}
