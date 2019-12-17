
public class ¹®Á¦1 {

	public static void main(String[] args) {
		
		int[] score = new int[5];
		int[] copy = new int[5];
		
		for(int i = 0; i < 5; i++) {
			score[i] = (int)(Math.random()*100) + 1;
			copy[i] = score[i];
		}
		
		
		int[] rank = {1,1,1,1,1};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == j ) {
					continue;
				}
				if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d(%d)\n",score[i],rank[i]);
		}
		
	}

}
