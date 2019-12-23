package hello;

public class 메소드5 {

	static String[] dataMethod() {
		String[] data = {
			"[만개특가] 소문난 초벌소곱창/막창/대창 총 1.1kg 패키지(소스300g)",
			"[만개특가] 켄트 홈쇼핑 완판 초미세모 켄트칫솔 1팩 (6개입) / 사은품증정",
			"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
			"완전맛있는 차돌박이찜! 미소된장마요소스도 함께~",
			"고기처럼 쫄깃한 밥도둑 반찬 '새송이버섯 간장버터구이'레시피",
			"새우요리 갈릭마요새우~ 요거 완전 맛있지~!!!!!#$(*#%(&*@(*%!!!!?",
			"단짠단짠의 대패덮밥이 가장 짧은 것일까? 아닐껄 ㅋㅋㅋ",
			"초간단 머그컵 퐁당 오 쇼콜라*.*!!?",
			"해물찜처럼 맛있는 백종원 소시지콩나물찜 ㅋ",
			"부타동 : 일본식 돼지고기 덮밥 간단한 점심 메뉴로 굿!",
			"담백한 새우연두부달걀탕 나도 아닐껄 ㅋㅋㄷㅋ"
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
		System.out.println("=========== 가장 긴 레시피==============");
		String maxLengthRecipe = maxLengthName();
		System.out.println(maxLengthRecipe);
		
		String minLengthRecipe = minLengthName();
		System.out.println(minLengthRecipe);
		
	}

}
