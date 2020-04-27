package wewEat_Kim;

import java.io.Serializable;

public class WeModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3271296868045402918L;
	// 멤버변수
	private int uid;			// 고유 아이디
	private int category;		// 카테고리
	private String name;		// 식당이름
	private String menu;		// 메뉴
	private int price;			// 가격
	private int rating;			// 평점
	private String memo;		// 메모
	transient int randomNumber;
	
	// 기본 생성자
	public WeModel() {
		this.category = 0;
		this.name = "";
		this.menu = "";
		this.price = 0;
		this.rating = 0;
		this.memo = "";
	}
	
	// 매개변수 생성자 (정규생성)
	public WeModel(int category, String name, String memu, int price, int rating, String memo) {
		this.category = category;
		this.name = name;
		this.menu = memu;
		this.price = price;
		this.rating = rating;
		this.memo = memo;
	}
	
	// 매개변수 생성자 (축소생성 이름,카테고리)
	public WeModel(int category, String name) {
		this.category = category;
		this.name = name;
	}

	public int getUid() {return uid;}
	public void setUid(int uid) {this.uid = uid;}

	public int getCategory() {return category;}
	public void setCategory(int category) {this.category = category;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getMenu() {return menu;}
	public void setMenu(String menu) {this.menu = menu;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public int getRating() {return rating;}
	public void setRating(int rating) {this.rating = rating;}

	public String getMemo() {return memo;}
	public void setMemo(String memo) {this.memo = memo;}
	
	
	
	
}
