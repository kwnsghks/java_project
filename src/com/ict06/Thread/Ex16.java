package com.ict06.Thread;
// �ΰ��� �����带 �����Ͽ� ù��° �������� ����� 1~50���� ����ϰ�,
// �ι�° �������� ����� 51~100���� ����ϰ�,
// �ٽ� ù��° �����尡 101~150���� ���,
// �ι�° �����尡 151~200���� ���(synchronized, wait, notify ���)
public class Ex16 implements Runnable{
	int d = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName()+":"+(++d));
		
			if(d==50 || d==100) {
				try {
					wait();
				} catch (Exception e) {
					e.printStackTrace();
				}	
			}else {
					notify();
			}
		}		
	}
}
