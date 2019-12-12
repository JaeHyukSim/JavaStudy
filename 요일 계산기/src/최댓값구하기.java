
public class 최댓값구하기 {

	public static void main(String[] args) {
		
		int a=89, b=90, c=12, d=77, e=85;
		int max = a;
		max = max > b ? max : b;
		max = max > c ? max : c;
		max = max > d ? max : d;
		max = max > e ? max : e;
		System.out.println("max : " + max);

		max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		if(max < d) {
			max = d;
		}
		if(max < e) {
			max = e;
		}
		System.out.println("max : " + max);
	}

}
