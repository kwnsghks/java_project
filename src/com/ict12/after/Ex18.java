package com.ict12.after;

public class Ex18 {

	public static void main(String[] args) {
		// ������ �迭 : 1���� �迭�� ������ ���� ��
		// ���� : ��������, �������� 
		// 2. �������� : 1���� �迭 �ȿ� �����ϴ� �迭�� ũ�Ⱑ ���� �ٸ���.
		// ���� => ���� => ������ ����

		// ����
		char[][] ch1;
		ch1 = new char[3][];
		
		// �������� ������ �Է��� �������� ó�� �ϸ� ���� �߻�.(������ �� ����)
		char[] t1 = {'j','a','v','a'};
		char[] t2 = {'j','s','p'};
		char[] t3 = {'1','2'};
		ch1[0] = t1;
		ch1[1] = t2;
		ch1[2] = t3;
		
		// ��¹���� �������̳� �������̰� ����.
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.println(ch1[i][j]);
			}
		}System.out.println();
		// ����� ������ ������ ������ �ѹ���
		char[][] ch2 = {{'a','b'},{'A','B','C','D'},{'1','2','3'},{'��','��'}};
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2[i].length; j++) {
				System.out.println(ch2[i][j]);
			}
		}
		
	}

}
