
public class �������ǹ�_����3 {

	public static void main(String[] args) {
		int a = (int)(Math.random()*100 + 1); 
		int b = (int)(Math.random()*100)+1;
		
		// a�� b�� ���ؼ� ū ���� ���� ���� �����Ͷ�
		System.out.println("a:"+a+", b:"+ b);
		int min,max;
		
		if(a > b) {
			max = a;
			min = b;
		} else if(a<b){
			max = b; min = a;
		} else {
			System.out.println("�� ���� �����ϴ�  : " + a);
			return;
		}
		
		System.out.println("ū ��: " + max +", ���� �� : " + min);
	}

}
