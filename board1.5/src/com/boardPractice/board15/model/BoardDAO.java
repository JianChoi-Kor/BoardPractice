package com.boardPractice.board15.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
	// 리스트를 받아와서 저장하는 메서드
	public static List<BoardEntity> selBoardList() {
		List<BoardEntity> list = new ArrayList<>();
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String sql = "SELECT i_board, title, r_dt FROM board15";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int i_board = rs.getInt("i_board");
				String title = rs.getString("title");
				String r_dt = rs.getString("r_dt");
				
				BoardEntity data = new BoardEntity();
				data.setI_board(i_board);
				data.setTitle(title);
				data.setR_dt(r_dt);
				
				list.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps, rs);
		}
		return list;
	}
	
	public static void insBoard(BoardEntity param) {
		Connection con = null;
		PreparedStatement ps = null;
		
		String sql = "INSERT INTO board15 (title, ctnt) VALUES (?, ?)";
		
		try {
			con = DbUtils.getCon();
			ps = con.prepareStatement(sql);
			ps.setString(1, param.getTitle());
			ps.setString(2, param.getCtnt());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DbUtils.close(con, ps);
		}
	}
}

