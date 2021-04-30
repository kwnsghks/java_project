package com.ict12.after;

public class Ex14 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음.
		//        반드시 같은 자료형이어야 함.
		//        배열을 생성할 때에 크기를 지정해야 한다.
		//        한번 지정된 크기는 변경할 수 없다.
		//        배열을 출력할 때는 일반적으로 for문을 사용한다.
		
		// 배열 생성 순서 : 선언 => 생성 => 데이터 저장
		// 1. 선언 : 자료형[] 이름; or 자료형 이름[];
		// 2. 생성 : 이름 = new 자료형[배열의 크기];
		//           배열의 크기는 갯수, 즉 비어있는 공간의 수를 말함.
		//           new 는 메모리에 데이터를 저장할 공간을 만들라는 예약어이다.
		//           다른 말로 인스턴스, 객체 생성  이라고 함.
		// 3. 저장 : 이름[index = 위치 값 = 방 번호] = 데이터 ;
		//           이 때 데이터는 같은 자료형이어야 한다.
		//           (작은 자료형이 큰 자료형에게 들어갈 수 있다.)
		//           ( byte < short < char < int < long < float < double )
		
		int[] su ;
		su = new int[5];
		
		// 배열을 호출하면 주소가 나온다.
		System.out.println(su);
		
		su[0] = 123;
		su[1] = 'a';   // char는 int 보다 작으므로 저장 가능.
		// su[2] = 21.3 ; 실수는 int 보다 크기 때문에 저장할 수 없다.
		// su[2] = true ;  자료형이 안맞아서 오류.
		// su[2] = "J" ; 자료형이 안맞아서 오류.
		su[2] = 456;
		
		// 배열 안에 있는 데이터 호출 : 배열이름[index]
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		
		System.out.println("===========");
		// su.length -> 배열의 길이를 의미.
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}

		System.out.println("===========");
		// 1. 선언과 생성을 한번에
		// int[] su ;         선언
		// su = new int[5];   생성
		
		// 3. 데이터 저장
		char[] c1 = new char[4] ;
		c1[0] = 'j' ; 
		c1[1] = 'a' ; 
		c1[2] = 'v' ; 
		c1[3] = 'a' ;
		System.out.println(c1);  // char자료형은 주소가 아니라 문자열로 나옴.(예외적인 사항)
		
		// 선언과 생성과 데이터 저장을 한번에
		String[] msg = {"java","DB","jsp","spring","android"};
		System.out.println(msg);  // String은 주소가 호출됨.
	}

}





