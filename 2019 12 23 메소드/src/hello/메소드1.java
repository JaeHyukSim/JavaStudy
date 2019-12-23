package hello;

public class 메소드1 {

	static int eee(int a) {
		return a;
	}
	static int[] ddd() {
		int[] arr = {1,2,3,4,5};
		return arr;
	}
	static String ccc() {
		String s = "hello java";
		return s;
	}
	static void message() {
		System.out.println("Hello Java!!");
		return;
	}
	static int aaa() {
		return 10;
	}
	public static void main(String[] args) {
		message();
		String s = ccc();
		int[] arr = ddd();
		int aa = eee(10);
		// 호출 ===> 결과값이 뭔지 확인, 매개변수 요청했는지
	}

}
