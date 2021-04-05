package com.ict03.class01;

public class Ex15 {
	int s1 = 100 ;
	
	// 초기화 전 데이터는 초기화를 만나면 없어진다.
	static int s2 = 200 ;
	
	// static 초기화 
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
		// s5 = 5000;
	}
	// 초기화 이후 선언해도 오류 발생 안함
	static int s3 = 300;
	static int s4 ;
	
	public static void main(String[] args) {
		// main()도 static 이므로 전역변수가 instance이면 사용할 수 없다.
		// System.out.println(s1);
		System.out.println(s2);  // 2000
		System.out.println(s3);  // 300
		System.out.println(s4);  // 4000
		
	
	}
}









