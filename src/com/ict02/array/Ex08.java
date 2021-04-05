package com.ict02.array;

public class Ex08 {
	public static void main(String[] args) {
		// 다차원 배열 중 가변길이
		// 1차원 배열 안에 존재하는 배열의 크기가 각각 다른 배열을 말한다.
		// 선언 -> 생성 -> 데이터 저장
		char[][] ch1 ;
		ch1 = new char[3][];
		
		// 가변길이 데이터입력할때 고정길이 처럼 하면 오류 발생 (실행할때 오류발생)
		/*
		ch1[0][0] = 'j';
		ch1[0][1] = 'a';
		ch1[0][2] = 'v';
		ch1[0][3] = 'a';
		
		ch1[1][0] = 'J';
		ch1[1][1] = 'S';
		ch1[1][2] = 'P';
		
		ch1[2][0] = 'A';
		ch1[2][1] = 'n';
		ch1[2][2] = 'd';
		ch1[2][3] = 'r';
		ch1[2][4] = 'o';
		ch1[2][5] = 'i';
		ch1[2][6] = 'd';
		*/
		// 1차원배열 만들어서 다차원 배열에 넣기 
		char[] c1 = {'j','a','v','a'};
		char[] c2 = {'J','S','P'};
		char[] c3 = {'A','n','d','r','o','i','d'};
		
		ch1[0] = c1 ;
		ch1[1] = c2 ;
		ch1[2] = c3 ;
		
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.print(ch1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==================================");
		
		// 선언과 생성과 데이터 저장 한번에 
		char[][] ch2 = {{'J','A','V','A'},{'자','바'},{'1','2','3'}};
		
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2[i].length; j++) {
				System.out.print(ch2[i][j]+" ");
			}
			System.out.println();
		}
	}
}







