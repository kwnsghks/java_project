package com.ict04.exception;

import java.util.Scanner;

public class Practice_ict04 {
	public static void main(String[] args) {
		
		Practice_ict04 test = new Practice_ict04();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("정수입력 : ");
			String msg = scan.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("Only 숫자로 !");
		}
	}
	public void setData(String msg) throws NumberFormatException{
		if(msg.length()>=1){
			String str = msg.substring(0,1);
			prnData(str);
		}
	}
	public void prnData(String str) throws NumberFormatException{
		int dan = Integer.parseInt(str);
		System.out.println(dan+"단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}
}
