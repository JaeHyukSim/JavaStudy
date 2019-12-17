import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class �迭4 {

	public static void main(String[] args) throws Exception{
		Movie[] m = new Movie[20];
		int k = 1;
		/*
		<div id="dkIndex">
			<a href="#dkBody">���� �ٷΰ���</a>
			<a href="#dkGnb">�޴� �ٷΰ���</a>
		</div>
		 */
		
		Document doc = Jsoup.connect("https://movie.daum.net/premovie/released").get();
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
				
				m[i] = new Movie();
				m[i].title_kr = title_kr.text();
				m[i].title_en = title_en.text();
				//m[i].score = Double.parseDouble(score.text());
				//m[i].grade = grade.text();
				m[i].genre = data.text();
				k++;
			}catch(Exception e) {k--;
			}
			
		}
		
		/*
		Scanner scn = new Scanner(System.in);
		System.out.print("��ȭ��ȣ ����(0~15):");
		int movieNum = scn.nextInt();
		System.out.println("==========���==========");
		System.out.println("��ȭ�� : " + m[movieNum].title_kr);
		System.out.println("������ȭ�� : " + m[movieNum].title_en);
		System.out.println("�帣 : " + m[movieNum].genre);
		*/
		
		//��ȭ���� ���� �� �� ����ϱ�
		int maxLen = 0; int index = 0;
		for(int i = 1; i < link.size(); i++) {
			if(maxLen < m[i].title_kr.length()) {
				maxLen = m[i].title_kr.length();
				index = i;
			}
		}
		System.out.println("movie title : " + m[index].title_kr);
		System.out.println("title length : " + maxLen + ", number : " + index);
		
		//������ ���� ���� �༮ ���ϱ�
	}

}
