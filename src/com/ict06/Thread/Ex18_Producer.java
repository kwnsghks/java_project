package com.ict06.Thread;

public class Ex18_Producer implements Runnable{
	// Ŭ������ �ڷ������� �����. (�������ڷ��� : Ŭ������ �ڷ������� ��ٴ� ��.)
	private Ex17_Car car;
	
	// �����ڿ��� ���� ���ڴ� ������ ���������� ������ �� why?
	public Ex18_Producer(Ex17_Car car) {
		// ���������� ���������� �̸��� ���� �� �������� �տ� this�� ���δ�.
		this.car = car ;
	}
	@Override
	public void run() {
		String carNmae=null;
		for (int i = 0; i < 20; i++) {
			// ���ڵ��� ����
			String carName = car.getCar();
			// ������ �ڵ����� â�� �ֱ�
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*200));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}

}
