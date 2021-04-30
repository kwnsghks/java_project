package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {

	public static void main(String[] args) {
		// JDBC(Java Database Connectivity)는 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API이다. 
		// JDBC는 데이터베이스에서 자료를 쿼리하거나 업데이트하는 방법을 제공한다.
		// 각 데이터베이스들에게 접속할 수 있는 JDBC 드라이버가 필요하다.
		// MySQL에 필요한 드라이버를 다운받아서 해당 프로젝트에 참조해야된다.
		// 프로젝트에서 마우스 오른쪽 - Build path - Configure Build path - Add External jars..
		// 해당 라이브러리 선택
			
			// DB처리에 필요한 클래서 3개를 선언
			Connection conn = null;   // DB접속에 필요 (java.sql 로 써야함)
			Statement stmt = null;
			ResultSet rs = null;      // select 문의 결과를 받는다.
			int result = 0 ;          // insert, updatem delete의 결과
			try {
				// 1. 드라이버 로딩
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				// 2. 접속을 위한 정보(3개)
				// 계정 생성시 localhost로 만들면 //localhost/ 사용  (test01은 test02와 다르게 로컬 호스트로 썼기 때문)
				String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
				String user = "test01";
				String password = "1111";
				conn = DriverManager.getConnection(url, user, password);   // url = MySQL에서 service를 말함.
				
				// 3.쿼리문 작성 (CRUD = 조작어 insert, update, delete, select)
				String sql = "select * from customer";
				
				// 4. 실제 DB에 접속 정보를 가지고 Statement 클래스에 저장함.
				stmt = conn.createStatement();
				
				// 5. Statement 클래스에 쿼리 저장 후
				// DB에 결과를 받아서 처리한다.
				// 이 때 두가지로 나눠진다. select문 일때와 아닐 때로 나뉨.
				
				// select문 일때는 ResultSet 클래스가 받는다.
				rs = stmt.executeQuery(sql);
				// select문이 아닌 경우 int가 받는다.
				// result = stmt.executeUpdate(sql);
				
				// 6. 결과보기
				// .next() => 다음 줄에 정보가 있으면 true
				while(rs.next()) {
					System.out.print(rs.getInt("custid")+"\t");
					System.out.print(rs.getString("name")+"\t");
					System.out.print(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone"));
				}
			} catch (Exception e) {
			}finally{	
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}

	}

}
