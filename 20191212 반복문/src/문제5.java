
/*
 * 1 ~ 100 ��
 * ¦�� / Ȧ�� �� ���
 * ��� 1~100���� �� : xxx
 * 1~100������ ¦�� �� : xxx
 * 1~100������ Ȧ�� �� : xxx
 */
public class ����5 {

	public static void main(String[] args) {
		int sum = 0, even = 0, odd = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(i % 2 == 0) {
				even += i;
			} else {
				odd += i;
			}
		}
		
		System.out.println("1���� 100������ �� : " + sum);
		System.out.println("1���� 100������ ¦�� �� : " + even);
		System.out.println("1���� 100������ Ȧ�� �� : " + odd);
	}
	
}
