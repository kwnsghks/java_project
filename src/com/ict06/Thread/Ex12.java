package com.ict06.Thread;

public class Ex12 implements Runnable{
	@Override
	public void run() {
		System.out.println("run Ω√¿€");
		for (int i =1 ; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println("run ≥°");
	}
}
