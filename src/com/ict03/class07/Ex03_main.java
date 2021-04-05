package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		// 별도로 객체 생성 못함
		// Inner02 t1 = new Inner02();
		
		// Member 내부클래스 처럼 객체 생성 못함
		// Ex03 t1 = new Ex03();
		// Ex03.Inner02 t2 = t1.new Inner02();
		
		// 외부클래스 객체 생성
		Ex03 t1 = new Ex03();
		
		// 내부클래스를 가지고 있는 메소드를 실행해야 
		// 내부클래스 만들 조건 된다.
		// 내부클래스의 끝과 내부클래스를 가진 메소드의 끝 사이
		// 에서 객체를 생성과 실행을 해야 된다.
		t1.play();
	}
}
