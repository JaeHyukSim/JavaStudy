import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		String result = "";
		int kor, eng, mat, tot;
		double avg;
		String rate;
		
		Scanner scn = new Scanner(System.in);
		int i = 1;
		do {
			System.out.print("kor�� �Է� : ");
			kor = scn.nextInt();
			System.out.print("eng�� �Է� : ");
			eng = scn.nextInt();
			System.out.print("mat�� �Է� : ");
			mat = scn.nextInt();
			
			tot = kor + eng + mat;
			avg = tot / 3.0;
			
			switch((int)(avg / 10)) {
			case 10: case 9: rate = "A"; break;
			case 8: rate = "B"; break;
			case 7: rate = "C"; break;
			case 6: rate = "D"; break;
			default: rate = "F";
			}
			
			result += kor + " " + eng + " " + mat + 
					" " + tot + " " + avg + " " + rate + "\n";
			
			i++;
		}while(i <= 3);
		
		System.out.println(result);
	}

}
