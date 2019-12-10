


/*
 * 대입연산자 - 결과값을 대입한다 => '=' => a에다가 10을 대입해라 a = 10;
 * 복합대입연산자 => '+='
 * &= ...? int a = 10; a &= 3;  a = 10 & 3; = 2
 * |= ...? int a = 10; a |= 3;  a = 10 | 3; = 11
 * ^= ...? int a = 10; a ^= 3;  a = 10 ^ 3; = 9
 */
public class 이항연산자_대입연산자 {

	public static void main(String[] args) {
		int a = 10;
		a ^= 2 + 3; // 5가 먼저될까? 먼저된다면 1111, 즉 15가 될 것이다
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
