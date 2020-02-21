
public class ReviewTypeAVO {
	private String image;
	private String name;
	private int rate;
	private String description;
	private String date;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	public String reviewDisplay() {
		String ans = "";
		ans = image + "★" + name + "★" + rate + "★" + description + "★" + date;
		return ans;
	}
	
	
}
