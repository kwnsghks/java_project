package com.ict12.after;

public class Ex03 {
	public static void main(String[] args) {
		// 증감 연산자 : 1만큼 증가하거나 1만큼 감소하는 것.
		//               char, 정수(byte, short..), 실수(float, double)

		// ++변수 : 먼저 현재 변수값을 1증가시키고 나머지 연산을 한다.
		// 변수++ : 현재 변수값으로 연산을 하고 나중에 변수값을 1 증가시킨다.
		
		// 비교연산자 : 변수나 상수의 값을 비교할 때 쓰는 것
		//              결과는 항상 boolean형 이다.
		//              자료형이 클래스 또는 String 이면 사용하지 말자.
		// a > b => a가 b보다 크다 (왼쪽이 기준이다.)
		//   > (크다), >= (크거나 같다), == (같다), <=(작거나 같다), <(작다), != (같지 않다, 다르다)
		
		// char와 char 비교가능, char와 int 비교가능, int와 double 비교가능.
		char c1 = 'a'; // 97
		char c2 = 'c'; // 99
		System.out.println(c1>c2); // char 는 숫자로 저장되기 때문에 비교가능(값 : false)
		
		// 논리연산자 : && (AND, 논리곱), ||(OR, 논리합) ! (NOT, 논리부정)
		//             논리 연산자의 결과는 항상 boolean형이다. (ture 아니면 false)
		// && (AND, 논리곱, 교집합)
		// 주어진 조건이 모두 true(참) 일때만 결과가 참.
		// false 를 만나면 결과는 무조건 false 이다.
		// false 를 만나는 순간 이후에 있는 연산을 하지 않음.

		// 숫자와 숫자 사이에 &&가 있을 경우 범위를 지정할 수 있음.
		// a >= 10 && a<=20 ;
		// a는 10보다 크거나 같으면서, 20보다는 작거나 같아야함.
		// 즉, a는 10~20 사이의 값이다.
		
		// char c1 의 소문자 범위를 지정하자
		char c3 = 'k';
		// (c3 >= 'a') && (c3 <= 'z') 의 의미는 'a'~'z' 사이에 존재하냐?
		boolean c4 = (c3 >= 'a') && (c3 <= 'z') ;
		System.out.println(c4);

		// || (OR, 논리합, 합집합)
		// 주어진 조건이 하나라도 ture(참)이면 결과는 참.
		// 주어진 조건들 중에 true를 만나는 순간 결과는 true.
		// true를 만나면 이후에 있는 연산을 하지 않는다.
		
		// ! (NOT, 논리부정)
		// 주어진 boolean형의 값을 반대로 변경하는 연산
		// true => false , false=> true
		// !(부정) 이 두개면 삭제된다 => !! (원래 답으로 됨)
		
		// 대입 연산 : 특정 값이나 객체의 주소를 변수에 기억(저장)시킬 때 사용
		//            =(저장) , += (덧셈 후 저장) , -=(뺄셈 후 저장)
		//            *=(곱셈 후 저장) , /=(나눗셈 후 저장) , %=(나머지 구한 후 저장)
		
		int k1 = 7; // 7을 k1 에 저장
		k1 += 7 ;  // k1 + 7 후에 k1(왼쪽 기준)에 저장하란 뜻 
		k1 -= 7 ; // k1 - 7 후에 k1(왼쪽 기준)에 저장하란 뜻
		System.out.println(k1);
		
		// int k2 = 8 이다. k2 데이터에 1씩 증가시키는 방법은?
		int k2 = 8 ;
		k2 = k2 + 1;
		System.out.println(k2);
		k2 += 1; 
		System.out.println(k2);
		k2++;
		System.out.println(k2);
		++k2;
		System.out.println(k2);
	}
}





