package com.ict02.array;

public class Ex02 {
	public static void main(String[] args) {
		// �迭 ���� ���� : ���� -> ���� -> ������ ����
	
		// ����� ������ �ѹ��� ���� 
		char[] c1 = new char[4] ;
		c1[0] = 'J';
		c1[1] = 'A';
		c1[2] = 'V';
		// c1[3] = 'A';
		c1[3] = 65; // 0-65535(char����)����� �����߻�
		
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		// ����� ������ ������ ������ �ѹ��� ���� 
		String[] msg = {"java","jsp","spring","android"};
		
	}
}
