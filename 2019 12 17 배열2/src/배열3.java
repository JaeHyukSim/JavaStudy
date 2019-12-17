
public class 배열3 {

	public static void main(String[] args) {
		int[] com = new int[3];
		int su = 0;
		boolean bCheck = false;
		
		for(int i = 0; i < com.length; i++) {
			bCheck = true;
			while(bCheck) {
				bCheck = false;
				//난수발생
				su = (int)(Math.random()*9) + 1;
				//중복여부 확인
				for(int j = 0; j < i; j++) {
					if(com[j] == su) {
						bCheck = true; break;
					}
				}
			}
			com[i] = su;
		}
		for(int i = 0; i < com.length; i++) {
			System.out.print(com[i] + " ");
		}
	}
}