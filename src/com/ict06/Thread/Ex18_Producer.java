package com.ict06.Thread;

public class Ex18_Producer implements Runnable{
	// 클래스를 자료형으로 사용함. (↓참조자료형 : 클래스를 자료형으로 썼다는 것.)
	private Ex17_Car car;
	
	// 생성자에서 받은 인자는 무조건 전역변수로 만들자 → why?
	public Ex18_Producer(Ex17_Car car) {
		// 전역변수와 지역변수의 이름이 같을 때 전역변수 앞에 this를 붙인다.
		this.car = car ;
	}
	@Override
	public void run() {
		String carNmae=null;
		for (int i = 0; i < 20; i++) {
			// ↓자동차 생산
			String carName = car.getCar();
			// ↓생산된 자동차를 창고에 넣기
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random()*200));
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}

}
