import java.util.Scanner;

class StudentVO2{
	String name;
	int kor,eng,mat;
}
public class StudentMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO2[] std = new StudentVO2[3];
		Scanner scn = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			StudentVO2 vo = new StudentVO2();
			System.out.println("�̸� : ");
			vo.name = scn.next();
			
			System.out.println("����: ");
			vo.kor = scn.nextInt();
			
			std[i] = vo;
		}
	}

}
