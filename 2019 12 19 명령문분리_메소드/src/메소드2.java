import java.util.Scanner;

public class �޼ҵ�2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			�޼ҵ�1.process();
			System.out.println("y|n �Է�:");
			String ex = scn.next();
			switch(ex) {
			case "y":	System.exit(0); break;
			case "n": 	break;
			}
		}
		
	}

}
