package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {
	public static void main(String[] args) {
		// �ζ� ��ȣ : 1~45 (����, 6�ڸ�, �ߺ��ȵ�)
		HashSet<Integer> lotto = new HashSet<Integer>();  // Ŭ�������� int�� �ƴ� integer ���
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45) + 1 ;  // 1~45
			boolean b = lotto.add(k);
			if(!b) {  // �ߺ��Ǿ��� ��
				i--;
			}
		}
		System.out.println(lotto);
		System.out.println("=================");
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random()*45) + 1 ;  // 1~45
			boolean b = lotto.add(k);
			if(!b) {  // �ߺ��Ǿ��� ��
				i--;
			}
		}
		System.out.println(lotto2);
	}
}
