class MovieVO{
	//instance 변수 ----- 메모리에 저장되는 시점 ==> new(새로운 메모리를 만들 때)
	String title;
	double score;
	String genre;
	String regdate;
	int time;
	String grade;
	String director;
	String actor;
}



public class MainClass {

	/*
	 * 자바 클래스 구조
	 * private :: public ------ default :: 같은 폴더 내에서만 사용 (package)
	 * class ClassName{
	 * 	=======클래스만 가지고 있는 변수========== 전역변수(다른 클래스에서 사용 가능)
	 * 	=>메모리에 따로 저장되는 변수(instance 변수)
	 *  =>공유하는 변수 static변수 - 한개만 사용
	 * 	=================
	 * 	생성자 -> 
	 * 	=================
	 * 	메소드 기능 수행
	 * 	=================
	 * }
	 * 백두산 (2019)
평점6.9/10
드라마/액션
 한국
2019.12.19 개봉
128분, 12세이상관람가
(감독) 이해준, 김병서
(주연) 이병헌, 하정우, 마동석, 전혜진, 수지

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieVO m1 = new MovieVO();
		m1.title = "백두산 (2019)";
		MovieVO m2 = new MovieVO();
		m2.title = "천문: 하늘에 묻는다";
		MovieVO m3 = new MovieVO();
		m3.title = "캣츠 (2019)";
		
		MovieVO m4 = m3;
		m4.title = "시동";
		System.out.println("m1 : " + m1);
		System.out.println("m2 : " + m2);
		System.out.println("m3 : " + m3);
		System.out.println("m4 : " + m4);
		System.out.println("m3.title : " + m3.title);
		
		MovieVO[] vo = {m1,m2,m3,m4};
		for(int i = 0 ; i < vo.length; i++) {
			System.out.println(vo[i].title);
		}
	}

}
