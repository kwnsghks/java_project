package com.ict12.after;

public class Ex12 {

	public static void main(String[] args) {
		// break문 : 현재 반복문을 탈출할 때 사용
		// continue문 : continue문 이하의 수행문을 포기하고 다음 회차를 실행할 때 씀.
		//              for문의 경우는 증감식, while문 일때는 사용하지 말기
		
		// 1~10까지 출력할 때 i가 4일때 break ;
		for (int i = 1; i < 11 ; i++) {
			if(i==4) break ;  // 브레이크는 빠져나갔기 때문에 4이후로 찍히지 않음.(탈출)
			System.out.println(i);
		}
		System.out.println("==================");
		// 1~10까지 출력할 때 i가 4일때 continue ;
		for (int i = 1; i < 11 ; i++) {
			if(i==4) continue ;  // 4만 찍히지 않고 다음으로 넘어감.
			System.out.println(i);
		}
		System.out.println("==================");
		
		// 이중 for문에서 break, continue 사용
		// j가 3일때 break 또는 continue
		for (int i = 1; i < 4 ; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) break;  // j=3 찍힌 이후부터 다 안함
				System.out.println("i=" + i + ", j = " + j);
			}
		}System.out.println("==================");
		
		for (int i = 1; i < 4 ; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue; // j=3 찍힌 부분만 안하고 이후 수행문으로 넘어감.
				System.out.println("i=" + i + ", j = " + j);
			}
		}
		
	}

}
