
//A~Z => 5개씩 출력
public class 반복문2 {

	public static void main(String[] args) {
		
		char c = 'A';
		/*
		 * while(c <= 'Z') { if((c-'A')%5 == 0 && (c-'A') != 0) { System.out.println();
		 * } System.out.print(c + "\t"); c++; }
		 */
		
		/*
		 * int i = 1; c = 'A'; int switchNum = 1; while(i <= 26) { System.out.print(c +
		 * "\t"); if(i % 5 == 0) { if(c >= 'A' && c <= 'Z') { c = (char)(c-'A' + 'a'); }
		 * else { c = (char)(c- 'a' + 'A'); } System.out.println(); } c++; i++; }
		 */
		
		/*
		 * int i = 1;
		 * char c = 'A';
		 * boolean bCheck = true;
		 * while(i <= 26){
		 * 	if(bCheck == true){
		 * 	sout -> c
		 * }
		 * 	else {
		 * 	sout -> c -'A' + 'a';	
		 * }
		 * if( i % 5 == 0){
		 * 	sout + bCheck = !bCheck;
		 * }
		 * }
		 */
		
		c = 'A';
		char tc = c;
		int i = 1;
		int j = 1;
		int ti = 1;
		boolean bCheck = true;
		
		while(i <= 26) {
			j = 1;
			ti = i;
			tc = c;
			while(j <= 5 && ti <= 26) {
				System.out.print(tc + "\t");
				tc++;
				ti++;
				j++;
			}
			System.out.println();
			j = 1;
			ti = i;
			tc = (char)(c-'A' + 'a');
			while(j <= 5 && ti <= 26) {
				System.out.print(tc + "\t");
				tc++;
				j++;
				ti++;
			}

			if(ti > 26) {
				break;
			}
			System.out.println();
			i += 5;
			c += 5;
		}
	}

}
