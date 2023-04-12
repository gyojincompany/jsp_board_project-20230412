package com.gyojincompany.board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDao {
		
		private String driverName = "com.mysql.jdbc.Driver";
		private String url = "jdbc:mysql://localhost:3306/jspdb";
		private String username = "root";
		private String password = "1234";
		
		public void write(String writer, String subject, String content) {
			
			Connection conn = null;
			PreparedStatement pstmt = null;
			
			String sql = "INSERT INTO board(writer, subject, content) VALUES (?,?,?)";
			
			try {
				Class.forName(driverName);
				conn = DriverManager.getConnection(url, username, password);
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, writer);
				pstmt.setString(2, subject);
				pstmt.setString(3, content);			
				
				pstmt.executeUpdate();
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstmt != null) {
						pstmt.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}			
			}
			
		}
		
		

}
