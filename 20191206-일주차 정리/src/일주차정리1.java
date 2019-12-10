
/*
 * 변수 : 한개의 데이터를 저장
 * 
 * 1. 변수 선언.
 * 2. 선언과 동시에 값을 입력.
 * 
 *	====================
 *  변수가 여러개 일때 
 *  int kor;
 *  int eng;
 *  int math;
 *  
 *  =============> int kor, eng, math;
 *  
 *  초기값
 *  int kor = 100;
 *  int eng = 100;
 *  int math = 100;
 *  
 *  =============> int kor=100, eng=100, math=100;
 *  int kor=eng=math=100;
 *  
 *  변수명 ==> 의미를 부여해서 가독성을 높이자. readability
 */

public class 일주차정리1 {

	public static void main(String[] args) {
		
		int a = 0;
		System.out.println(a);
		
//		int kor=100, eng=100, math=100;
		
		int kor,eng,math;
		kor = eng = math = 100;
		
		System.out.println(kor + "," + eng + "," + math);
		
		String first_name = "홍";	//권장사항 = firstName - 헝가리 표기법
		String last_name = "길동";
		
		System.out.println("이름 : " + first_name + last_name);
		// 문자열 결합 ==> '+'를 이용 println print printf format ... 
		/*
		 * 1. 클래스명 ==> 대문자 시작
		 * 2. 메소드, 변수 ==> 소문자 시작
		 * 3. 상수 ==> 전체 대문자
		 * 4. 들여쓰기
		 */
		
	}

}
