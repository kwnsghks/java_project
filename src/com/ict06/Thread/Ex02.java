package com.ict06.Thread;

public class Ex02 {
	public void add(int k1,int k2) {
		System.out.println("2"+Thread.currentThread());
		int sum = k1+k2;
		System.out.println(sum);
		System.out.println("3"+Thread.currentThread());
	}
	public int sub(int k1, int k2) {
		System.out.println("5"+Thread.currentThread());
		int res = k1 - k2 ;
		System.out.println("6"+Thread.currentThread());
		return res ;
	}
}
