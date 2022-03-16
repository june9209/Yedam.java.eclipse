package co.yedam.prj.border.command;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.prj.border.service.BorderService;
import co.yedam.prj.border.service.BorderVO;
import co.yedam.prj.border.serviceImpl.BorderServiceImpl;
import co.yedam.prj.common.Command;

public class BorderInsert implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		BorderService borderDao = new BorderServiceImpl();
		BorderVO vo = new BorderVO();
		
		vo.setBorderWriter(request.getParameter("borderWriter"));
		vo.setBorderDate(Date.valueOf(request.getParameter("borderDate")));
		vo.setBorderTitle(request.getParameter("borderTitle"));
		vo.setBorderContents(request.getParameter("borderContents"));
		
		int n = borderDao.borderInsert(vo);
		
		System.out.println(request.getParameter("borderWriter"));
		System.out.println(request.getParameter("borderDate"));
		System.out.println(request.getParameter("borderTitle"));
		System.out.println(request.getParameter("borderContents"));
		
		if (n != 0) {
			System.out.println("n : " + n);
			return "borderList.do";
		}else {
			request.setAttribute("message", "게시글 등록이 실패하였습니다.");
			return "border/borderError";
		}
	}

}
