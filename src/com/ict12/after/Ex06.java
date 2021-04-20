package com.ict12.after;

public class Ex06 {
	public static void main(String[] args) {
		// 다중 if문 : 여러개의 if문을 사용하는 문
		// 형식 : if(조건식1){
		//           조건식1이 참일 때 실행할 문장;
		//           }else if(조건식2){
		//           조건식1은 거짓이면서 조건식2는 참일 때 실행;
		//           }else if(조건식3){
		//           조건식1,2는 거짓이면서 조건식3는 참일 때 실행;
		//           }else{
		//           조건식1,2,3 이 모두 거짓일 때, 즉 나머지인 경우 실행;
		//           }
		
		// int k1의 점수가 90 이상이면 A, 80이상이면 B, 70이상이면 C, 나머지가 F
		int k1 = 89;
		String res = "";
		if(k1 >=90) {
			res = "A학점";
		}else if(k1 >=80) {
			res = "B학점";
		}else if(k1 >=70) {
			res = "C학점";
		}else {
			res = "F학점";
		}
		System.out.println(res);
		
		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별
		char k2 = '!';
		if (k2>='A'&& k2 <='Z') {
			res = "대문자";
		}else if (k2>='a'&& k2 <='z') {
			res = "소문자";
		}else if (k2>='0'&& k2 <='9') {
			res = "숫자";
		}else {
			res = "기타문자";
		}
		 System.out.println(res);
		
		
	}
}
