import java.util.Scanner;

//���� 1�� �Է��� �޾Ƽ� 2�������� ���

public class �޼ҵ�2 {

	static void toBinary(int source) {
		int[] binary = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; // 16bit - lenght = 16;
		//int[] binary = new int[16] --> 16���� 0���� �ʱ�ȭ �ȴ�
		
		
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
		int cnt = 0;
		for(int i = 0; i < binary.length; i++, cnt++) {
			if(cnt%4 == 0 && cnt != 0) {
				System.out.print(" ");
			}
			System.out.print(binary[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ض�");
		int input = scn.nextInt();
		//toBinary(input);
		System.out.println(Integer.toBinaryString(input));
	}

}
