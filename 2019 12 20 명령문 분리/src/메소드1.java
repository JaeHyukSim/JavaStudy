
// 1+(1+2) + (1+2+3) + (1+2+3+4+)...(1+2+...+10) -> 을 구해라
public class 메소드1 {

	static int sum(int last) {
		int sum = 0;
		
		for(int i = 1; i <= last; i++) {
			sum += i;
		}
		return sum;
	}
	static int process() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += sum(i);
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(process());

	}

}
