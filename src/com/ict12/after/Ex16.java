package com.ict12.after;

public class Ex16 {

	public static void main(String[] args) {
		// ���� ���ϱ�
		// 1. ��� ����� ������ 1������ �ʱ�ȭ �Ѵ�.
		// 2. ��ġ�� ������� ��� ������ ���ؾ� �ȴ�.
		//    (�ڱ��ڽ��� ���� �ʿ䰡 ����.)
		// 3. ��(i)���� ��(j)�� ũ�� �� ������ ������Ų��.
		
		int[] sum = {270, 265, 285, 290, 275};
		int[] rank = {1,1,1,1,1};
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if(sum[i]==sum[j]) continue; {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
		System.out.println(rank[i]);
		}		
	}
}
