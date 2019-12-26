import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.sun.org.apache.xml.internal.serializer.ElemDesc;

class Category{
	int cateNo;
	String poster;
	String title;
	String subTitle;
	String link;
}
class Foot{
	String[] poster = new String[4];
	String title;
	double score;
	String addr;
	String tel; 
	String type;
	String price;
	String packing;
	String time;
}
public class FootMain {

	public static void main(String[] args) throws IOException {
		Category[] cate = new Category[12];
		Document doc = Jsoup.connect("https://www.mangoplate.com/").get();
		Elements title = doc.select("div.info_inner_wrap span.title");
		Elements sub = doc.select("ul.list-toplist-slider img");
		Elements poster = doc.select("div.info_inner_wrap p.desc");
		Elements link = doc.select("ul.list-toplist-slider a");
		
		for(int i = 0; i < 12; i++) {
			Category g = new Category();
			g.cateNo = i+1;
			g.title = title.get(i).text();
			g.poster = poster.get(i).attr("data-lazy");
			g.subTitle = sub.get(i).text();
			g.link = link.get(i).attr("href");
			cate[i] = g;
		}
		
	}

}
