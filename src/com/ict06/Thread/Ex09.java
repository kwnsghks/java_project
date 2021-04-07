package com.ict06.Thread;

// Runnable 인터페이스는 run()만 가지고 있다.
public class Ex09 implements Runnable{
 @Override
public void run() {
	 while (true) {
	 	System.out.println(Thread.currentThread().getName()+": 가가가가가");
 	}
 }
}
