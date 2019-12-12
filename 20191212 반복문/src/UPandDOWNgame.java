
/*
 * 난수 발생 프로그램 - 나는 컴퓨터가 맞추도록 하자
 * 1에서 100까지 합을 구하는데, 1~100까지의 합을 출력
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
