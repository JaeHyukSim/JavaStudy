import java.util.Scanner;

/*
 * 1. �޼ҵ� ȣ��
 * 2. �޼ҵ� ������� ����
 * 3. ��Ͼȿ� �ִ� ��� ���� ����
 * 4. 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class �޼ҵ�4 {

	static void gugudan(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n",dan,i,dan*i);
		}
	}
	
	static String gugudan2(int dan) {
		String res = "";
		for(int i = 1; i < 10; i++) {
			res += dan + " * " + i + " = " + (dan*i) + "\n";
		}
		return res;
	}
	
	static void process() {
		Scanner scn = new Scanner(System.in);
		int input = scn.nextInt();
		
		gugudan(input);
		System.out.println(gugudan2(input));
	}
	
	public static void main(String[] args) {
		process();
	}

}
