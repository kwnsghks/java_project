package com.ict02.array;

public class Ex07 {
	public static void main(String[] args) {
		// ������ �迭 : 1�����迭�� ������ ���ΰ�
		// ���� : ��������, �������� ,�⺻
		//        �⺻�ڷ����迭, �����ڷ����迭
		
		// 1. �������� �迭
		// 1) ���� : �ڷ���[][] �̸�;
		// 2) ���� : �̸� = new �ڷ���[1�����迭�� ��][1�����迭�ȿ� �����ϴ� �迭�� ��];
		// 3) ���� : �̸�[index][index] = ������ ; (�������̿��� ���)
		
		int[][] k1 ;
		k1 = new int[2][4];
		
		k1[0][0] = 100;
		k1[0][1] = 200;
		k1[0][2] = 300;
		k1[0][3] = 400;
		
		k1[1][0] = 1000;
		k1[1][1] = 2000;
		k1[1][2] = 3000;
		k1[1][3] = 4000;
		
		// �ּ�Ȯ��
		System.out.println("k1 :" + k1);
		System.out.println("k1[0] :" + k1[0]);
		System.out.println("k1[1] :" + k1[1]);
		
		// ���
		for (int i = 0; i < k1.length; i++) {
			for (int j = 0; j < k1[i].length; j++) {
				System.out.print(k1[i][j]+" ");
			}
			System.out.println(); 
		}
		System.out.println("======================");
		
		// �������� ����� ������ �ѹ��� 
		char[][] k2 = new char[3][2];
		k2[0][0] = 'a';
		k2[0][1] = 'A';
		
		k2[1][0] = 'b';
		k2[1][1] = 'B';
		
		k2[2][0] = 'c';
		k2[2][1] = 'C';
		for (int i = 0; i < k2.length; i++) {
			for (int j = 0; j < k2[i].length; j++) {
				System.out.print(k2[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		// ����� ������ ������ ���� �ѹ��� 
		int[][] k3 = {{1,2,3,4},{10,20,30,40},{100,200,300,400}};
		for (int i = 0; i < k3.length; i++) {
			for (int j = 0; j < k3[i].length; j++) {
				System.out.print(k3[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("======================");
		
		// 1���� �迭�� ���� ������ �迭�� �ֱ�(��������, �������� ��� ��� ����)
		char[][]  k4 = new char[3][4];
		
		char[] s1 = {'j','a','v','a'};
		char[] s2 = {'��','��','��','��'};
		char[] s3 = {'1','2','3','4'};
		
		k4[0] = s1 ;
		k4[1] = s2 ;
		k4[2] = s3 ;
		for (int i = 0; i < k4.length; i++) {
			for (int j = 0; j < k4[i].length; j++) {
				System.out.print(k4[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}








