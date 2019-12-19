import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 메소드6 {

	static void siteData(String address) throws Exception{
		int k = 1;
		/*
		<div id="dkIndex">
			<a href="#dkBody">본문 바로가기</a>
			<a href="#dkGnb">메뉴 바로가기</a>
		</div>
		 */
		
		Document doc = Jsoup.connect(address).get();
		Elements link = doc.select("div.info_tit a.name_movie");
		for(int i = 0; i < link.size(); i++) {
			try {
				//System.out.println(link.get(i).attr("href"));
				String link_data = "https://movie.daum.net" + link.get(i).attr("href");
				System.out.println("link_data : "  + link_data);
				Document doc2 = Jsoup.connect(link_data).get();
				Element title_kr = doc2.selectFirst("div.subject_movie strong.tit_movie");
				Element title_en = doc2.selectFirst("div.subject_movie span.txt_origin");
				//Element score = doc2.selectFirst("a.ranking_grade em.emph_grade");
				Element data = doc2.selectFirst("dl.list_movie dd.txt_main");
				
				
				k++;
			}catch(Exception e) {k--;
			}
			
		}
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("영화번호 선택(0~15):");
		int movieNum = scn.nextInt();
		System.out.println("==========결과==========");
		System.out.println("영화명 : " + m[movieNum].title_kr);
		System.out.println("영문영화명 : " + m[movieNum].title_en);
		System.out.println("장르 : " + m[movieNum].genre);
		*/
		
		//영화명이 가장 긴 놈 출력하기
		int maxLen = 0; int index = 0;
		
		//평점이 가장 높은 녀석 구하기
	}
	
	static void process() throws Exception{
		Scanner scn = new Scanner(System.in);
		
		String[] address = {"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/yearly"};
		
		int input = 3;
		while(true) {
			System.out.println("=====================");
			System.out.println("1.현재 상영 영화");
			System.out.println("2.개봉 예정 영화");
			System.out.println("3.박스오피스(주간)");
			System.out.println("4.박스오피스(월간)");
			System.out.println("5.박스오피스(연간)");
			System.out.println("6.종료");
			System.out.println("=====================");
			System.out.print("선택>");
			input = scn.nextInt();
			if(input == 6) {
				System.out.println("프로그램 종료");
				break;
			}
			siteData(address[input-1]);
		}
		/*
		for(int i = 0; i < address.length; i++) {
			System.out.println("=====================");
			siteData(address[i]);
			System.out.println("=====================");
			
		}
		*/
	}
	
	public static void main(String[] args) throws Exception{
		process();
	}

}
