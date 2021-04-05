package com.ict03.class04;

// 일반적인 클래스가 추상클래스를 상속하면 
// 반드시 추상클래스의 추상메소드를 오버라이딩 해야 된다.
// 구체화를 해야 된다.
class Ex02 extends Ex01{
	@Override
	public void sound() {
		
	}
}

// 오버라이딩을 하지 않는 방법 : 자식클래스를 추상클래스로 만든다.
// 부모의 추상메소드를 구체화하지 않았음
abstract class  Ex03 extends Ex01{
	public void song() {
		System.out.println("노래하기");
	}
}

// 오버라이딩을 하지 않는 방법 : 자식클래스를 추상클래스로 만든다.
// 부모의 추상메소드를 구체화하지 않았음
// 추상메소드를 추가했음
abstract  class Ex04 extends Ex01{
	public void music() {
		System.out.println("음악");
	}
	public abstract void  pop() ;
}


















