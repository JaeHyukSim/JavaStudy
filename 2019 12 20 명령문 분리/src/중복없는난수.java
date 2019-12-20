

/*
 * 1~45 난수 발생 ==> 중복없는 6개 발생
 * 배열 => 6개 저장
 * for(6){while(){중복체크}, 배열에 저장}
 * migration =====> 절차 지향형 언어를 객체 지향형으로 변환
 */
public class 중복없는난수 {

	
	static void process() {
		int[] arr = new int[6];
		
		for(int i = 0; i < 6; i++) {
			//난수 발생 함수
			arr[i] = generateRandom();
			//중복체크
			if(!isCheck(arr, i)) {
				i--; continue;
			}
			
		}
		//출력
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