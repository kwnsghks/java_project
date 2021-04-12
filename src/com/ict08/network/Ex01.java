package com.ict08.network;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		// InetAddress : 자바에서 IP주소를 표현하는 클래스
		//               생성자가 존재하지만 사용하지 않는다.
		//               6개의 static 메소드를 이용한다.
		// ** localhost : 현재 내가 사용하고 있는 컴퓨터를 말함.

		try {
			InetAddress addr = InetAddress.getByName("www.naver.com");   
			System.out.println("이름 : " + addr.getHostName());    
			// ↓ DNS가 www.naver.com을 223.130.195.200로 바꿔줌.
			System.out.println("주소 : " + addr.getHostAddress());   
			System.out.println("toString : " + addr.toString());
			System.out.println("==================================");
			
			// 내컴퓨터에 관한 정보
			addr = InetAddress.getLocalHost();
			System.out.println("이름 : " + addr.getHostName());    
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("==================================");
			
			InetAddress[] addrs = InetAddress.getAllByName("m.naver.com");
			for (InetAddress k : addrs) {
				System.out.println("이름 : " + k.getHostName());    
				System.out.println("주소 : " + k.getHostAddress());
				System.out.println("toString : " + k.toString());
				System.out.println("==================================");
			}
			// 125.209.222.137
			byte[] b = {125,(byte)209,(byte)222,(byte)137};
			addr = InetAddress.getByAddress(b);
			System.out.println("이름 : " + addr.getHostName());    
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
			System.out.println("==================================");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
