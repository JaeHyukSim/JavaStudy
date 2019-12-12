
public class 일주차정리3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = (int)(Math.random() * 1000);
		
		int max, min;
		max = -1; min = 10001;
		int count = 1000;
		for(int i = 0; i < count; i++) {
			x = (int)(Math.random() * 10000);
			if(x > max) {
				max = x;
			}
			if(x < min) {
				min = x;
			}
		}
		System.out.println("max : " + max + ", min : " +min);
		//int numOfBucket = (numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket+9)/10);
		
		
	}

}