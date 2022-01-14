package sideProject220114.account;

public class PostField {
	private String title;
	private String content;
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
		return "게시글 :  제목 : " + title + "\n 내용 :" + content ;
	}
	
}
