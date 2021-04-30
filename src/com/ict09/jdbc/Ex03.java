package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {

	public static void main(String[] args) {
		// DB접속에 필요한 클래스 3개
		Connection conn = null ;
		Statement stmt = null ;
		ResultSet rs = null ;   // select 문 결과 받기 클래스
		int result = 0 ;        // select 문을 제외한 나머지 결과받기
		
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. 접속 정보
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "test01" ;
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. 쿼리문
			//  customer테이블에서 custid 가 7인 사람의 이름을 '박찬호', 주소를 '대한민국 서울' 로 변경하자
			String sql = "update customer set name = '박찬호', address = '대한민국 서울' where custid = 7" ;
			
			// 4. 실제 DB에 보낼 준비
			stmt = conn.createStatement();
			
			// 5. 실제 보내고 결과 받기
			//    select문이면 => rs.stmt.excuteQuery(sql);
			
			//    select문이 아니면 
			result = stmt.executeUpdate(sql);
			
			// System.out.println(result);
			if(result>0) {
				System.out.println("갱신 성공");
				
				sql = "select * from customer" ;
				stmt = conn.createStatement() ;
				rs = stmt.executeQuery(sql) ;
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
			}else {
				System.out.println("갱신 실패-1");
			}
			
		} catch (Exception e) {
			System.out.println("update 실패-2");
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}	
		}
	}

}
