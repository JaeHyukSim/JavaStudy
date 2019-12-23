import java.util.Scanner;

public class Oper {

	//문자열의 ' '를 제거하는 함수
	static String removeSpace(String data) {
		String res = "";
		//1. 띄어쓰기를 전부 없앤다
		for(int i = 0; i < data.length(); i++) {
			if(data.charAt(i) != ' ') {
				res += data.charAt(i);
			}
		}
		return res;
	}
	
	//start인덱스부터 숫자를 추출하는 함수
	static int getNumber(int start, String data) {
		int num = 0;
		for(int i = start; i < data.length(); i++) {
			if(data.charAt(i) >= '0' && data.charAt(i) <= '9') {
				num += (data.charAt(i) - '0');
				num *= 10;
			} else {
				break;
			}
		}
		num /= 10;
		return num;
	}
	
	//string data속에 들어있는 char operator의 인덱스를 구하는 함수
	static int getOperator(String data) {
		int index = 0;
		while(true) {
			if(index >= data.length()) {
				System.out.println("error - operator를 찾을 수 없습니다");
				return -1;
			}
			if(!(data.charAt(index) >= '0' && data.charAt(index) <= '9')) {
				return index;
			}
			index++;
		}
	}
	
	//연산하는 함수
	static int operating(int a, int b, char op) {
		switch(op) {
		case '+': return a + b;
		case '-': return a - b;
		case '*': return a * b;
		case '/': if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다."); return -987987987;
		}else {
			return a / b; 
		}
	}
		return -987987987;
	}
	
	
	/*데이터 입력 형식 52572 + 3426223;
	 *  2          -   3
	 *  3 * 5
	 * 7/4
	 * (단, 정수형 데이터에 넣으므로 숫자가 정수형 범위를 넘어서면 안된다)
	 */
	static int process(String data) {
		
		String res = "";
		//1. 띄어쓰기를 전부 없앤다
		res = removeSpace(data);
		System.out.println("res : " + res);
		
		
		//2. 숫자를 고른다
		int numA = getNumber(0, res);
		
		
		//3. operator의 index를 찾는다
		int opIndex = getOperator(res);
		if(opIndex == -1) {
			return -987987987;
		}
		char op = res.charAt(opIndex);
		
		
		//4. 두번째 숫자를 고른다
		int numB = getNumber(opIndex+1, res);
		
		
		//5. 연산한다
		int result = operating(numA, numB, op);
		return result;
	}
	public static void main(String[] args) {
		System.out.print("연산식을 입력하세요:");
		Scanner scn = new Scanner(System.in);
		String data = scn.nextLine();
		System.out.println(process(data));
	}

}
