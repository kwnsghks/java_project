package com.ict06.Thread;

public class Ex10 implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName()+" : 11111");
		}
	}
}
