package com.ict02.array;

public class Ex01 {
	public static void main(String[] args) {
		// 배열 : 같은 자료형의 데이터들을 한 곳에 모아둔 묶음
		//        반드시 같은 자료형만 가능
		//        생성할때 크기를 지정해야 한다. 배열 크기는 변경불가
		//        배열을 출력할때 일반적으로 for문을 사용한다.
		
		// 배열 생성 순서 : 선언 -> 생성 -> 데이터 저장
		// 1. 선언 :  자료형[] 이름;  또는  자료형 이름[];
		// 2. 생성 :  이름 = new 이름의 자료형[배열의 크기];
		//            배열의 크기는 갯수, 빈 방의 수를 말한다.
		//            new 는 메모리에 데이터를 저장할 공간을 만들라는 예약어이다.
		//            다른 말로 인스턴스, 객체 생성, 객체화 
		// 3. 저장 : 이름[방번호=index=위치값] = 데이터 ;
		//           이 때 데이터는 같은 자료형이어야 한다.
		//           (작은 자료형이 큰자료형에게 들어갈 수 있다.)
		
		int[] su ;
		su = new int[5];
		su[0] = 123;
		su[1] = 'j';
		// 자료형이 다르거나 선언한 자료형보다 크면 데이터 저장 안됨
        // su[2] = 3.14;  
        // su[3] = true;
        // su[4] = "j";
		su[2] = 321;
		su[3] = 456;
		su[4] = 654;
		
		// 배열을 호출하면 주소가 나온다.
		System.out.println(su);
		
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println(su[4]);
		System.out.println();
		
		// i < 5 에서 5는 배열의 크기를 말한다. => su.length
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
        
	}
}









