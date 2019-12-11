
/*
 * 형변환에 대해 많이 알고있어야 한다
 * ======
 * Up -> 보통 자동으로 casting된다
 * Down -> ex) int를 char로 바꾼다 or double을 int로 바꾼다
 * 
 * boolean은 형변환 할 수 없다
 */
public class 이항연산자_논리연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = Integer.MAX_VALUE + 1;
		//가정 -> x에 저장되기 전에 어딘가에 한번 저장된다??
		System.out.println(x);
		
		long y = Integer.MAX_VALUE + (long)15;
		System.out.println(y);
		
		String z = "123";
		System.out.println(Integer.parseInt(z) + 5);
		int zz = 123;
		System.out.println(String.valueOf(zz) + 7);
		
	}

}
