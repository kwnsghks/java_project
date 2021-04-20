package com.ict12.after;

public class Ex04 {
	public static void main(String[] args) {
		// 단순 if 문 : 조건식이 참일 때 실행한다.
		//              거짓일 때는 무시한다.
		// 형식 : if(조건식){
		//        조건식이 참일 때 실행할 문장;
		//        조건식이 참일 때 실행할 문장;
		//        }
		// 단, 실행할 문장이 한 줄이면 { } (블록) 생략 가능
		
		// double avg 가 60 이상이면 합격, 아니면 불합격
		double avg = 50 ; 
		String res = "초기값" ;
		if (avg >= 60) {
			res = "합격" ;
		}
		
		if(avg<60) {
			res = "불합격";
		}
		System.out.println(res);
		System.out.println("=====================");
		
		
		double avg2 = 70 ;
		String res2 = "초기값";
		if(avg2>=60) {
			res2 = "합격";
		}else {
			res2 = "불합격";
		}
		System.out.println(res2);
		
		// int k1 이 홀수인지 짝수인지 판별하자
		int k1 = 46 ;
		String res3 = "홀수";
		if(k1%2==0) {
			res3 = "짝수";
		}
		System.out.println(res3);
	}
}
