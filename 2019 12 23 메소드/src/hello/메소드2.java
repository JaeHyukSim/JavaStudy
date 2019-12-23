package hello;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 메소드2 {
	
	static String[] getMusicTitle(){
		try {
			String[] list = new String[50];
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements title = doc.select("td.info a.title");
			for(int i = 0; i < 50; i++) {
				list[i] = title.get(i).text();
			}

			return list;
		} catch(Exception e) {
			System.out.println("사이트 주소가 잘못된것 같다!");
			return null;
		}
	}
	
	static String getMusicInfo(int no) throws Exception{
		try {
			String res = "";
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			Elements singer = doc.select("td.info a.artist");
			Elements album = doc.select("td.info a.albumtitle");
			for(int i = 0; i < 50; i++) {
				if(i == (no-1)) {
					res = singer.get(i).text() + "|" + album.get(i).text();
					break;
				}
			}

			return res;
		} catch(Exception e) {
			System.out.println("사이트 주소가 잘못된것 같다!");
			return null;
		}
	}
	public static void main(String[] args) throws Exception{
		try {
			String[] title = getMusicTitle();
			System.out.println("=====지니 뮤직 top 50 =====");
			int i = 1;
			for(String s : title) {
				System.out.println(i + ". " + s);
				i++;
			}
			System.out.println("========================");
			Scanner scn = new Scanner(System.in);
			/*
			System.out.print("제목 입력 :");
			String name = scn.next();
			i = 1;
			for(String s : title) {
				if(s.contains(name)) {
					System.out.println(i + ". " + s);
				}
				i++;
			}
			System.out.println("끝");
			*/
			
			System.out.print("뮤직 번호 입력(1~50) :");
			int no = scn.nextInt();
			String detail = getMusicInfo(no);
			String[] value = detail.split("\\|"); // 자체문자를 가져오기 위해서 \\를 쓴다
			System.out.println("가수명 : " + value[0] + ", 앨범명 : " + value[1]);
		}catch(NullPointerException e) {
			System.out.println("title이 null이다리");
		}
	}
}
