package com.ict06.Thread;

public class Ex13_main {
	public static void main(String[] args) {
		Ex13 t1 = new Ex13();
		
		new Thread(t1,"dog").start();
		new Thread(t1,"cat").start();
		new Thread(t1,"tiger").start();
		new Thread(t1,"lion").start();
	}
}
