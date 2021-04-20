package com.ict12.after;

public class Ex07 {
	public static void main(String[] args) {
		// switch ~ case 문 : if 문과 같은 분기문
		// if 문에 사용하는 조건식은 boolean, 비교연산, 논리연산 이다.
		// switch 문은 byte, short, int, char, String (<=인자값)일 때만 사용가능
		// ** 범위가 나오면 if 문이 편하다.
		// 형식  switch (인자값) {
		//       case 조건값 1 : 인자값에서 요구한 값이 조건값1 일때 실행할 문장 ; break;
		//       case 조건값 2 : 인자값에서 요구한 값이 조건값2 일때 실행할 문장 ; break;
		//       case 조건값 3 : 인자값에서 요구한 값이 조건값3 일때 실행할 문장 ; break;
		//       default       : 조건값 1,2,3 모두 아닌 경우, 즉 나머지일 때 실행
		//       }
		// ** 주의사항 : break문이 없으면 다음 break를 만날 때까지 모든 실행문을 실행한다.
		//               break문은 빠져나가는 역할을 한다.
		
		// int k1 이 1또는 3이면 남자, 2또는 4이면 여자 나머지는 외국인
		int k1 = 1                                                                                                                                                                                                                                                                                                                                      ;
		String res = " " ;
		switch (k1) {
		case 1: res = "남자"; break;
		case 3: res = "남자"; break;
		case 2: res = "여자"; break;
		case 4: res = "여자"; break;
			
		default: res = "외국인"; break;
		}
		System.out.println(res);
		
		// 주의 사항을 이용하면 
		switch (k1) {
		case 1:
		case 3: res = "남자"; break;
		case 2:
		case 4: res = "여자"; break;
			
		default: res = "외국인"; break;
		}
		System.out.println(res);

	}
}
