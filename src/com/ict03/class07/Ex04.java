package com.ict03.class07;

// 3. static 내부클래스
public class Ex04 {
	String name = "홍길동";
	private int age = 24 ;
	static String addr = "제주도";
	
	public Ex04() {
		System.out.println("외부클래스 생성자 : " + this);
	}
	
	public void sound() {
		int money = 1000;
		final int  time = 2 ;
		// 지역변수는 static 사용 불가
		//static int number = 12;
		// static final int number2 = 12;
		System.out.println("외부클래스 메소드 : "+ name +", money : " + money);
	}
	
	
	public static class Inner03 {
		String name = "홍일점";
		final int i2 = 10;
		// 내부클래스에서는 static 사용 못함
		// 강제로 static를 사용하고자 하려면 내부클래스에도 static를 붙이자 
		static int i3 = 20;
		static final int i4 = 30;
		
		 public Inner03() {
			System.out.println("내부클래스 생성자 : "+this);
		}
		 
		 // 내부클래스는 외부클래스의 메소드와 필드를 마음대로 사용가능
		 // 내부클래스 메소드
		 public void play() {
			 int money = 50000;
			 System.out.println("이름 : " + name);
			 System.out.println("금액 : " + money);
			 
			 // 외부클래스의 필드 static를 붙어야 사용 가능
			 // System.out.println("나이 : " + age);
			
			 // 외부클래스 메소드 static를 붙어야 사용 가능 
			 //sound();
		 }
	}
}












