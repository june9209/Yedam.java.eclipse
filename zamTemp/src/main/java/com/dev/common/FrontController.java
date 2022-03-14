package com.dev.common;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.web.GoodsCommand;
import com.dev.web.LoginCommand;
import com.dev.web.MainCommand;

// 메인서블릿 => 필요한 컨트롤을 등록해서 사용하세요.
public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private HashMap<String, Command> map = new HashMap<String, Command>();

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/main.do", new MainCommand());
		// 메뉴 추가.
		map.put("/login.do", new LoginCommand());
		// 상품리스트 추가. 여기 컨트롤 등록하기.
		map.put("/goods.do", new GoodsCommand());
        // 이곳에 코드 추가.
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = uri.substring(contextPath.length());

		Command control = map.get(path);
		control.execute(request, response);

	}
}
