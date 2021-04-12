package com.ict03.class05;

// 인터페이스 상속
// 1. 일반 클래스가 인터페이스를 상속 하면
//    => 무조건 오버라이딩 해야 된다.
// 2. 추상 클래스가 인터페이스를 상속 하면 
//    => 오버라이딩 필요없다.
// 3. 인터페이스가 인터페이스를 상속하면 
//    => 오버라이딩 필요없다.
// 4. 다중 상속이 가능하다.
//    인터페이스 자식 extends 인터페이스부모1,인터페이스부모2,인터페이스부모3 ;
// 5. 일반 클래스가 부모클래스와 부모인터페이스를 같이 상속하면 
//    class 클래스이름 extends 부모클래스 implements 인터페이스
// 6.  인터페이스 => 인터페이스 ,  클래스 => 클래스  : extends 예약어 사용
//     클래스 => 인터페이스  : implements 예약어 사용,  인터페이스 => 클래스 (사용불가 X)

// 일반클래스가 인터페이스를 상속 : 반드시 오버라이딩 해야 한다.
 class Ex03  implements Ex01{
	@Override
	public void like() {
	}
	@Override
	public void sound() {
	}
}
 
 // 추상클래스가 인터페이스를 상속 : 오버라이딩 필요없다.
 abstract class Ex04 implements Ex01{
	 
 }
 
 // 인터페이스가 인터페이스를 상속 : 오버라이딩 필요없다.
interface Ex05 extends Ex01{
	
}
 
 
 
