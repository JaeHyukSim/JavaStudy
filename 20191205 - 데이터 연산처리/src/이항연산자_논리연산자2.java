
/*
 * ����ȯ�� ���� ���� �˰��־�� �Ѵ�
 * ======
 * Up -> ���� �ڵ����� casting�ȴ�
 * Down -> ex) int�� char�� �ٲ۴� or double�� int�� �ٲ۴�
 * 
 * boolean�� ����ȯ �� �� ����
 */
public class ���׿�����_��������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = Integer.MAX_VALUE + 1;
		//���� -> x�� ����Ǳ� ���� ��򰡿� �ѹ� ����ȴ�??
		System.out.println(x);
		
		long y = Integer.MAX_VALUE + (long)15;
		System.out.println(y);
		
		String z = "123";
		System.out.println(Integer.parseInt(z) + 5);
		int zz = 123;
		System.out.println(String.valueOf(zz) + 7);
		
	}

}
