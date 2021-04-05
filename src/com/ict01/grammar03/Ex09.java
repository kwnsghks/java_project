package com.ict01.grammar03;
class Ex09{
	public static void main(String[] args){
	// 단순 if문 : 조건식이 참일때만 실행한다.
        //             거짓일때는 if문 무시
        // 형식 : if(조건식){
        //         조건식이 참일때 실행할 문장 ;
        //         조건식이 참일때 실행할 문장 ;
        //        }
        //    단, 실행할 문장이 한 줄이면 { }(블록) 생략 가능
        
        int k1 = 90 ;
        String res = "불합격" ;
        if(k1 >= 80){
            res ="합격";
        } 
        System.out.println("결과 : " + res);
	
        // 두 수 중 큰값을 출력하시오 
        int k2 = 10 ;
        int k3 = 15 ;
        int res2 = k3;
        if(k2 > k3) {
	    res2 = k2 ;	
        } 
	System.out.println("두 수 중 큰값은 " +  res2 + " 이다.");
	}
}