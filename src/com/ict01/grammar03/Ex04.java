package com.ict01.grammar03;
class Ex04{
	public static void main(String[] args){
	// 삼항연산자 (조건연산자 = 조건문인 if ~ else 문과 같다)
        // - 형식 : 저장변수 = 조건식 ? 참일때 실행할 문장 : 거짓일때 실행할 문장 ;  
        //          조건식에는 boolean, 논리연산, 비교연산이 들어간다.
        // - 주의사항 : 저장변수, 참일때 실행결과, 거짓일때 실행결과 
        //              모두 같은 자료형이어야 한다.
        //              ( 저장변수가 더 큰자료형이면 문제 없다.)
        //  byte < short < char < int < long < float < double ;
        
        int result = true ? 14 : 10 ;
        System.out.println("결과 : " + result);  // 14            
	
	result = false ? 14 : 10 ;
        System.out.println("결과 : " + result); // 10

	int result2 = false ? 14 : 'C' ;
        System.out.println("결과 : " + result2); // C에 해당하는 숫자
        System.out.println("결과 : " + (char)(result2)); // C에 표시 할려면

        // 주어진 sum이 80이상이면 "합격", 아니면 "불합격";
        int sum = 81 ;
        String result3 = (sum >= 80) ? "합격" : "불합격" ;
        System.out.println("결과 : " + result3); 
	
        // 평균점수가 90이상이면 A, 아니면 B ;
	double avg = 87.0 ;
        double result4 = (avg >= 90) ? 'A' : 'B' ;
        System.out.println("결과 : " + result4); 
	System.out.println("결과 : " + (char)(result4)); 
	}
}


