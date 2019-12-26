
class StudentVO{
	String name;
	char hakjum;
}
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO vo = new StudentVO();
		switch(vo.hakjum){
			case 10: case 9: vo.hakjum = 'A'; break;
		}
	}

}
