package sideProject220114.account;

import java.util.List;

public interface RestaurantDAO {
	//회원가입
	public void userAccount(userField user);
	//로그인
	public void login(userField user);
	//등록된가게
	public List<restaurantField> store();
	//가게추가
	public void enterStore(userField user);
	//후기게시판
	public void post(PostField post);
}
