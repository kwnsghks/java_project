package com.ict03.class01;

public class Ex05 {
	// 접근제한자 : 외부에서 접근하여 사용할 수 있는 단계를 구분
	// public :  누구나 다 접근 가능
	// protected : 같은패키지나 다른 패키지라도 상속관계이면 접근 가능
	// 생략      : 같은 패키지에서만 접근 가능
	// private   : 외부에서는 접근 불가 내부에서는 접근 가능
	
	public int s1 = 10 ;
	private int s2 = 20 ;
	public static int s3 = 30;
	private static int s4 = 40 ;
	
	public void add() {
		s1 = s1 + 10 ;
		s2 = s2 + 10 ;
		s3 = s3 + 10 ;
		s4 = s4 + 10 ;
	}
	
	private void add2() {
		s1 = s1 + 10 ;
		s2 = s2 + 10 ;
		s3 = s3 + 10 ;
		s4 = s4 + 10 ;
	}
	// 메소드가 메소드 호출가능
	void add3() {
	     add2();	
	}
	
	
}
