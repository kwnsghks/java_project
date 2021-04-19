package com.ict12.after;

public class Ex01 {
	// 메인 메소드 : JVM이 메인 메소드를 호출한다. 
	//               자바 프로그램을 시작하기 위해서 메인 메소드 호출(스타팅 포인트)
	
	public static void main(String[] args) {
	// 자료형 (데이터 타입) : 자바에서 자료를 분류하고 처리하는 형태
	// 1. 기본자료형 : 컴파일러에서 처리되는 자료형
	//                 boolean, char, byte, short, int, long, float, double
	// 2. 참조자료형 : 클래스를 자료형으로 사용
	//                 가장 대표적인 것이 String이다.

		// boolean : 논리형  =>  true 또는 false 만 저장.
		boolean b1 = true ;
		boolean b2 = false ;
		
		// char : 한글자만 저장 (저장될 때 숫자로 저장된다.)
		//        반드시 홑따옴표 사용
		//        숫자로 저장되기 때문에 연산 가능 
		//        숫자로 저장되지면 호출하면 다시 문자로 나온다.
		char c1 = 'a'; // c1에 a가 가지고 있는 97로 저장됨.
		char c2 = 97 ;  // c2에 97이 저장된다.
		System.out.println(c1); // a (호출하면 다시 문자로 나온다.)
		System.out.println(c2); // a (호출하면 다시 문자로 나온다.)
		
		// 정수형 숫자 : byte < short < int < long 
		// 정수형 숫자의 기본 자료형은 int 이다.
		// 주의사항 => byte 와 short를 연산하면 무조건 int 이상.
		// byte : -128~127,
		// short : -32768~32767
		// int 와 long 은 범위 외울필요 없음.
		// 앞으로 일반적인 정수는 int 이다.
		// long 은 숫자 뒤에 L 또는 l을 붙여야 한다.(생략가능)
		int s1 = 12 ;
		long s2 = 12L ;
		long s3 = 12 ;
		int s4 = 12 ;
		
		// 실수형 숫자 : float, double
		// 실수형의 기본자료형은 double 이다.
		// float는 숫자 뒤에 F 또는 f를 붙인다.(생략하면 오류)
		float k2 = 12.4f ;
		double k3 = 12.4 ;
		double k4 = 12.4f ;
		
		// ** 숫자는 작은 자료형에서 큰 자료형으로 저장되는 것은 오류 안남.(프로모션, 자동형변환)
		//    반대로 큰 자료형에서 작은 자료형으로 저장될 때는 오류 발생
		//    이렇게 오류가 발생하면 강제로 형변환 해서 오류를 없앤다.(디모션, 강제형변환)
		//    기준 : char < int < long < float < double
		//    강제형변환 : 왼쪽 자료형을 기준으로 만듦.
		
		int s5 = (int)(12L);
		float k1 = (float)(12.4);
		
		// 참조자료형 : 클래스를 자료형으로 만드는것
		//              가장 대표적인게 String
		String str1 = "대한민국";
		
		// String 자료형에서 + 연산 : -,*,/ 연산은 아예 없다. + 연산만 있음.
		//                           실제로 더하는 연산이 아닌 문자열과 문자를 연결하는 연산자.
		
		String str2 = "1000";
		int s6 = 1000;
		System.out.println(str2+1000); // 연결하는 연산을 함. 100010
		System.out.println(s6+1000); // 실제로 더한다 1010
		
		
		
	}
}
