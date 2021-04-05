package com.ict03.class06;

enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02 {
	String name ;
	int size ;
	Type type;
	
	public static void main(String[] args) {
		// 오류
		// System.out.println(name);
		// 객체를 만들어서 사용할 수 있다.
		Ex02 shose = new Ex02();
		shose.name = "나이키";
		shose.size = 275 ;
		shose.type = Type.WALKING;
		System.out.println("신발이름 : " + shose.name );
		System.out.println("신발사이즈 : " + shose.size);
		System.out.println("신발타입 : " + shose.type);
	}
}
