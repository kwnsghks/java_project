package com.ict03.class01;

public class Ex13_main {
	public static void main(String[] args) {
		Ex13 t1 = new Ex13();
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getAge());
		System.out.println(t1.getAddr());
		System.out.println();
		
		Ex13 t2 = new Ex13(5, "¸¶ÀÌÄÝ");
		System.out.println(t2.getName());
		System.out.println(t2.getAge());
		System.out.println(t2.getAddr());
		System.out.println();
	}
}
