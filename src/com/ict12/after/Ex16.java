package com.ict12.after;

public class Ex16 {

	public static void main(String[] args) {
		// 순위 구하기
		// 1. 모든 사람의 순위를 1등으로 초기화 한다.
		// 2. 위치에 상관없이 모든 사람들과 비교해야 된다.
		//    (자기자신은 비교할 필요가 없다.)
		// 3. 나(i)보다 남(j)이 크면 내 순위를 증가시킨다.
		
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
