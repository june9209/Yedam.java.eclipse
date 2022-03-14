package com.dev.serviceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dev.common.DAO;
import com.dev.service.GoodService;
import com.dev.vo.GoodVO;


// GoodService를 구현하는 클래스.
public class GoodServiceImpl extends DAO implements GoodService {
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<GoodVO> goodslist() {
		String sql = "select * from goods";
		List<GoodVO> list = new ArrayList<>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				GoodVO goods = new GoodVO();
				
				goods.setProdCode(rs.getString("prod_code"));
				goods.setProdName(rs.getString("prod_name"));
				goods.setProdDesc(rs.getString("prod_desc"));
				goods.setProdImage(rs.getString("prod_image"));
				goods.setProdPrice(rs.getInt("prod_price"));
				goods.setSalePrice(rs.getInt("sale_price"));
				goods.setLikeIt(rs.getInt("like_it"));
				
				list.add(goods);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		
		return list;
	}
	
	private void close() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
}
}
