package com.ict06.Thread;

// �Һ���
public class Ex19_Customer implements Runnable{
	private Ex17_Car car;
	public Ex19_Customer(Ex17_Car car) {
		this.car = car ;
	}
		public void run() {
			String carName = null;
			for (int i = 0; i < 20; i++) {
				// �ڵ����� ����
				carName = car.pop();
				// ������ 
				try {
					Thread.sleep((int)(Math.random()*200));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
