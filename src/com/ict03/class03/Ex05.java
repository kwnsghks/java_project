package com.ict03.class03;

// phone의 기능을 갖는 클래스
public class Ex05 {
	String s_sms ;
	
	public void call() {
		System.out.println("전화기능");
	}
	public String sms() {
		s_sms = "문자기능";
		return s_sms ;
	}
}
