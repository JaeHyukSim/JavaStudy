
public class 선택조건문_예제3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100 + 1); 
		int b = (int)(Math.random()*100)+1;
		
		// a와 b를 비교해서 큰 값과 작은 값을 가져와라
		System.out.println("a:"+a+", b:"+ b);
		int min,max;
		
		if(a > b) {
			max = a;
			min = b;
		} else if(a<b){
			max = b; min = a;
		} else {
			System.out.println("두 수가 같습니다  : " + a);
			return;
		}
		
		System.out.println("큰 값: " + max +", 작은 값 : " + min);
	}

}
