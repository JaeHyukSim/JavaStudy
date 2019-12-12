
/*
 * 자바에서 제공하는 특수문자 *******************
 * 많이 익혀야 하는 것 3가지.
 * 
 */
public class 일주차정리2 {

	public static void main(String[] args) {
		System.out.println("Hello World!! \n");
		System.out.println("Good\t Bye!! \n");
		System.out.println("\"Nice to meet you\"");
		
		System.out.printf("Hello %d\t%d",5,6);
		System.out.printf("Hello format!! %-10d %-10d %-10d\n", 150 , 72, 32);
		System.out.printf("Hello format f!! %-15.2f %15f %f\n", 99.9999f, 2.5, 3.5);
		
		System.out.printf("%2c%2c%2c\n", 'a', 'b', 'c');
		
		System.out.printf("%10s", "Hello\n");
		
		int a = testMethod(1, 2, 5, 6, 711, 101, 9, 8,7,6,5,4,3,2,1);
		System.out.println(a);
		
	}
	
	public static int testMethod(int... value) {
		//가장 큰 수를 리턴해보자 - 배열처럼 저장된다
		 /*
		 * int maxIndex;
		 *
		 * for(int i = 0; i < value.length-1; i++) { maxIndex = i; for(int j = i+1; j <
		 * value.length; j++) { if(value[maxIndex] < value[j]) { maxIndex = j; } } int
		 * tmp = value[i]; value[i] = value[maxIndex]; value[maxIndex] = tmp; }
		 * 
		 * return value[0];
		 */
		int max = value[0];
		for(int i = 1; i < value.length; i++) {
			if(max < value[i]) {
				max = value[i];
			}
		}
		return max;
	}
}
