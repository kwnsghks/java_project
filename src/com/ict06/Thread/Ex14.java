package com.ict06.Thread;

public class Ex14 implements Runnable{
	// ����ȭ ó���� �� �������� �����带 ������ �����·�
	// �����Ű�� �޼ҵ带 wait() - '����'��� �Ѵ�.
	// �ѹ� wait()�� ������� Ǯ������ ������ �״�� 
	// �����¿��� ���α׷��� ����ȴ�.
	// wait() �� �����带 Ǯ���ִ� �޼ҵ带 notify()-'�����',
	// notifyAll() - '��� �����'�̶�� �Ѵ�.
	
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
