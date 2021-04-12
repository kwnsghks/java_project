package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args){
          // 숫자들의 크기에 따른 저장 원리
          // char < int < long < float < double ;
          //(문자) (정수형 숫자)  (실수형숫자) 

	  // 형변환 :  자동형변환과 강제형변환
          // 자동형 변환 : 작은 자료형이 큰 자료형에 저장될 때 
          
          // char를 int 에 저장할 수 있다.
          char c1 = 'a';
          System.out.println(c1);  // a  

          int s1 = 'a' ;
          System.out.println(s1);  // 97 
          
          // char c1 변수도  int  s2 에 저장 
          int s2 = c1 ;
          System.out.println(s2);  // 97
         
         // int를 long 에 저장할 수 있다.
          long s3 = 117L ;
          System.out.println(s3);

          long s4 = 117 ;

         // long이 float나 double 에 저장할 수 있다.
         float s5 = s3 ;
         System.out.println(s5);

        // 강제형 변환 : 큰자료형을 작은자료형으로 저장할때 
         //               오류가 발생한다. 
        //               강제로 형 변환해서 오류를 나지 않한다.
        //               그러나, 데이터를 손실할 가능성이 있다.
        // 강제형 변환 방법  : = 를 기준으로 무조건 왼쪽자료형에 맞춘다.
        //                      = (왼쪽자료형)(대상);

        byte k1 = (byte)(257) ;    
        System.out.println(k1);

        // int 를 char에 넣자 
        char k2 = 97 ;
        System.out.println(k2); 

        int k3 = 97 ;
        char k4 = (char)(k3) ;
        System.out.println(k4); 

        // float나 double를 int로 저장
         int k5 = (int)(87.64);
	System.out.println(k5); 
        
       
	}
}







