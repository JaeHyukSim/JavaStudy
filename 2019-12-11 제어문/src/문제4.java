
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class ����4 {

	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		String input = scn.next();

		int k = 1;
		while (k <= 4) {

			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// System.out.println(doc);

			Elements title = doc.select("td.info a.title");
			Elements singer = doc.select("td.info a.artist");
			int i = 0;
			/*
			 * while(i < title.size()) { System.out.print((i+1) +" " + title.get(i).text() +
			 * "\t"); System.out.println(singer.get(i).text()); i++; }
			 */
			boolean suc = false;
			while (i < title.size()) {

				String data = title.get(i).text();
				//if (data.contains(input)) {
					//System.out.println("ã�Ҵ�.");
				//}
				//if (input.equals(title.get(i).text())) {
					System.out.printf(" %d. %s �뷡�� ã�Ҵ�. ������ %s ...\n", (i+1) + 50*(k-1),title.get(i).text(), singer.get(i).text());
					suc = true;
				//}
				i++;
			}
			if (suc == false) {
				System.out.println("�׵� �뷡 ����");
			}

			k++;
		}
	}

}
