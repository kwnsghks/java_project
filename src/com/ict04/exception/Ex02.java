package com.ict04.exception;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "2002��";
			int age = 2012 - Integer.parseInt(year);
			System.out.println("���� : "+ age);
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}
;