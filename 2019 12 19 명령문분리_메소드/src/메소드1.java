import java.util.Scanner;

/*
 * ��ü���� -- �޼ҵ�
 * 			�ڹ�(��ü���� => Ŭ����) : Ŭ���� ���� ��� ( ����, �޼ҵ� )
 * 											  =============
 * 											   ������ + ���
 */
public class �޼ҵ�1 {

	static double div(int a, int b) {
		return a / (double)b;
	}
	static int add(int a, int b) {
		return a + b;
	}
	static int minus(int a, int b) {
		return a - b;
	}
	static int multi(int a, int b) {
		return a * b;
	}
	static void process() {
		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� : ");
		int a = scn.nextInt();
		
		System.out.println("�ι�° ���� �Է� : ");
		int b = scn.nextInt();
		
		System.out.println("������(+,-,*,/) �Է� : ");
		char op = (scn.next()).charAt(0);
		switch(op) {
		case '+':{
			int res = add(a,b); System.out.printf("%d%c%d=%d\n",a,op,b,res);
		}
			break;
		case '-':{
			int res = minus(a,b); System.out.printf("%d%c%d=%d\n",a,op,b,res);
		}
			break;
		case '*':{
			int res = multi(a,b); System.out.printf("%d%c%d=%d\n",a,op,b,res);
		}
			break;
		case '/':{
			double res = div(a,b); System.out.printf("%d%c%d=%f\n",a,op,b,res);
		}
			break;
		}
		
	}
	public static void main(String[] args) {
		process();
	}

}
