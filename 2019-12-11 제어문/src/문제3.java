
public class ����3 {

	public static void main(String[] args) {
		boolean bCheck = false;
		
		int i = 0;
		int timer = 0;
		while(true) {
			//bCheck = !bCheck;
			/*
			 * if(bCheck == true) { System.out.println("���� ����"); } else {
			 * System.out.println("��ǻ�� ����"); }
			 */
			System.out.printf("%d�� �÷��̾� ����\n",i+1);
			i = (i+1) % 6;
			timer++;
			if(timer >= 100) {
				break;
			}
		}

	}

}
