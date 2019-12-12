
//7의 배수, 4의 배수가 아닌 갯수 100 ~ 999
public class 문제1 {

	public static void main(String[] args) {
		int i = 100;
		int cnt7 = 0, cntNot4 = 0;
		while(i<= 999) {
			if(i % 7 == 0) {
				cnt7++;
			}
			i++;
		}
		System.out.println(cnt7);
		
		int x = 999 / 7;
		int y = 99 / 7;
		System.out.println(x - y);
		
		int tot = 999 - 100 + 1;
		x = 999 / 4;
		y = 99 / 4;
		tot = tot - x + y;
		System.out.println(tot);
		
		i = 100;
		while(i <= 999) {
			if(i%4 == 0) {
				cntNot4++;
			}
			i++;
		}
		System.out.println(999 - 100 + 1 - cntNot4);
	}

}
