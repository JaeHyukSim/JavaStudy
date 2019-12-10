
public class 선택문2 {

	public static void main(String[] args) {
		
		int score = 78;
		
		char res;
		switch(score/ 10) {
		case 10: case 9:	res = 'A'; break;
		case 8: res = 'B'; break;
		case 7: res = 'C'; break;
		case 6: res = 'D'; break;
		default: res = 'F';
		}
		System.out.println("당신의 점수 : " + score + ", 등급 : " + res);

	}

}