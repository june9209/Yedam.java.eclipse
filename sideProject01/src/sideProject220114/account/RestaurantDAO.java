package sideProject220114.account;

import java.util.List;

public interface RestaurantDAO {
	//유저정보 전체 확인
	public List <userField> selectAllUser();
	//회원가입
	public void userAccount(userField user);
	//등록된 음식점 출력
	public List <restaurantField> searchRestaurant(String store);
	//로그인
	public int login(String userid,String userPassword);
	//등록된가게
	public List<restaurantField> store();
	//가게추가
	public void enterStore(restaurantField menu);
	//후기게시판
	public void post(PostField post);
	//게시판 삭제
	public void postDelete(String post);
	//게시판 수정
	public void postUpdate(String newtitle, String newcontent, String postTitle);
	//게시판 조회
	public List<PostField> postList();
	//게시판 비밀번호 확인
	public boolean checkPw(String title, int checkPw);
	
}
