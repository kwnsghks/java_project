package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);  // Thread - Run target
		thread1.start();   //  Ex12로 가서 스레드 실행 후 다시 돌아옴↓
		
		// join() : 현재 스레드는 join()을 호출한 스레드가 끝날 때까지
		//          대기상태에 빠져 있다가 join()를 호출한 스레드가 끝나면 다시 실행한다.
		//          즉, join()를 호출한 스레드가 끝날 때까지 실행할 수 없다.
		try {
			thread1.join();    //  join -> Ex12가 끝날때까지 Ex12_main은 기다려야 함.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}  // <=← join이 끝날 때까지 해당 메인쓰레드는 실행이 안됨.
		System.out.println("main 끝");
	}
}
