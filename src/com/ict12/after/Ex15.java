package com.ict12.after;

public class Ex15 {
	public static void main(String[] args) {
		// 배열로 정렬하기
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		
		// 자리변경을 위한 임시변수
		int tmp = 0;
	
		// 정렬을 위한 for 문
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				// 나(i)보다 남(j)이 작으면 자리바꿈. (오름차순)
				// 나(i)보다 남(j)이 크면 자리바꿈. (내림차순)
				if(su[i] < su[j]) {
					tmp = su[j];
					su[j] = su[i];
					su[i] = tmp;
				}
			}
		}
		// 출력
		for (int i = 0; i < su.length; i++) {
			System.out.print(" "+su[i]);
		}
		System.out.println();
		System.out.println(su[0]);
		System.out.println(su[9]);
	}
}
