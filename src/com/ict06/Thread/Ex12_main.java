package com.ict06.Thread;

public class Ex12_main {
	public static void main(String[] args) {
		System.out.println("main ����");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);  // Thread - Run target
		thread1.start();   //  Ex12�� ���� ������ ���� �� �ٽ� ���ƿȡ�
		
		// join() : ���� ������� join()�� ȣ���� �����尡 ���� ������
		//          �����¿� ���� �ִٰ� join()�� ȣ���� �����尡 ������ �ٽ� �����Ѵ�.
		//          ��, join()�� ȣ���� �����尡 ���� ������ ������ �� ����.
		try {
			thread1.join();    //  join -> Ex12�� ���������� Ex12_main�� ��ٷ��� ��.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 1; i < 51; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}  // <=�� join�� ���� ������ �ش� ���ξ������ ������ �ȵ�.
		System.out.println("main ��");
	}
}
