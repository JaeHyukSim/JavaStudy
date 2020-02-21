import java.util.ArrayList;

public class HotelVO {
	private String id;
	private String titleV;
	private int categoryV;
	private double starV;
	private String local_nameV;
	private ArrayList<String> imageList;
	private String areaV;
	private String addressV;
	private String callV;
	private String websiteV;
	private String howtoV;
	private String descriptionV;
	private ArrayList<ReviewTypeAVO> replyList;
	private String locationV;

	public HotelVO() {
		imageList = new ArrayList<String>();
		replyList = new ArrayList<ReviewTypeAVO>();
	}

	public String getTitleV() {
		return titleV;
	}

	public void setTitleV(String titleV) {
		this.titleV = titleV;
	}

	public int getCategoryV() {
		return categoryV;
	}

	public void setCategoryV(int categoryV) {
		this.categoryV = categoryV;
	}

	public double getStarV() {
		return starV;
	}

	public void setStarV(double starV) {
		this.starV = starV;
	}

	public String getLocal_nameV() {
		return local_nameV;
	}

	public void setLocal_nameV(String local_nameV) {
		this.local_nameV = local_nameV;
	}

	public ArrayList<String> getImageList() {
		return imageList;
	}

	public void setImageList(ArrayList<String> imageList) {
		this.imageList = imageList;
	}

	public String getAreaV() {
		return areaV;
	}

	public void setAreaV(String areaV) {
		this.areaV = areaV;
	}

	public String getAddressV() {
		return addressV;
	}

	public void setAddressV(String addressV) {
		this.addressV = addressV;
	}

	public String getCallV() {
		return callV;
	}

	public void setCallV(String callV) {
		this.callV = callV;
	}

	public String getWebsiteV() {
		return websiteV;
	}

	public void setWebsiteV(String websiteV) {
		this.websiteV = websiteV;
	}

	public String getHowtoV() {
		return howtoV;
	}

	public void setHowtoV(String howtoV) {
		this.howtoV = howtoV;
	}

	public String getDescriptionV() {
		return descriptionV;
	}

	public void setDescriptionV(String descriptionV) {
		this.descriptionV = descriptionV;
	}

	public ArrayList<ReviewTypeAVO> getReplyList() {
		return replyList;
	}

	public void setReplyList(ArrayList<ReviewTypeAVO> replyList) {
		this.replyList = replyList;
	}

	public String getLocationV() {
		return locationV;
	}

	public void setLocationV(String locationV) {
		this.locationV = locationV;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String replyDisplay() {
		String ans = "";
		int i = 0;
		if(replyList.size() == 0) {
			return "";
		}
		for(i = 0; i < replyList.size(); i++) {
			ans += replyList.get(i).reviewDisplay() + "☆";
		}
		
		return ans;
	}
	public String imageDisplay() {
		String ans = "";
		int i = 0;
		if(imageList.size() == 0) {
			return "";
		}
		for(i = 0; i < imageList.size()-1; i++) {
			ans += imageList.get(i) + "★";
		}
		ans += imageList.get(i);
		return ans;
	}

	public String display() {
		String data = "locationV : " + locationV + ", GetHotelInfo [titleV=" + titleV + ", categoryV=" + categoryV
				+ ", starV=" + starV + ", local_nameV=" + local_nameV + "\n";
		for (int i = 0; i < imageList.size(); i++) {
			data += (imageList.get(i)) + "\n";
		}
		data += "areaV=" + areaV + ", addressV=" + addressV + ", callV=" + callV + ", websiteV=" + websiteV
				+ ", howtoV=" + howtoV + ", descriptionV=" + descriptionV;
//		for (int i = 0; i < replyList.size(); i++) {
//			data +=(replyList.get(i))  + "\n";
//		}
		data += "]" + "\n";
		return data;
	}
}
