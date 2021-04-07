package com.ict06.Thread;

public class Ex09_main {

	public static void main(String[] args) {
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
	// Ex07, Ex08, Ex09 는 Runnable을 상속받았기 때문에
	// start()가 없다.
	// t1.start();
		
		// ↓ 실행할 run() 메소드를 가진 클래스 즉 타겟을 지정해야 한다.
		// Thread thread1 = new Thread();  ←  타겟이 없으므로 실행x
		Thread thread1 = new Thread(t1); // ← 이름을 가지고 있어서 호출 가능o
		thread1.start();
		
		new Thread(t2).start();   // ←위와 차이점 : 이름이 없으므로 호출x
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		// 안드로이드에서 많이 사용하는 방법(익명 내부 클래스)
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
				 	System.out.println(Thread.currentThread().getName()+": ㅁㅁㅁㅁㅁ");
			 	}
			}
		}).start();
	}

}

// runnable을 더 많이 씀 (다른걸 상속받을 수 있음.)
// ex3,4,5,6 스레드 상속 방법은 상속을 못받음






