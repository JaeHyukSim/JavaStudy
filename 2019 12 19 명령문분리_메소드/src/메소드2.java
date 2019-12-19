import java.util.Scanner;

public class 메소드2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			메소드1.process();
			System.out.println("y|n 입력:");
			String ex = scn.next();
			switch(ex) {
			case "y":	System.exit(0); break;
			case "n": 	break;
			}
		}
		
	}

}
