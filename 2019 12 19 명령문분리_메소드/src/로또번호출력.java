
public class 로또번호출력 {

	static void star(int cnt) {
		for(int i = 0; i < cnt; i++) {
			System.out.print('★');
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		for(int i = 1; i < 100; i++) {
			star(i);
		}
	}

}
