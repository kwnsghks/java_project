package com.ict12.after;

public class Ex18 {

	public static void main(String[] args) {
		// 다차원 배열 : 1차원 배열이 여러개 모인 것
		// 종류 : 고정길이, 가변길이 
		// 2. 가변길이 : 1차원 배열 안에 존재하는 배열의 크기가 각각 다르다.
		// 선언 => 생성 => 데이터 저장

		// 선언
		char[][] ch1;
		ch1 = new char[3][];
		
		// 가변길이 데이터 입력은 고정길이 처럼 하면 오류 발생.(실행할 때 오류)
		char[] t1 = {'j','a','v','a'};
		char[] t2 = {'j','s','p'};
		char[] t3 = {'1','2'};
		ch1[0] = t1;
		ch1[1] = t2;
		ch1[2] = t3;
		
		// 출력방법은 고정길이나 가변길이가 같다.
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.println(ch1[i][j]);
			}
		}System.out.println();
		// 선언과 생성과 데이터 저장을 한번에
		char[][] ch2 = {{'a','b'},{'A','B','C','D'},{'1','2','3'},{'가','나'}};
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2[i].length; j++) {
				System.out.println(ch2[i][j]);
			}
		}
		
	}

}
