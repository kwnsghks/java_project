package com.ict02.array;

public class Ex08 {
	public static void main(String[] args) {
		// ������ �迭 �� ��������
		// 1���� �迭 �ȿ� �����ϴ� �迭�� ũ�Ⱑ ���� �ٸ� �迭�� ���Ѵ�.
		// ���� -> ���� -> ������ ����
		char[][] ch1 ;
		ch1 = new char[3][];
		
		// �������� �������Է��Ҷ� �������� ó�� �ϸ� ���� �߻� (�����Ҷ� �����߻�)
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
		// 1�����迭 ���� ������ �迭�� �ֱ� 
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
		
		// ����� ������ ������ ���� �ѹ��� 
		char[][] ch2 = {{'J','A','V','A'},{'��','��'},{'1','2','3'}};
		
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2[i].length; j++) {
				System.out.print(ch2[i][j]+" ");
			}
			System.out.println();
		}
	}
}







