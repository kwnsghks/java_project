package com.ict12.after;

public class Ex09 {
	public static void main(String[] args) {
	 // 다중 for문 : for문 안에 for문이 존재
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+",j="+j);
			}
		}
		// 구구단
		for (int i = 2; i < 10; i++) {
			System.out.println("\n"+i+"단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j)+" ");
			}
		}
		// 구구단 -2 (같은 단은 행으로 가기)
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"단");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j)+" ");
			}System.out.println();
		}
		System.out.println();
		
		// 구구단 -3 (같은 단은 열로 가기)
		System.out.println("2단   3단   4단   5단   6단   7단   8단   9단");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j)+" ");
			}System.out.println();
		}
		
	}
}
