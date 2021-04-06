package com.ict04.exception;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "2002년";
			int age = 2012 - Integer.parseInt(year);
			System.out.println("나이 : "+ age);
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		System.out.println("수고 하셨습니다.");
	}
}
;