
/*
 * 	1. ����(�������) : ���������� + �������� + ������;
 * 	2. ������ : ���������� + Ŭ������ + �Ű����� + �ٵ�
 * 
 * 
 */
class Music{
	private int a;
	private String b;
	private double c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
}
class Movie{
	private int mno;
	protected String actor;
	public double score;
}
public class MainClass {

	String name;
	String sex;
	int age;
	
	public MainClass() {
		name = "��û��";
		sex = "����";
		age = 25;
	}
	
	public MainClass(String name, String sex, int age) {
		this.name = name;	this.sex = sex; this.age = age;
	}
	public static void main(String[] args) {
		MainClass mc = new MainClass();
		MainClass mc1 = new MainClass("�̼���", "����", 3);
		
		System.out.println(new MainClass("�ڹ���","����",10).name);
		Movie m = new Movie();
		
		Music music = new Music();
		System.out.println(music.getA());
	}

}
