package com.ict03.class07;

interface Test{
	int data = 1000;
	void printData();
}
// 상속
class Test02 implements Test{
	@Override
	public void printData() {
		System.out.println("data : " + data);
	}
}
// 상속받지 않고 사용 
class Test03{
	Test t = new Test() {
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
}

// 상속 받지 않고 메소드에 넣기
class Test04{
	public void play() {
		new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		}.printData(); // 클래스 끝
	} // 메소드 끝
}

// 상속받지 낳고 메소드 인자에 넣기 
class Test05{
	public void sound(Test test) {
		test.printData();
	}
}
public class Ex08 {
	public static void main(String[] args) {
		Test02 t2 = new Test02();
		t2.printData();
		System.out.println();
		
		Test03 t3 = new Test03();
		t3.t.printData();
		System.out.println();
		
		Test04 t4 = new Test04();
		t4.play();
		System.out.println();
		
		Test05 t5 = new Test05();
		t5.sound(new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		});
	}
}










