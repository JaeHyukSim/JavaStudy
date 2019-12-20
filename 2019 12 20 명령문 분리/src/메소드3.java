import java.util.Scanner;

public class 메소드3 {

	static int userInput() {
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 입력:");
		int input = scn.nextInt();
		return input;
	}
	
	static void process() {
		int input = userInput();
		int[] binary = toBinary(input);
		print(binary);
	}
	public static void main(String[] args) {
		process();
	}
	static void print(int[] data) {
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + ' ');
		}
	}
	static int[] toBinary(int source) {
		
		int[] binary = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // 16bit - lenght = 16;
		//int[] binary = new int[16] --> 16개가 0으로 초기화 된다
		
		
		for(int i = binary.length-1; i >= 0; i--) {
			binary[i] = source % 2;
			source /= 2;
			if(source == 0)	break;
		}
		
		/*
		int i = binary.length-1;
		while(source != 0) {
			binary[i] = source % 2;
			source /= 2;
			i--;
		}
		*/
		/*
		int cnt = 0;
		
		for(int i = 0; i < binary.length; i++, cnt++) {
			if(cnt%4 == 0 && cnt != 0) {
				System.out.print(" ");
			}
			System.out.print(binary[i] + " ");
		}
		*/
		return binary;
	}

}
