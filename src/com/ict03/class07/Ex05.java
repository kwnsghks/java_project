package com.ict03.class07;

// 익명 내부 클래스 (Anonymous) : 대상이 보통 추상클래스나 인터페이스에서 많이 사용

abstract class Car {
	abstract void run();
}

class Bus extends Car{
	@Override
	void run() {
		System.out.println("80으로 달린다.");
	}
}
class Taxi extends Car{
	@Override
	void run() {
		System.out.println("160으로 달린다.");
	}
}

class Ex05{
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		System.out.println();
		
		Car car2 = new Car() {
			@Override
			void run() {
				System.out.println("무조건 달린다.");
			}
		};
		car2.run();
	}
}



