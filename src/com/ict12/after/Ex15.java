package com.ict12.after;

public class Ex15 {
	public static void main(String[] args) {
		// �迭�� �����ϱ�
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		
		// �ڸ������� ���� �ӽú���
		int tmp = 0;
	
		// ������ ���� for ��
		for (int i = 0; i < su.length-1; i++) {
			for (int j = i+1; j < su.length; j++) {
				// ��(i)���� ��(j)�� ������ �ڸ��ٲ�. (��������)
				// ��(i)���� ��(j)�� ũ�� �ڸ��ٲ�. (��������)
				if(su[i] < su[j]) {
					tmp = su[j];
					su[j] = su[i];
					su[i] = tmp;
				}
			}
		}
		// ���
		for (int i = 0; i < su.length; i++) {
			System.out.print(" "+su[i]);
		}
		System.out.println();
		System.out.println(su[0]);
		System.out.println(su[9]);
	}
}
