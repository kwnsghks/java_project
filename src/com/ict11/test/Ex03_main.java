package com.ict11.test;

public class Ex03_main {

	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		
		Thread thread_1 = new Thread(t1,"dog");
		thread_1.start();
		
		Thread thread_2 = new Thread(t1,"cat");
		thread_2.start();

	}

}
