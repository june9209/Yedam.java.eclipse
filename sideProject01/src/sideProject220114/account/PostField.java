package sideProject220114.account;

public class PostField {

	private String title;
	private String content;
	private int pw;
	public int getPw() {
		return pw;
	}
	public void setPw(int pw) {
		this.pw = pw;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return " 제목 : " + title + "		내용 :" + content ;
	}
	
	
}
