
/*
 * 5���� ���� �߻� ==> �迭
 *  30 20 40 50 10
 *  ==> 50 40 30 20 10
 */
public class ����2 {

	public static void main(String[] args) {
		
		//�Է�
		final int SIZE = 100;
		int[] ori = new int[SIZE];
		int[] arr = new int[SIZE];
		for(int i = 0; i < SIZE; i++) {
			arr[i] = (int)(Math.random()*100) + 1;
			ori[i] = arr[i];
		}
		
		//����
		int index;
		for(int i = 0; i < SIZE-1; i++) {
			index = i;
			for(int j = i+1; j < SIZE; j++) {
				if(arr[index] < arr[j]) {
					index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;
		}
		
		//���
		for(int i = 0; i < SIZE; i++) {
			System.out.print(ori[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < SIZE; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
