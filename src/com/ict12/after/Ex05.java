package com.ict12.after;

public class Ex05 {
	public static void main(String[] args) {
		// if~ else~ : 조건식이 참일 때와 거짓일 때 각각 나누어서 처리한다.
		// 형식) if(조건식){
		//          조건식이 참일 때 실행할 문장
		//          조건식이 참일 때 실행할 문장
		//       }else{
		//          조건식이 거짓일 때 실행할 문장
		//          조건식이 거짓일 때 실행할 문장
		//       }
		//       단, 실행할 문장이 한 줄이면 생략이 가능
		
		// double avg가 60 이상이면 합격, 아니면 불합격
		double avg = 59;
		String res = "초기값";
		if(avg>= 60) {
			res = "합격";
		}else {
			res = "불합격";
		}
		System.out.println(res);
		
		// int k1 이 홀수인지 짝수인지 판별하자
		int k1 = 12;
		if(k1 % 2 == 0) {
			res = "짝수";	
		}else {
			res = "홀수";
		}
		System.out.println(res);

		// char c1 이 대문자인지 소문자인지 판별하자
		char c1 = '金';
		if(c1>='A' && c1<='Z') {
			res = "대문자";
		}else {
			res = "대문자 아님";
		}
		System.out.println(res);
	}
}
