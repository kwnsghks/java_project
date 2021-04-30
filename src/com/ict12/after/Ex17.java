package com.ict12.after;

public class Ex17 {
	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것
		// 종류 : 고정길이, 가변길이 

		// 1. 고정길이 배열
		// 선언 : 자료형[][] 이름;
		// 생성 : 이름 = new 자료형[1차원 배열의 수][1차원 배열안에 존재하는 배열의 수];
		// 저장 : 이름[index][index] = 데이터 ; (고정길이에서만 사용 가능)
		
		int[][] k1 ;
		k1 = new int[2][4];
		k1[0][0] = 100;
		k1[0][1] = 100;
		k1[0][2] = 100;
		k1[0][3] = 100;

		k1[1][0] = 200;
		k1[1][1] = 200;
		k1[1][2] = 200;
		k1[1][3] = 200;
		
		System.out.println(k1);
		System.out.println(k1[0]);
		System.out.println(k1[1]);
		
		// 출력(고정길이, 가변길이 모두 같은 방법 사용)
		for (int i = 0; i < k1.length; i++) {
			for (int j = 0; j < k1[i].length; j++) {
				System.out.println(k1[i][j]);
			}
		}
		System.out.println();
		
		// 생성과 선언을 한번에
		char[][] c1 = new char[4][2];
		c1[0][0] = 'A';
		c1[0][1] = 'a';
		c1[1][0] = 'B';
		c1[1][1] = 'b';
		c1[2][0] = 'C';
		c1[2][1] = 'c';
		c1[3][0] = 'D';
		c1[3][1] = 'd';
		
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1[i].length; j++) {
				System.out.println(c1[i][j]);
			}
		}
		System.out.println();
		
		// 생성과 선언과 데이터 저장을 한번에
		int[][] k3 = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 1차원 배열을 만들어서 다차원 배열에 넣기
		char[][] k4 = new char[3][2];
		
		char[] s1 = {'j','a'} ;
		char[] s2 = {'자','바'} ;
		char[] s3 = {'1','2'} ;
		
		k4[0] = s1 ;
		k4[1] = s2 ; 
		k4[2] = s3 ;
		
		for (int i = 0; i < k4.length; i++) {
			for (int j = 0; j < k4[i].length; j++) {
				System.out.println(k4[i][j]);
			}
		}
	}
}






