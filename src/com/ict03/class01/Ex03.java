package com.ict03.class01;

public class Ex03 {
	// 메소드 : 기능, 동작
	//    - 메소드를 호출하면 해당 메소드가 실행된다.
	//    - 실행이 끝나면 메소드를 호출한 곳으로 되돌아 간다.
	//    - 되돌아 갈때 결과를 가지고 가는 경우와 아니 경우로 나눠진다.
	//      이때 결과를 받지 않는 경우를 void라고 한다.
	//      결과를 받는 경우는 그 결과의 자료형을 반환형이라고 한다.
	//      반환형이 있는 경우에는 반드시 "return 보낼데이터"가 마지막줄에 존재해야 한다.
	
	int s1 = 10 ;
	int s2 = 5 ;
	int result = 0 ;
	
	// 반환형 없음
	public void plus01() {
		System.out.println(2);
		result = s1 + s2 ;
	}
	
	// 반환형이 있는 경우
	public int sub01() {
		int res = s1 - s2 ;
		return res ;
	}
}








