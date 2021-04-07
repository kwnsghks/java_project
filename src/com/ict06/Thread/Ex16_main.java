package com.ict06.Thread;

public class Ex16_main {
	public static void main(String[] args) {
		Ex16 t1 = new Ex16();
		
		Thread thread_1 = new Thread(t1,"dog");
		thread_1.start();
		
		Thread thread_2 = new Thread(t1,"cat");
		thread_2.start();
	}
}
