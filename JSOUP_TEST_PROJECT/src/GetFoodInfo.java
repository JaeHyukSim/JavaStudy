import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetFoodInfo {

	/*
	 * private String titleV; private int categoryV; private double starV; private
	 * String local_nameV; private ArrayList<String> imageList; private String
	 * areaV; private String addressV; private String callV; private String
	 * websiteV; private String howtoV; private String descriptionV; private
	 * ArrayList<ReviewTypeAVO> replyList;
	 */
	private ArrayList<ReviewTypeAVO> replyList;
	private ArrayList<String> imageList;
	private FoodVO foodVO;
	private String origin = "http://www.tourtips.com";

	private String metaData;
	private FoodDAO dao;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// String url =
		// "http://www.tourtips.com/dest/content/1001_hongkong?contentID=1000004123101&type=lodge";
		String url = "http://www.tourtips.com/dest/main/";
		GetFoodInfo g = new GetFoodInfo();
		// g.getDataFromSite(url);
		// g.foodVO.display();
		// g.getAllLocalHotel(url);
		g.getAllHotel(url);

		long end = System.currentTimeMillis();
		int second = (int) ((end - start) / 1000);
		int seconds = (int) (second % 60);
		int minute = second / 60;
		int minutes = minute % 60;
		int hour = minute / 60;
		System.out.println("총 걸린 시간 - 시 : " + hour + ", 분 : " + minutes + ", 초 : " + seconds);
	}

	public GetFoodInfo() {
		metaData = "";
		imageList = new ArrayList<String>();
		replyList = new ArrayList<ReviewTypeAVO>();
		foodVO = new FoodVO();
		dao = new FoodDAO();
	}

	// data 한페이지에서 가져오기
	public void getDataFromSite(String url) {
		try {
			imageList.clear();
			replyList.clear();
			Document doc = Jsoup.connect(url).get();

			// System.out.println(doc);
			// 1. 제목을 가져온다
			Elements title = doc.select("div.article_title div.title_area h1");
			// System.out.println(title.text());
			foodVO.setTitleV(title.text());
			// 2. 등급을 가져온다
			Elements category = doc.select("div.article_title p.category");
			// System.out.println(category.text());
			if (category.text().length() != 0) {
				foodVO.setCategoryV(category.text());
			} else {
				foodVO.setCategoryV("미정");
			}
			// 3. 평점을 가져온다
			Elements star = doc.select("div.article_title p.star");
			// System.out.println(star.text());
			foodVO.setStarV(Double.parseDouble(star.text()));
			// 4. local_name을 가져온다
			Elements local_name = doc.select("div.cnt_info li.local_name");
			// System.out.println(local_name.text());
			foodVO.setLocal_nameV(local_name.text());
			// 5. 이미지 리스트들을 전부 불러온다
			int len = doc.select("div.thumb_img").size();
			// System.out.println(len);
			for (int i = 0; i < len; i++) {
				Element thumb_img = doc.select("div.thumb_img").get(i);
				/*
				 * System.out.println(thumb_img.html().substring(thumb_img.html().indexOf("=") +
				 * 2, thumb_img.html().indexOf("alt") - 2));
				 */
				imageList.add(thumb_img.html().substring(thumb_img.html().indexOf("=") + 2,
						thumb_img.html().indexOf("alt") - 2));
			}
			foodVO.setImageList(imageList);
			// 6. area를 가져온다
			Elements area = doc.select("li.area");
			// System.out.println(area.text());
			foodVO.setAreaV(area.text());
			// 7. address를 가져온다
			Elements address = doc.select("li.address");

			if (address.text().indexOf("지도로 보기") != -1) {
				foodVO.setAddressV(address.text().substring(0, address.text().indexOf("지도로 보기")));
				// System.out.println("!!" + address.text().substring(0,
				// address.text().indexOf("지도로 보기")));
			} else {
				// System.out.println(address.text());
				foodVO.setAddressV(address.text());
			}
			// 8. call을 가져온다
			Elements call = doc.select("li.call");
			// System.out.println(call.text());
			foodVO.setCallV(call.text());
			// 9. website를 가져온다
			Elements website = doc.select("li.website");
			// System.out.println(website.text());
			foodVO.setWebsiteV(website.text());
			// 10. how to를 가져온다
			Elements howto = doc.select("li.howto");

			if (howto.text().indexOf("길찾기") != -1) {
				foodVO.setHowtoV(howto.text().substring(0, howto.text().indexOf("길찾기")));
				// System.out.println("!!" + howto.text().substring(0,
				// howto.text().indexOf("길찾기")));
			} else {
				// System.out.println(howto.text());
				foodVO.setHowtoV(howto.text());
			}
			// 11. description을 가져온다
			Elements description = doc.select("div.cnt_reason");
			// System.out.println(description.html());
			foodVO.setDescriptionV(description.html());
			// 13. operating 시간을 가져온다 - string
			Elements operating = doc.select("li.operating");
			foodVO.setOperating(operating.text().trim());
			// System.out.println(operating.text().trim());
			// 14. restday
			Elements restday = doc.select("li.restday");
			foodVO.setRestDay(restday.text().trim());
			// System.out.println(restday.text().trim());
			// 15. signature
			Elements signature = doc.select("li.signature");
			foodVO.setSignature(signature.text().trim());
			// System.out.println(signature.text().trim());
			// 12. review 데이터를 가져온다 - review table에 넣는다
			int count = 1;

			while (true) {
				try {
					// System.out.println(url.substring(url.indexOf("contentID")+10,url.indexOf("type")-1));
					Document doc2 = Jsoup.connect("http://www.tourtips.com/ap/tboard/opinion_proc/")
							.header("origin", "http://www.tourtips.com").header("referer", url)
							.header("accept-encoding", "gzip, deflate").data("bid", "11")
							.data("page", String.valueOf(count)) // _callback 파라미터를
							// 비우면 JSON이 리턴된다!
							.data("contentid", url.substring(url.indexOf("contentID") + 10, url.indexOf("type") - 1))
							.data("mode", "list").get();
					// System.out.println(doc2);
					// System.out.println(doc2.html().length());
					if (doc2.html().length() < 100) {
						break;
					}
					len = doc2.select("div.review-box").size();
					// System.out.println("len : " + len);
					for (int i = 0; i < len; i++) {
						ReviewTypeAVO vo = new ReviewTypeAVO();
						Element replyInfoPhoto = doc2.select("div.review-box div.photo").get(i);
						vo.setImage(replyInfoPhoto.html().substring(replyInfoPhoto.html().indexOf("=") + 2,
								replyInfoPhoto.html().indexOf("alt") - 2));
						Element replyInfoName = doc2.select("div.review-box span.user").get(i);
						vo.setName(replyInfoName.text());
						Element replyInfoScore = doc2.select("div.review-box span.star_on").get(i);
						// System.out.println("style : " +
						// replyInfoScore.attr("style").substring(replyInfoScore.attr("style").indexOf("width")+6,replyInfoScore.attr("style").indexOf("%")));
						vo.setRate(Integer.parseInt(replyInfoScore.attr("style").substring(
								replyInfoScore.attr("style").indexOf("width") + 6,
								replyInfoScore.attr("style").indexOf("%"))) / 20);
						Element replyInfoDescription = doc2.select("div.review-box div.review").get(i);
						vo.setDescription(replyInfoDescription.text());
						Element replyInfoDate = doc2.select("div.review-box span.date").get(i);
						vo.setDate(replyInfoDate.text());
						replyList.add(vo);
						// System.out.println(vo.toString());
					}
					// foodVO.setReplyList(replyList);
					// String info = foodVO.display();
					// System.out.println("info : " + info);
					// System.out.println(foodVO.getTitleV());
					// 파일에 일단 저장해보자
					// saveToFile(info);
				} catch (Exception e) {
					System.out.println("Exception GetHotelInfo > WHILE");
					e.printStackTrace();
				}
				count++;
			}
			foodVO.setReplyList(replyList);
			// System.out.println(foodVO.getTitleV());
			dao.insertToDB(foodVO);
			System.out.print(".");

		} catch (Exception e) {
			System.out.println("can't get document - in GetHotelInfo");
			e.printStackTrace();
		}
	}

	// data 한 지역에서 가져오기
	public void getAllLocalHotel(String url) {

		try {
			Document doc = Jsoup.connect(url).get();
			foodVO.setLocationV(doc.select("h1.bigTitle").text());
			// 1. paging size를 구한다
			int pagingSize = doc.select("div.paging a").size();
			for (int i = 0; i < pagingSize; i++) {
				// 2. url을 결정한다
				String nextUrl = url + "&page=" + (i + 1);
				Document doc2 = Jsoup.connect(nextUrl).get();
				// 3. 각각의 a tag에 접근하면서, 데이터를 얻는다
				int hotelSize = doc2.select("div.spot_list li a").size();
				Elements hotel = doc2.select("div.spot_list a");
				for (int j = 0; j < hotelSize; j++) {
					getDataFromSite(origin + hotel.get(j).attr("href"));
					// System.out.println("hhhh : " + origin + hotel.get(j).attr("href"));
				}
			}

		} catch (Exception e) {

		}
	}

	public void getAllHotel(String url) {
		// 1. a개수만큼 돌기
		int tryCount = 0;
		String tmpUrl = "";
		try {
			Document doc = Jsoup.connect(url).get();
			int len = doc.select("div.tourCityBox a").size();
			Elements cities = doc.select("div.tourCityBox a");
			for (int i = 0; i < len; i++) {
				String nUrl = origin + cities.get(i).attr("href");
				tmpUrl = nUrl;
				// System.out.println(nUrl);
				try {
					Document doc2 = Jsoup.connect(nUrl).get();
					Elements city = doc2.select("#destSpotTypeList li");
					// System.out.println("city size : " + city.size());
					for (int j = 0; j < city.size(); j++) {
						if (city.get(j).text().equals("맛집")) {
							String lastUrl = origin + city.get(j).select("a").attr("href");
							// System.out.println("lastUrl : " + lastUrl);
							getAllLocalHotel(lastUrl);
							break;
						}
					}
				} catch (Exception e) {
					System.out.println(" Document - inner error : ");
					System.out.println("city exception : " + tmpUrl);
					tryCount++;
					System.out.println("try count : " + tryCount);
					if(tryCount >= 3) {
						tryCount = 0;
						e.printStackTrace();
						continue;
					}
					i--;
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println("city exception : " + tmpUrl);
			e.printStackTrace();
		}
	}

	public void saveToFile(String info) {
		BufferedOutputStream bs = null;
		try {
			bs = new BufferedOutputStream(new FileOutputStream("./data.txt"));
			bs.write(info.getBytes()); // Byte형으로만 넣을 수 있음
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bs.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
