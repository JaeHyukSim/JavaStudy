import java.util.Scanner;

public class ���ù� {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ����:");
		int num1 = scn.nextInt();
		System.out.println("�ι�° ����:");
		int num2 = scn.nextInt();
		System.out.println("������(+,-,*,/):");
		String op = scn.next();
		
		int res = 0;
		
		switch(op) {
			case "+":
				res = num1 + num2; break;
			case "-":
				res = num1 - num2; break;
			case "*":
				res = num1 * num2; break;
			case "/":
				if(num2 == 0) {
					System.out.println("0���� ���� ������ ¥�X");
					break;
				}
				res = num1 / num2; break;
			default:
				System.out.println("operate�Է��� �߸��Ǿ��� ¥��");
				break;
		}
		System.out.printf("%d %s %d = %d",num1,op,num2,res);
	}

}
