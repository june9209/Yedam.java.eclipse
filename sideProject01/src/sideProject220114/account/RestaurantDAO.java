package sideProject220114.account;

import java.util.List;

public interface RestaurantDAO {
	//유저정보 전체 확인
	public List <userField> selectAllUser();
	
	//회원가입
	public void userAccount(userField user);
	//로그인
	public int login(String userid,String userPassword);
	//등록된가게
	public List<restaurantField> store();
	//가게추가
	public void enterStore(userField user);
	//후기게시판
	public void post(PostField post);
}
