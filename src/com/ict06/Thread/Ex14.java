package com.ict06.Thread;

public class Ex14 implements Runnable{
	// 동기화 처리할 때 실행중인 스레드를 강제로 대기상태로
	// 변경시키는 메소드를 wait() - '재운다'라고 한다.
	// 한번 wait()된 스레드는 풀어주지 않으면 그대로 
	// 대기상태에서 프로그램이 종료된다.
	// wait() 된 스레드를 풀어주는 메소드를 notify()-'깨운다',
	// notifyAll() - '모두 깨운다'이라고 한다.
	
	int x = 0 ;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
			
			if(x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}	
	}
}
