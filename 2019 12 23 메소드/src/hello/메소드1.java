package hello;

public class �޼ҵ�1 {

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
		// ȣ�� ===> ������� ���� Ȯ��, �Ű����� ��û�ߴ���
	}

}
