package com.ict03.class05;

public class Ex02 {
	public static void main(String[] args) {
		// Ex01 멤버필드들이 static 이라은 증거
		// 객체 생성없이 클래스이름으로 접근할 수 있다.
		System.out.println(Ex01.su1);
		System.out.println(Ex01.su2);
		System.out.println(Ex01.su3);
		System.out.println(Ex01.su4);
		
		// 값변경이 안된다. => final
		/*
		System.out.println(Ex01.su1++);
		System.out.println(Ex01.su2++);
		System.out.println(Ex01.su3++);
		System.out.println(Ex01.su4++);
		*/
	}
}
