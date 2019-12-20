

/*
 * 1~45 ���� �߻� ==> �ߺ����� 6�� �߻�
 * �迭 => 6�� ����
 * for(6){while(){�ߺ�üũ}, �迭�� ����}
 * migration =====> ���� ������ �� ��ü ���������� ��ȯ
 */
public class �ߺ����³��� {

	
	static void process() {
		int[] arr = new int[6];
		
		for(int i = 0; i < 6; i++) {
			//���� �߻� �Լ�
			arr[i] = generateRandom();
			//�ߺ�üũ
			if(!isCheck(arr, i)) {
				i--; continue;
			}
			
		}
		//���
		print(arr);
	}
	static void print(int[] arr) {
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	static int generateRandom() {
		int a = (int)(Math.random()*45) + 1;
		return a;
	}
	static boolean isCheck(int[] arr, int pos) {
		for(int i = 0; i < pos-1; i++) {
			if(arr[pos] == arr[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		process();
	}

}