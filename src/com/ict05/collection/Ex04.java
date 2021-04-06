package com.ict05.collection;

import java.util.HashSet;

public class Ex04 {

	public static void main(String[] args) {
		// 로또 번호 : 1~45 (랜덤, 6자리, 중복안됨)
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45) + 1 ;  // 1~45
			boolean b = lotto.add(k);
			if(!b) {  // 중복되었을 때
				i--;
			}
		}
		System.out.println(lotto);
		System.out.println("=================");
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45) + 1 ;  // 1~45
			boolean b = lotto.add(k);
			if(!b) {  // 중복되었을 때
				i--;
			}
		}
		System.out.println(lotto2);
	}
}
