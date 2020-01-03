
public class StudentSystem {
	
	//รัมก
	public int totalData(int kor, int eng, int math) {
		return kor + eng + math;
	}
	public double avgData(int total) {
		return total/3.0;
	}
	public char scoreData(double avg) {
		char c = 'A';
		switch((int)(avg/10)){
		case 10: case 9 : c = 'A'; break;
		}
		return c;
	}
	/*
	public void hakjumData(Student s) {
		s.setTotal(s.getKor() + s.getEng() + s.getMath());
		s.setAvg(s.getTotal()/3.0);
		
		char c = 'A';
		switch((int)(s.getAvg()/10)){
		case 10: case 9 : c = 'A'; break;
		}
		s.setAvg(score(c);
	}
	*/
}
