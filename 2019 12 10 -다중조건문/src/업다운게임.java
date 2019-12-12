import java.util.Scanner;

/*
 * 컴퓨터 => 1~100까지 임의의 숫자를 추출 -> UP AND DOWN으로 맞추기
 */
public class 업다운게임 {

	public static void main(String[] args) {
		
		int ans = (int)(Math.random() * 100) + 1;
		Scanner scn = new Scanner(System.in);
		int res = -1;
		/*
		while(res != ans) {
			System.out.print("입력 : ");
			res = scn.nextInt();
			if(res < 0 || res > 100){
				System.out.println("잘못 입력했다");
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
		
		//컴퓨터로 맞춰보자
		int startData = 0, endData = 100;
		res = (int)(Math.random()*100) + 1;
		while(res != ans) {
			if(res > ans) {
				System.out.printf("컴퓨터가 %d를 입력했고, 결과는 %s입니다.\n",res, "DOWN");
				endData = res;
				res = (startData + res)/2;
			} else if(res < ans) {
				System.out.printf("컴퓨터가 %d를 입력했고, 결과는 %s입니다.\n",res, "UP");
				startData = res;
				res = (res + endData)/2;
			}
		}
		System.out.printf("컴퓨터가 정답을 맞췄습니다. 정답은 %d이고, 컴퓨터의 대답은 %d입니다.\n",res, ans);
		
	}

}
