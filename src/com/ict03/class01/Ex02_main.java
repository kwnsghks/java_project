package com.ict03.class01;

public class Ex02_main {
	public static void main(String[] args) {
		// static은 객체 생성과 상관없이 미리 만들어진다.
		
		// 호출은 클래스이름.메소드, 클래스이름.변수
		// System.out.println(Ex02.k1);  // 인스턴스
		System.out.println(Ex02.k2);   
		// System.out.println(Ex02.K3);   // 인스턴스 
		System.out.println(Ex02.K4);
		
		// void 는 정보가 넘어오지 않는다.
		Ex02.prn02();
		
		// void가 아니면 반드시 반환형에 맞춰서 저장하자 
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		System.out.println("====객체 생성 전후====");	
		
	// 1. Ex02클래스를 사용하기 위해서 클래스를 객체로 만들자
	//    Ex02클래스는 생성자가 존재하지 않으므로 기본생성자로 객체 생성한다.
	//    기본생성자란 인수=매개변수가 없는 생성자 ('클래스이름()') 
	//  클래스  참조변수 =  new   생성자 ;
		Ex02  test = new Ex02();
		// 주소
		System.out.println(test);
		System.out.println(test.k1);
		System.out.println(test.k2);
		System.out.println(Ex02.k2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		System.out.println(Ex02.K4);
		
		// 메소드 실행 
		test.prn01();
		test.prn02();
		Ex02.prn02();
		int su2 = test.prn03();
		System.out.println(su2);
		
		double su3 = test.prn04();
		System.out.println(su3);
		
		double su4 = Ex02.prn04();
		System.out.println(su4);
		
	}
}

















