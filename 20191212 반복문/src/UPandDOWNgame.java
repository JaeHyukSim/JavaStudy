
/*
 * ���� �߻� ���α׷� - ���� ��ǻ�Ͱ� ���ߵ��� ����
 * 1���� 100���� ���� ���ϴµ�, 1~100������ ���� ���
 */
public class UPandDOWNgame {

	public static void main(String[] args) {
		
		int res;
		int ans;
		int endNum = 100000000;
		int startData = 0, endData = endNum;
		res = (int)(Math.random()*endNum) + 1;
		ans = (int)(Math.random()*endNum) + 1;
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
