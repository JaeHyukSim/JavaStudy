import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		//���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ����
		//ù��° ���� �Է� : 10
		//�ι�° ���� �Է� : 20
		//������ �Է� : +
		//=>����� : "10 + 20 = 30�̴�" (*,/,- �� ���� ����)
		
		Scanner scn = new Scanner(System.in);
		
		char op;
		int first, second;
		
		System.out.print("ù��° ���� �Է�:");
		first = scn.nextInt();
		System.out.print("�ι�° ���� �Է�:");
		second = scn.nextInt();
		System.out.print("������ �Է�:");
		op = scn.next().charAt(0);	//char�� ���� ���� ����
		//���� ����
		double res = 0;
		if(op == '+') {
			res = first + second;
		}if(op == '-') {
			res = first - second;
		}if(op == '*') {
			res = first * second;
		}if (op == '/'){
			if(second == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			} else {
				res = (double)first / second;
			}
		}
		
		System.out.println(first + "" + op + second + " : " + res + "�Դϴ�.");
	}

}
