package StringPracticePackage;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Single;

public class ���ڿ�Ŭ����2 {

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
			System.out.print("ID �Է� :");
			String id = scn.next();
			System.out.print("PWD�Է� :");
			String pwd = scn.next();
			
			boolean bCheck = isLogin(id, pwd);
			
			if(bCheck == true) {
				System.out.println(id + "�� �α��� �Ǿ����ϴ�!!");
				break;
			}else {
				System.out.println("ID�� PASS�� Ʋ�Ƚ��ϴ�.\n�ٽ� �Է��ϼ���.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread());
		process();
	}

}
