package com.ict04.exception;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1996";
			int age = 2021 - Integer.parseInt(year);
			System.out.println("나이 : "+ (age+1));
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		System.out.println("수고 하셨습니다.");
	}
}