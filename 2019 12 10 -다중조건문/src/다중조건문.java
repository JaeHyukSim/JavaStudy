import java.util.Scanner;

//���� 2���� �޾Ƽ� ������ 1�� => 4Ģ����
public class �������ǹ� {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ����:");
		int num1 = scn.nextInt();
		System.out.println("�ι�° ����:");
		int num2 = scn.nextInt();
		System.out.println("������(+,-,*,/):");
		String op = scn.next();
		
		// ó�� 
		// ����� ���
		int res = 0;
		if(op.equals("+")) {
			res = num1 + num2;
		} else if(op.equals("-")) {
			res = num1 - num2;
		} else if(op.equals("*")) {
			res = num1 * num2;
		}else if(op.equals("/")){
			if(num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}else {
				res = num1 / num2;
			}
		} else {
			System.out.println("�߸��� �������Դϴ�.");
		}
		System.out.println(num1 + " " + op + " " + num2 + " = " + res);
		System.out.printf("%d %s %d = %d\n",num1,op,num2,res);
	}

}
