package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static 객체 생성과 상관없이 사용가능
		// 클래스이름.멤버필드, 클래스이름.멤버메소드
		System.out.println(Ex05.s3);
		
		// static 이라도 private은 접근 할 수 없다.
		// System.out.println(Ex05.s4);
		
		Ex05 test = new Ex05();
		System.out.println(test.s1);
		
		// private은 접근 안됨
		//System.out.println(test.s2);
		
		System.out.println(test.s3);
		
		// 메소드들도 마찮가지 
		test.add();
		// 접근 안됨
		// test.add2();
		
		test.add3();
		
	}
}
