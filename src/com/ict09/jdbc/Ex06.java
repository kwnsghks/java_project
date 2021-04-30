package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// �����͸� �޾Ƽ� vo�� ���� 
		Scanner scan = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0 ;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// ���� ���鶧 'test02'@'%'
			String url = "jdbc:mysql://203.236.220.91:3306/test02db?characterEncoding=UTF-8&serverTinmezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			esc : while(true) {
				System.out.println("�й� : ");
				int no = scan.nextInt();
				System.out.print("�̸� : ");
				String name = scan.next();
				System.out.println("�а� : ");
				String det = scan.next();
				System.out.println("�ּ� : ");	
				String addr = scan.next();
				System.out.println("��ȭ : ");
				String tel = scan.next();
				
				// ���� ���� ����
				list.add(new VO (no, name, det, addr, tel));
				while(true) {
					System.out.print("����ұ��?(y/n)");
					String msg = scan.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						continue;
					}
				}
			}
			// �������� DB�Է�
			for (VO vo : list) {
				String sql = "insert into student_tb(no, name, det, addr, tel)"
						+ "values(1, '"+vo.getName()+"','"+ vo.getDet()+"','"
						+ vo.getAddr()+"','"+vo.getTel()+"')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
			}
			if(result<0) {
				System.out.println("�����߻�");
			}
		
		String sql = "select * from student_tb";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		System.out.println("��ȣ\t�̸�\t�а�\t�ּ�\t��ȭ");
		while(rs.next()) {
			System.out.print(rs.getInt("no")+"\t");
			System.out.print(rs.getString("name")+"\t");
			System.out.print(rs.getString("det")+"\t");
			System.out.print(rs.getString("addr")+"\t");
			System.out.print(rs.getString("tel"));
		}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}

	}

}
