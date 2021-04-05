package com.ict03.class04;

public abstract class Ex01 {
	// 추상 클래스 : 추상메소드를 가지고 있는 클래스를 추상클래스라고 한다.
	//               일반적인 메소드와 필드를 가질 수 있다.
	//               추상클래스에는 반드시 abstract 예약어를 사용한다.
	
	// 추상 메소드 : 구체화가 되지 않은 메소드를 의미한다.
	//               body 블록이 존재하지 않은 메소드를 말한다.
	//               body 블록이 없으면 실행문도 없다.(구체화가 되지 않았다는 뜻)
	//               추상메소드에는 반드시 abstract 예약어를 사용한다.
	
	// 다형성 : 하나의 메소드나 클래스가 있을 때 
	//          이것들을 다양한 방법으로 동작시키는 것을 의미한다.
	
	
	int s1 = 10 ;                // 인스턴스 변수
	static int s2 = 10 ;         // static 변수
	final int S3 = 10 ;          // 인스턴스 상수
	static final int S4 = 10;    // static 상수
	
	public void play() {
		System.out.println("인스턴스 메소드");
	}
	public static void prn() {
		System.out.println("static 메소드");
	}
	// 추상메소드
	public abstract void sound() ;
}










