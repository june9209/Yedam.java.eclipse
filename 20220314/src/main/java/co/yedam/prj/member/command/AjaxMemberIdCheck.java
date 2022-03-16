package co.yedam.prj.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.yedam.prj.common.Command;
import co.yedam.prj.member.service.MemberService;
import co.yedam.prj.member.serviceImpl.MemberServiceImpl;

public class AjaxMemberIdCheck implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		MemberService memberDao = new MemberServiceImpl();
		String str = request.getParameter("str");
		boolean b = memberDao.isIdCheck(str);
		System.out.println(b);
		String result;
		if(!b) {
			result ="ajax:0"; //사용가능한 ID
		}else {
			result = "ajax:1";//이미 존재하는 ID
		}
		return result;
	}

}
