package com.ict12.after;

public class Ex09 {
	public static void main(String[] args) {
	 // ���� for�� : for�� �ȿ� for���� ����
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.println("i="+i+",j="+j);
			}
		}
		// ������
		for (int i = 2; i < 10; i++) {
			System.out.println("\n"+i+"��");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j)+" ");
			}
		}
		// ������ -2 (���� ���� ������ ����)
		for (int i = 2; i < 10; i++) {
			System.out.println(i+"��");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + "*" + j + "=" + (i*j)+" ");
			}System.out.println();
		}
		System.out.println();
		
		// ������ -3 (���� ���� ���� ����)
		System.out.println("2��   3��   4��   5��   6��   7��   8��   9��");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "*" + i + "=" + (i*j)+" ");
			}System.out.println();
		}
		
	}
}
