import java.util.Scanner;

/*
 * ��ǻ�� => 1~100���� ������ ���ڸ� ���� -> UP AND DOWN���� ���߱�
 */
public class ���ٿ���� {

	public static void main(String[] args) {
		
		int ans = (int)(Math.random() * 100) + 1;
		Scanner scn = new Scanner(System.in);
		int res = -1;
		/*
		while(res != ans) {
			System.out.print("�Է� : ");
			res = scn.nextInt();
			if(res < 0 || res > 100){
				System.out.println("�߸� �Է��ߴ�");
				continue;
			}
			if(res > ans) {
				System.out.println("DOWN");
			} else if(res < ans) {
				System.out.println("UP");
			}
		}
		
		System.out.println("ans : " + ans + ", res : " + res);
		*/
		
		//��ǻ�ͷ� ���纸��
		int startData = 0, endData = 100;
		res = (int)(Math.random()*100) + 1;
		while(res != ans) {
			if(res > ans) {
				System.out.printf("��ǻ�Ͱ� %d�� �Է��߰�, ����� %s�Դϴ�.\n",res, "DOWN");
				endData = res;
				res = (startData + res)/2;
			} else if(res < ans) {
				System.out.printf("��ǻ�Ͱ� %d�� �Է��߰�, ����� %s�Դϴ�.\n",res, "UP");
				startData = res;
				res = (res + endData)/2;
			}
		}
		System.out.printf("��ǻ�Ͱ� ������ ������ϴ�. ������ %d�̰�, ��ǻ���� ����� %d�Դϴ�.\n",res, ans);
		
	}

}
