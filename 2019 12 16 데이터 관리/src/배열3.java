
public class 배열3 {

	public static void main(String[] args) {
		int com = (int)(Math.random()*3);
		/*
		 * if(com == 0) { System.out.println("가위"); } else if(com == 1) {
		 * System.out.println("바위"); } else { System.out.println("보"); }
		 */
		
		String[] res = {"가위", "바위", "보"};
		System.out.println(res[com]);
	}

}
