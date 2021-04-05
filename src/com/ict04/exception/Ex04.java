package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// finally : 예외처리와 상관없이 반드시 실행해야 되는 문장을 
		//           처리할때 사용(데이터베이스, 입/출력, 네트워크 에서 주로 사용한다.)
		// try ~ catch ~ finally
		
		 Scanner scan = new Scanner(System.in);
		try {
	    	int var = 27 ;
	    	System.out.print("정수 입력 : ");
	    	int su = scan.nextInt();
	    	System.out.println("정답 : " + (var/su));
	    //	return  ;
		} catch (Exception e) {
		   System.out.println("제대로 입력하세요 : " + e);
		   return;
		} finally {
			System.out.println("반드시 수행해야 될 문장");
		}
	    
	     System.out.println("수고하셨습니다.");
		
	}
}
