
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
 * 설명
 * 1. 모레시계의 크기 상수 n을 바꿔주면 모레시계가 만들어진다
 */
public class MakeHourglass {
	public static final int n = 5;
	static int[][] arr = new int[n][n];
	static int start = 1;
	
	public static void main(String[] args) {
		
		//모레시계를 만드는 함수-배열로 만든다
		makeHourglass(n, 0);
		
		//모레시계 arr 출력
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
		
		//뒤집어보자 -- 배열 자체를 뒤집어보자
		//시계방향으로 90도 돌아간 모레시계 만들기
		int[][] copyArr = new int[n][n];
		for(int i=0; i < n; i++) {
			for(int j =0; j < n; j++) {
				copyArr[j][n-i-1] = arr[i][j];
			}
		}
		
		System.out.println();
		
		//만들어진 copyArr을 출력
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
			//배열만들고 리턴
			if(len == 0) {
				return dep;
			}
			dep = makeArr(len, dep);
			return dep;
		}
		//배열만들기, 내려가기, 다시 배열 만들기
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
