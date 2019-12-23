package StringPracticePackage;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

public class 문자열클래스2 {

	static boolean isLogin(String id,String pwd) {
		
		boolean bCheck = false;
		final String ID = "admin";
		final String PWD = "1234";
		
		/*
		 *equals // equalsIgnoreCase 
		 * 
		 */
		//if(id.equals(ID) && pwd.equals(PWD)) {
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD)) {
			bCheck = true;
		}
		return bCheck;
	}
	
	static void process() {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("ID 입력 :");
			String id = scn.next();
			System.out.print("PWD입력 :");
			String pwd = scn.next();
			
			boolean bCheck = isLogin(id, pwd);
			
			if(bCheck == true) {
				System.out.println(id + "님 로그인 되었습니다!!");
				break;
			}else {
				System.out.println("ID나 PASS가 틀렸습니다.\n다시 입력하세요.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread());
		process();
	}

}
