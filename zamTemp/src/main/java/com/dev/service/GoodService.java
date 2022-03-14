package com.dev.service;

import java.util.List;

import com.dev.vo.GoodVO;

public interface GoodService {
	// 1) 전체리스트 기능.
	// 2) 한건 조회 기능.
	public List<GoodVO> goodslist();
	
}
