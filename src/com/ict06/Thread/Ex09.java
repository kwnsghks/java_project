package com.ict06.Thread;

// Runnable �������̽��� run()�� ������ �ִ�.
public class Ex09 implements Runnable{
 @Override
public void run() {
	 while (true) {
	 	System.out.println(Thread.currentThread().getName()+": ����������");
 	}
 }
}
