
public class MainClass {

	public static void main(String[] args) {
		//클래스 생성
		Sawon s1 =  new Sawon();
		//활용
		s1.setSabun(1);
		s1.setName("히히");
		s1.setDept("컴퓨터부");
		s1.setLoc("스울");
		s1.setPay(3500);
		
		//출력
		System.out.println(s1.getSabun() + " " + s1.getName() + " " + s1.getDept()+ " " +s1.getLoc()+ " " +s1.getPay());
		
		//클래스 생성
				s1 =  new Sawon();
				//활용
				s1.setSabun(2);
				s1.setName("허허");
				s1.setDept("개발부");
				s1.setLoc("언천");
				s1.setPay(6500);
				
				//출력
				System.out.println(s1.getSabun() + " " + s1.getName() + " " + s1.getDept()+ " " +s1.getLoc()+ " " +s1.getPay());
	}

}
