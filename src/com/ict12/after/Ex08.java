package com.ict12.after;

public class Ex08 {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복처리하는 문
		// 형식 : for(초기식; 조건식; 증감식){
		//            조건식이 참힐 때 실행할 문장;
		//            조건식이 참힐 때 실행할 문장;
		//         }
		
		// for문 만나면 무조건 초기식부터 시작한다.
		// 조건식이 참일 때만 실행, 조건식이 거짓이면 for문을 빠져 나간다.
		// for문의 끝은 만나면 무조건 증감식으로 가서 증가나 감소를 하고 바로 조건식으로 간다.
		
		// 1~10까지 출력
		for (int i = 1; i < 11; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}System.out.println();
		
		// 21~40까지 홀수만 출력
		for (int i = 21; i < 41; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		// 5단 출력
		System.out.println("5단");
		for (int i = 1; i < 10; i++) {
			System.out.println("5*"+i+"="+i*5 );
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0	
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();
		// 다른 방법
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
		}
		
	}
}
