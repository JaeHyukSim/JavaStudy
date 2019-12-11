import java.util.Scanner;

//가위바위보 ==> 5 ==> 1승 3패 1무
public class 반복문3 {

	public static void main(String[] args) {
		String[] name = {"가위", "바위", "보"};
		int i = 1;
		int win = 0, lose = 0, same = 0;
		Scanner scn = new Scanner(System.in);
		int input, com;
		while(i <= 5) {
			System.out.println("가위(1) 바위(2) 보(3)");
			input = scn.nextInt();
			com = (int)(Math.random()*3) + 1;
			System.out.printf("당신이 낸 것 : %s, 컴이 낸 것 : %s ,",name[input-1],name[com-1] );
			/*
			 * if(com == input) { System.out.printf("결과 : %s\n","비겼다"); same++; } else
			 * if(com - input == 1 || com - input == -2) {
			 * System.out.printf("결과 : %s\n","졌다"); lose++; } else {
			 * System.out.printf("결과 : %s\n","이겼다"); win++; }
			 */
			
			switch(input - com) {
			case 0:
				System.out.printf("결과 : %s\n","비겼다"); same++; break;
			case 1: case -2:
				System.out.printf("결과 : %s\n","졌다"); lose++; break;
			default:
				System.out.printf("결과 : %s\n","이겼다"); win++;
			}
			//가위 바위 보 게임
			
			
			i++;
		}
		System.out.printf("이긴 수 : %d, 진 수 : %d, 비긴 수 : %d",win,lose,same);
	}

}
