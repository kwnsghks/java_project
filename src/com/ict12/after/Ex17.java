package com.ict12.after;

public class Ex17 {
	public static void main(String[] args) {
		// ������ �迭 : 1���� �迭�� ������ ���� ��
		// ���� : ��������, �������� 

		// 1. �������� �迭
		// ���� : �ڷ���[][] �̸�;
		// ���� : �̸� = new �ڷ���[1���� �迭�� ��][1���� �迭�ȿ� �����ϴ� �迭�� ��];
		// ���� : �̸�[index][index] = ������ ; (�������̿����� ��� ����)
		
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
		
		// ���(��������, �������� ��� ���� ��� ���)
		for (int i = 0; i < k1.length; i++) {
			for (int j = 0; j < k1[i].length; j++) {
				System.out.println(k1[i][j]);
			}
		}
		System.out.println();
		
		// ������ ������ �ѹ���
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
		
		// ������ ����� ������ ������ �ѹ���
		int[][] k3 = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 1���� �迭�� ���� ������ �迭�� �ֱ�
		char[][] k4 = new char[3][2];
		
		char[] s1 = {'j','a'} ;
		char[] s2 = {'��','��'} ;
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






