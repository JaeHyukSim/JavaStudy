package hello;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 메소드6 {

	public static void main(String[] args) {
		String data = "버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		// 문자 개수 - > 공백도 포함된다.
		System.out.println("문자의 개수 : " + data.length());
		System.out.println("버섯단어의 개수 : ");
		int count = 0;
		Pattern p = Pattern.compile("버섯");
		Matcher m = p.matcher(data);
		while(m.find()) {
			count++;
		}
		System.out.println(count);
		//substring : 매개변수가 하나 or 둘 : 하나 = x~끝  둘 = x~y
		int startIndex = 0;
		if(data.indexOf("!") + startIndex > data.length()) {
			System.out.println("범위 초과");
		} else {
			String fData = data.substring(startIndex, data.indexOf("!") + startIndex);
			System.out.println(fData);
			String lData = data.substring(data.indexOf("!") + 1);
			System.out.println(lData.trim());
			
			int a = 10; int b = 20; double d = 10.5D;
			//102010.5로 붙이고 싶다
			String tmpA = ""+a+b+d;
			System.out.println(tmpA);
			int k = (int)Double.parseDouble(tmpA);
			System.out.println(k);
			
		}
	}

}
