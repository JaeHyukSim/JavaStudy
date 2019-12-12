
/*
 *         1  2  3  4  5
 *            6  7  8
 *               9
 *           10 11 12
 *        13 14 15 16 17
 * 
 * 
 */

/*
 * ����
 * 1. �𷹽ð��� ũ�� ��� n�� �ٲ��ָ� �𷹽ð谡 ���������
 */
public class MakeHourglass {
	public static final int n = 5;
	static int[][] arr = new int[n][n];
	static int start = 1;
	
	public static void main(String[] args) {
		
		//�𷹽ð踦 ����� �Լ�-�迭�� �����
		makeHourglass(n, 0);
		
		//�𷹽ð� arr ���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(arr[i][j] == -1) {
					System.out.printf("%3c",' ');
				}
				else {
					System.out.printf("%3d",arr[i][j]);
				}
			}
			System.out.println();
		}
		
		//������� -- �迭 ��ü�� �������
		//�ð�������� 90�� ���ư� �𷹽ð� �����
		int[][] copyArr = new int[n][n];
		for(int i=0; i < n; i++) {
			for(int j =0; j < n; j++) {
				copyArr[j][n-i-1] = arr[i][j];
			}
		}
		
		System.out.println();
		
		//������� copyArr�� ���
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(copyArr[i][j] == -1) {
					System.out.printf("%3c",' ');
				}
				else {
					System.out.printf("%3d",copyArr[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public static int makeHourglass(int len, int dep) {
		
		if(len <= 1) {
			//�迭����� ����
			if(len == 0) {
				return dep;
			}
			dep = makeArr(len, dep);
			return dep;
		}
		//�迭�����, ��������, �ٽ� �迭 �����
		dep = makeArr(len, dep);
		dep = makeHourglass(len-2, dep);
		dep = makeArr(len, dep);
		return dep;
	}
	
	public static int makeArr(int len, int dep) {
		
		int pos = 0;
		int i;
		for(i = 0; i < (n - len)/2; i++) {
			arr[dep][pos++] = -1;
		}
		for(i = 0; i < len; i++) {
			arr[dep][pos++] = start++;
		}
		for(i = 0; i < (n - len)/2; i++) {
			arr[dep][pos++] = -1;
		}
		
		return dep+1;
	}

}
