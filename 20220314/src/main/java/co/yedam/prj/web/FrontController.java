package co.yedam.prj.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.prj.border.command.AjaxBorderSearch;
import co.yedam.prj.border.command.AjaxSortBorder;
import co.yedam.prj.border.command.BorderInsert;
import co.yedam.prj.border.command.BorderInsertForm;
import co.yedam.prj.border.command.BorderList;
import co.yedam.prj.border.command.BorderView;
import co.yedam.prj.common.Command;
import co.yedam.prj.home.command.HomeCommand;
import co.yedam.prj.member.command.AjaxMemberIdCheck;
import co.yedam.prj.member.command.MemberJoin;
import co.yedam.prj.member.command.MemberJoinForm;
import co.yedam.prj.member.command.MemberList;
import co.yedam.prj.member.command.MemberLogin;
import co.yedam.prj.member.command.MemberSearch;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>();
    public FrontController() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		map.put("/home.do", new HomeCommand()); 		//처음들어오는페이지
		map.put("/memberList.do", new MemberList());	//회원목록보기
		map.put("/memberSearch.do", new MemberSearch());//한명조회
		map.put("/memberLogin.do", new MemberLogin());	//로그인
		map.put("/ajaxMemberIdCheck.do", new AjaxMemberIdCheck());	//ajax이용한 아이디중복체크
		map.put("/memberJoinForm.do", new MemberJoinForm());	//회원가입 폼 호출
		map.put("/memberJoin.do", new MemberJoin());	//회원가입 
		map.put("/borderList.do", new BorderList());	//게시글 목록 
		map.put("/borderInsertForm.do", new BorderInsertForm());	//게시글 목록 
		map.put("/borderInsert.do", new BorderInsert());	//게시글 목록 
		map.put("/borderView.do", new BorderView()); 		//게시글 상세보기
		map.put("/ajaxBorderSearch.do", new AjaxBorderSearch()); // 게시글 리스트에서 검색
		map.put("/ajaxSortBorder.do", new AjaxSortBorder()); // 게시글 리스트에서 검색
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String page = uri.substring(contextPath.length());
		
		Command comm = map.get(page);
		String viewPage = comm.exec(request, response);
		
		if(!viewPage.endsWith(".do")) {
			if(viewPage.startsWith("ajax:")) {
				//ajax 처리
				response.setContentType("text/html; charset=UTF-8");
				response.getWriter().append(viewPage.substring(5));
				return ;
			}else {
//				viewPage = "WEB-INF/views/" + viewPage + ".jsp";
				viewPage = viewPage + ".tiles";
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}
}
