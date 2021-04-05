package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	// throws (예외 양도, 예외전가)
	// - 예외가 발생하면 예외처리를 하지 않고, 자신을 호출한 곳으로 예외 객체를 전달하는 것
	// - 나중에라도 예외처리(try~catch)를 하는 것이 좋다.
	public static void main(String[] args){
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("정수입력 : ");
			String msg = scan.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("첫글자는 숫자로 입력하세요");
		}
	}
	
	public void setData(String msg) throws NumberFormatException {
		// msg에 글자의 길이가 한개 이상이면 실행
		if(msg.length()>=1) {
			String str = msg.substring(0,1); // 첫글자만 추출해라
			 prnData(str);
		}
	}
	
	public void prnData(String str) throws NumberFormatException  {
		// try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + "단");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		// } catch (Exception e) {
		//	System.out.println("첫글자는 숫자로 입력하세요");
		// }
	}
}





