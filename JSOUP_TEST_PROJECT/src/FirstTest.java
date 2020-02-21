
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class FirstTest {

	public static void main(String[] args) {
/*
		try {
			Document doc = Jsoup.connect("http://www.tourtips.com/ap/tboard/opinion_proc/")
					.header("origin", "http://www.tourtips.com")
					.header("referer",
							"http://www.tourtips.com/dest/content/1001_hongkong?contentID=1000004123101&type=lodge")
					.header("accept-encoding", "gzip, deflate").data("bid", "11").data("page", "24") // _callback 파라미터를
																									// 비우면 JSON이 리턴된다!
					.data("contentid", "1000004123101").data("mode", "list").get();

			System.out.println(doc);
			System.out.println(doc.html().length());
		} catch (Exception e) {

		}

		List<String> result = new ArrayList<>();
*/
		// org.json 라이브러리를 사용해 결과를 파싱한다.
		
	
		try {
			for(int i = 0; i < 10; i++) {
				try {
					System.out.println(10 / 0);
				}catch(Exception e) {
					System.out.println("내부에러!");
				}
			}
		}catch(Exception e) {
			System.out.println("에러에러!");
		}
	}

}
