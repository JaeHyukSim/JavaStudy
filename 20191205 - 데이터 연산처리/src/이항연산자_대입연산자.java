


/*
 * ���Կ����� - ������� �����Ѵ� => '=' => a���ٰ� 10�� �����ض� a = 10;
 * ���մ��Կ����� => '+='
 * &= ...? int a = 10; a &= 3;  a = 10 & 3; = 2
 * |= ...? int a = 10; a |= 3;  a = 10 | 3; = 11
 * ^= ...? int a = 10; a ^= 3;  a = 10 ^ 3; = 9
 */
public class ���׿�����_���Կ����� {

	public static void main(String[] args) {
		int a = 10;
		a ^= 2 + 3; // 5�� �����ɱ�? �����ȴٸ� 1111, �� 15�� �� ���̴�
		System.out.println(a);
		
		int res = 0;
		res = getPowerTwo(31) - 1;
		System.out.println(res);
		
		int tres = 7;
		tres += 7 + 8 * 1;
		System.out.println("tres : " + tres);
	}
	
	public static int getPowerTwo(int n) {
		int res = 1;
		for(int i = 0; i < n; i++) {
			res *= 2;
		}
		return res;
	}
}
