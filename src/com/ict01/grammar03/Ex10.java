package com.ict01.grammar03;
class Ex10{
	public static void main(String[] args){
          // if ~ else ~ : 조건식이 참일때와 거짓일때 각각 나눠서 처리한다.
          // 형식 :  if(조건식){
          //            조건식이 참일때 실행할 문장;
          //            조건식이 참일때 실행할 문장;
	  //         } else {
          //            조건식이 거짓일때 실행할 문장;   
          //            조건식이 거짓일때 실행할 문장;   
	  //         }
          //    단, 실행할 문장이 한 줄이면 생략 가능하다.
	
 	// int k1가 60이상이면 합격 아니면 불합격
	int k1 = 76;
	String str = "";
	if(k1 >=60){
            str = "합격";
	}else{
	    str = "불합격";		
	}	
        System.out.println("결과1 : " + str);

	// int k2이 홀수인지 짝수인지 판별하자
	int k2 = 14;
	String str2 = "";
	if(k2 %2 == 0){
           str2 = "짝수";
	}else{
           str2 = "홀수";
	}
	System.out.println("결과2 : " + str2);

	// char k3가 대문자인지 대문자가 아닌지 판별하자
	char k3 ='E';
	String str3 = "";
        if(k3>='A' && k3<='Z'){
	   str3 = "대문자";	
	} else {
	   str3 = "대문자 아님";
	}	
	System.out.println("결과3 : " + str3);

	// k4가 1 또는 3이면 남자 아니면 여자
	int k4 = 3 ;
	String str4 = "";
	if(k4==1 || k4==3){
	  str4 = "남자";	
	}else{
	  str4 = "여자";
	}
	System.out.println("결과4 : " + str4);

	// 근무시간이 8시간까지는 시간당 8720이고
	// 8시간을 초과한 시간만큼은 1.5배 이다.
	// 현재 근무시간이 10시간 이다.
	// 얼마를 받아야 하는가?
	int time = 10 ;
	int dan = 8720;
	int pay = 0 ;
	if( time > 8) {
	  pay = (8*dan) + (int)((time-8)*dan*1.5) ;
	}else{
	  pay = time * dan;
	}
	System.out.println("당신의 총 금액 : " + pay);
	}
}





