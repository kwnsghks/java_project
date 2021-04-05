package com.ict01.grammar03;
class Ex05{
	public static void main(String[] args){
	
	// int k1가 60이상이면 합격 아니면 불합격
	int k1 = 70 ;
        String res1 = (k1 >= 60) ? ("합격") : ("불합격")  ;
        System.out.println("결과1 : " + res1 );

	// int k2이 홀수인지 짝수인지 판별하자 
        int k2 = 46 ;
        String res2 = (k2%2 == 0) ? "짝수" : "홀수" ;  
        System.out.println("결과2 ; " + res2);

	// char k3가 대문자인지 대문자가 아닌지 판별하자
	char k3 = 'c';
        String res3 = (k3>='A' && k3<='Z') ? "대문자" : "대문자아님" ;
	System.out.println("결과3 : " +  res3);

	// 근무시간이 8시간까지는 시간당 8720이고
	// 8시간을 초과한 시간만큼은 1.5배 이다.
	// 현재 근무시간이 10시간 이다.
	// 얼마를 받아야 하는가?
	
	int time = 10 ;
        int dan = 8720 ;
        int pay = (time > 8) ? (8*dan) + (int)((time-8)*dan * 1.5) : time * dan  ;
	System.out.println("결과4 : " + pay);
	}
}





