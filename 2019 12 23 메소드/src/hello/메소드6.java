package hello;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �޼ҵ�6 {

	public static void main(String[] args) {
		String data = "�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		// ���� ���� - > ���鵵 ���Եȴ�.
		System.out.println("������ ���� : " + data.length());
		System.out.println("�����ܾ��� ���� : ");
		int count = 0;
		Pattern p = Pattern.compile("����");
		Matcher m = p.matcher(data);
		while(m.find()) {
			count++;
		}
		System.out.println(count);
		//substring : �Ű������� �ϳ� or �� : �ϳ� = x~��  �� = x~y
		int startIndex = 0;
		if(data.indexOf("!") + startIndex > data.length()) {
			System.out.println("���� �ʰ�");
		} else {
			String fData = data.substring(startIndex, data.indexOf("!") + startIndex);
			System.out.println(fData);
			String lData = data.substring(data.indexOf("!") + 1);
			System.out.println(lData.trim());
			
			int a = 10; int b = 20; double d = 10.5D;
			//102010.5�� ���̰� �ʹ�
			String tmpA = ""+a+b+d;
			System.out.println(tmpA);
			int k = (int)Double.parseDouble(tmpA);
			System.out.println(k);
			
		}
	}

}
