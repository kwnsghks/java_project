package com.ict04.exception;

public class Ex02 {
	public static void main(String[] args) {
		try {
			String year = "1996";
			int age = 2021 - Integer.parseInt(year);
			System.out.println("���� : "+ (age+1));
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���");
		}
		System.out.println("���� �ϼ̽��ϴ�.");
	}
}