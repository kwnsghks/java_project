package com.ict06.Thread;

public class Ex15_main {
	public static void main(String[] args) {
		System.out.println();
		Ex15 t1 = new Ex15();
		
		Thread thread_1 = new Thread(t1,"dog") ;
		thread_1.start();
		
		Thread thread_2 = new Thread(t1,"cat") ;
		thread_2.start();
		
		
	}
}
