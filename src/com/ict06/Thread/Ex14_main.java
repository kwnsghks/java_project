package com.ict06.Thread;

public class Ex14_main {
	public static void main(String[] args) {
		Ex14 t1 = new Ex14();
		new Thread(t1,"dog").start();
		new Thread(t1,"cat").start();
		new Thread(t1,"tiger").start();
	}
}
