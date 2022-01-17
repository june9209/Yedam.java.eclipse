package sideProject220114.account;

public class restaurantField {
	//필드
	private String restaurant;
	private String menu;
	private int price;
	private int menuNo;
	private int like;

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(int menuNo) {
		
		this.menuNo += menuNo;
	}

	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "가게 이름 : " + restaurant;
	}
	public String toString1() {
		return "메뉴 번호 : "+ menuNo +", 메뉴 : "+menu+ ", 가격 : "+ price;
	}
//		return "
	
}
