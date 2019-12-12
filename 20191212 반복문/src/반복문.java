/*
 * do-while
 * 
 * 초기값
 * do{
 * 	실행문장 ==> 여러 문장을 사용할 수 있다
 * 	증가식 ==> 증감식
 * 		i++ , i--, i+=2, i-=2;
 * }while(condition);
 */

public class 반복문 {

	public static void main(String[] args) {
		
		int i = 1;
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 10);
		
		System.out.println();
		do {
			i--;
			System.out.print(i + " ");
		}while(i>1);
	}

}
