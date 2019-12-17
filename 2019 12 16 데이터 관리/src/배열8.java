import java.util.Scanner;

public class 배열8 {
	public static void main(String[] args) {
		int[][] arr = new int[3][6];
		Scanner scn = new Scanner(System.in);
		String[] man = {"국어", "영어", "수학"};
		
		for(int i = 0; i < 3; i++) {
			arr[i][3] = 0;
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(i+1 + "번째 사람의 " + man[j] + "점수를 입력하세요 : ");
				arr[i][j] = scn.nextInt();
				arr[i][3] += arr[i][j];
			}
		}
		for(int i = 0; i < 3; i++) {
			switch(arr[i][3] / 30) {
			case 10: case 9: arr[i][4] = 'A'; break;
			case 8: arr[i][4] = 'B'; break;
			case 7: arr[i][4] = 'C'; break;
			case 6: arr[i][4] = 'D'; break;
			default: arr[i][4] = 'F';
			}
		}
		
		int[] save = new int[3];
		int[] tmp = new int[3];
		//1. 복사한다
		for(int i = 0; i < 3; i++) {
			tmp[i] = arr[i][3];
		}
		int maxIndex;
		int count = 1;
		for(int i = 0; i < 3; i++) {
			maxIndex = 0;
			for(int j = 1; j < 3; j++) {
				if(tmp[maxIndex] < tmp[j]) {
					maxIndex=  j;
				}
			}
			save[maxIndex] = count++;
			tmp[maxIndex] = -1;
		}
		for(int i = 0; i < 3; i++) {
			arr[i][5] = save[i];
		}
		
		System.out.printf("%5s%5s%5s%5s%5s%5s%5s\n","국어","영어","수학","총점","등급","등수","평균");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 6; j++) {
				if(j == 4) {
					System.out.printf("%5c",arr[i][j]);
				}else {
					System.out.printf("%5d",arr[i][j]);
				}
			}
			System.out.printf("%7.2f\n",arr[i][3] / 3.0);
		}
		
		System.out.println(arr[0][5]);
	}

}
