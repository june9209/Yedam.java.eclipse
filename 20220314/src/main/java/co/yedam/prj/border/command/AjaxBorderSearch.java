package co.yedam.prj.border.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.yedam.prj.border.service.BorderService;
import co.yedam.prj.border.service.BorderVO;
import co.yedam.prj.border.serviceImpl.BorderServiceImpl;
import co.yedam.prj.common.Command;

public class AjaxBorderSearch implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		BorderService borderDao = new BorderServiceImpl();
		String key = request.getParameter("key");
		String val = request.getParameter("value");
		List<BorderVO> list = borderDao.borderSelectSearchList(key, val);
		String data = null;
		try {
			data = new ObjectMapper().writeValueAsString(list);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "ajax:"+ data;
	}

}
