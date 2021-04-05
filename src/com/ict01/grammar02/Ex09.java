package com.ict01.grammar02;
class Ex09{
	public static void main(String[] args){
	// 2시간 40분 23초를 초단위로 변경해라
        int h = 2 ;
        int m = 40 ;
        int s = 23 ;
        
        // 시간을 초,  분을 초,          
        int s1 = h * 60 * 60 ;
        int s2 = m * 60 ;
        
        int total = s1 + s2 + s ;
        System.out.println("2시간 40분 23초는 " + total + "초 입니다."); 

        // 9630초는 몇시간 몇분 몇초인가?
        int time = 9630 ;
        int h1 = 0 ; // 시간
        int m1 = 0 ; // 분
        int s3 = 0 ; // 초
        int res = 0 ; // 나머지

        // 시간 구하기 
        h1 = time / (60*60);
        res = time % (60*60);

        // 시간을 구한 후 나머지를 가지고 분 구하기 
        m1 = res / 60 ;

        // 분을 구한 후 나머지가 초이다.
        s3 = res % 60 ;
        
        System.out.println(time + "초는" + h1 +":" + m1 +":"+ s3);
	}
}




