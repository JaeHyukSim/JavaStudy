
public class 배열7 {

	static void aaa() {
		int a = 10;
	}
	static void bbb() {
		int b = 10;
	}
	static void ccc() {
		int c = 10;
	}
	//String은 일반 변수 취급이다! -  String = call by value
	public static void main(String[] args) {
		int a = 500;
		String a2 = "JAVA";
		getData2(a2);
		System.out.println(a2);
		int[] arr = new int[5];
		getDta(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	static void getDta(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
		}
	}
	static void getData2(String s) {
		s = "HELLO";
	}

}
