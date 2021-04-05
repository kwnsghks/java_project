package com.ict03.class03;

public class Ex14 {
	String name = "홍길동";
	int age = 27 ;
	
	// 기본생성자
	/*
	public Ex14() {
		System.out.println("부모클래스 생성자 : " + this);
		age = 17 ;
	}
	*/
	// 다른 생성자
	public Ex14(String name, int age) {
		this.name = name;
		this.age = age;
	}

}
