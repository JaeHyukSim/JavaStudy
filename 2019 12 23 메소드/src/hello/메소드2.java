package hello;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class �޼ҵ�2 {
	
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
			System.out.println("����Ʈ �ּҰ� �߸��Ȱ� ����!");
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
			System.out.println("����Ʈ �ּҰ� �߸��Ȱ� ����!");
			return null;
		}
	}
	public static void main(String[] args) throws Exception{
		try {
			String[] title = getMusicTitle();
			System.out.println("=====���� ���� top 50 =====");
			int i = 1;
			for(String s : title) {
				System.out.println(i + ". " + s);
				i++;
			}
			System.out.println("========================");
			Scanner scn = new Scanner(System.in);
			/*
			System.out.print("���� �Է� :");
			String name = scn.next();
			i = 1;
			for(String s : title) {
				if(s.contains(name)) {
					System.out.println(i + ". " + s);
				}
				i++;
			}
			System.out.println("��");
			*/
			
			System.out.print("���� ��ȣ �Է�(1~50) :");
			int no = scn.nextInt();
			String detail = getMusicInfo(no);
			String[] value = detail.split("\\|"); // ��ü���ڸ� �������� ���ؼ� \\�� ����
			System.out.println("������ : " + value[0] + ", �ٹ��� : " + value[1]);
		}catch(NullPointerException e) {
			System.out.println("title�� null�̴ٸ�");
		}
	}
}
