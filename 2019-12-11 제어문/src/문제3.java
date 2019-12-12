
public class 문제3 {

	public static void main(String[] args) {
		boolean bCheck = false;
		
		int i = 0;
		int timer = 0;
		while(true) {
			//bCheck = !bCheck;
			/*
			 * if(bCheck == true) { System.out.println("본인 차례"); } else {
			 * System.out.println("컴퓨터 차례"); }
			 */
			System.out.printf("%d번 플레이어 차례\n",i+1);
			i = (i+1) % 6;
			timer++;
			if(timer >= 100) {
				break;
			}
		}

	}

}
