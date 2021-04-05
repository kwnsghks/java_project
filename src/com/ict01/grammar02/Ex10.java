package com.ict01.grammar02;
class Ex10{
	public static void main(String[] args){
        // 증감 연산자 : 1만큼 증거하거나 감소시키는 연산자이다.
        //                char,  정수, 실수에 사용 가능
        // ++ 변수     : 먼저 현재변수값에 1을 증가 시키고 나머지 연산한다. 
        //    변수 ++  : 현재 변수값을 가지고 연산 한 후 나중에 1증가 시킨다.

        int s1 = 10 ;
	int s2 = 10 ;

        System.out.println(++ s1 + 2) ;
        System.out.println(s2 ++ + 2) ;
        System.out.println();
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
	}
}