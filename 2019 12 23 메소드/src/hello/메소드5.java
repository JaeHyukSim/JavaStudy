package hello;

public class �޼ҵ�5 {

	static String[] dataMethod() {
		String[] data = {
			"[����Ư��] �ҹ��� �ʹ��Ұ�â/��â/��â �� 1.1kg ��Ű��(�ҽ�300g)",
			"[����Ư��] ��Ʈ Ȩ���� ���� �ʹ̼��� ��Ʈĩ�� 1�� (6����) / ����ǰ����",
			"�������� ���� ���� ���� ���! �����̹���������ͱ��� �����",
			"�������ִ� ����������! �̼ҵ��帶��ҽ��� �Բ�~",
			"���ó�� �̱��� �䵵�� ���� '�����̹��� ������ͱ���'������",
			"����丮 �����������~ ��� ���� ������~!!!!!#$(*#%(&*@(*%!!!!?",
			"��§��§�� ���е����� ���� ª�� ���ϱ�? �ƴҲ� ������",
			"�ʰ��� �ӱ��� ���� �� ���ݶ�*.*!!?",
			"�ع���ó�� ���ִ� ������ �ҽ����ᳪ���� ��",
			"��Ÿ�� : �Ϻ��� ������� ���� ������ ���� �޴��� ��!",
			"����� ���쿬�κδް��� ���� �ƴҲ� ��������"
		};
		
		return data;
	}
	
	static String maxLengthName() {
		String longRecipe ="";
		int maxLength = 0;
		String[] data = dataMethod();
		
		
		for(String s : data) {
			if(s.length() > maxLength) {
				longRecipe = s; maxLength = s.length();
			}
		}
		
		
		return longRecipe;
	}
	
	static String minLengthName() {
		String longRecipe ="";
		int minLength = 100;
		String[] data = dataMethod();
		
		
		for(String s : data) {
			if(s.length() < minLength) {
				longRecipe = s; minLength = s.length();
			}
		}
		
		
		return longRecipe;
	}
	public static void main(String[] args) {
		String[] data = dataMethod();
		
		
		for(String s: data) {
			System.out.println(s);
		}
		System.out.println("=========== ���� �� ������==============");
		String maxLengthRecipe = maxLengthName();
		System.out.println(maxLengthRecipe);
		
		String minLengthRecipe = minLengthName();
		System.out.println(minLengthRecipe);
		
	}

}
