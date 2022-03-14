package com.dev.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.common.Command;
import com.dev.common.HttpUtil;
import com.dev.service.GoodService;
import com.dev.serviceImpl.GoodServiceImpl;
import com.dev.vo.GoodVO;

public class GoodsCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		GoodService service = new GoodServiceImpl();
		List<GoodVO>list = service.goodslist();
		
		
		request.setAttribute("list", list);

		for (GoodVO goodVO : list) {
			System.out.println(goodVO.getProdImage());
			 
		}
		HttpUtil.forward(request, response, "good/goodsList.tiles");
	}

}
