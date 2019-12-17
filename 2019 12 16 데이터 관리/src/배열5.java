import java.util.Scanner;

public class 배열5 {

	public static void main(String[] args) {
		String[] name = new String[5];
		Scanner scn = new Scanner(System.in);
		
		for(int i = 0 ; i < name.length; i++) {
			System.out.print(i+1 + "번 사람의 이름 입력 : ");
			name[i] = scn.next();
		}
		System.out.println();
		for(int i = 0; i < name.length; i++) {
			System.out.println(i+1 + "번 사람의 이름 : " + name[i]);
		}
		
		for(String nameAtom: name) {
			System.out.println(nameAtom);
		}
		scn.close();
	}

}
