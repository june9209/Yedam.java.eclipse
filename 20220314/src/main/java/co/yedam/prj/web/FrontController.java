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

import co.yedam.prj.common.Command;
import co.yedam.prj.home.command.HomeCommand;
import co.yedam.prj.member.command.MemberList;
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
			}else {
				viewPage = "WEB-INF/views/" + viewPage + ".jsp";
			}
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
