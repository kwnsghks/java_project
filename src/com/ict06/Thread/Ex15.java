package com.ict06.Thread;

// ���� : �� ���� �����带 �����Ͽ� ù��° �������� ����� 1~100���� ����ϰ�
//        �ι�° �������� ����� 101~200���� ����϶� (synchronized ���)
public class Ex15 implements Runnable {

	@Override
	public synchronized void run() {
		System.out.println();
		int x = 0;
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++x));
		}
		System.out.println();
	}
	
	
	
}
