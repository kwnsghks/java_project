package com.ict12.after;

public class Ex13 {

	public static void main(String[] args) {
		// break label�� : ���̺��� ������ ����� Ż���� �� ���
		// continue label�� : continue�� ������ ���๮�� �����ϰ� ���̺��� ������ ���� ȸ���� ����
		//                    ���̺��� ������ �ݺ����� ���� ȸ���� ����
		// �ܼ� for���� ���� break�� break label�� ���� ȿ������ break label�� ����� ������ ����.
		// (continue���� ����)
		
		// break
		
		for (int i = 1; i < 100; i++) {
			if(i==6) break;
			System.out.println(i);
		}
		System.out.println();
		
		esc : // ���̺� �̸� = esc
			for (int i = 1; i < 100; i++) {
			if(i==6) break esc;
			System.out.println(i);
			}
			System.out.println();
		System.out.println("================");
		// ���� for���� ���
	for (int i = 1; i < 4 ; i++) {
		for (int j = 1; j < 6; j++) {
			if(j==3) break;  // j=3 ���� ���ĺ��� �� ����
			System.out.println("i=" + i + ", j = " + j);
			}
		}
	System.out.println("================");
	esc1 : 
	for (int i = 1; i < 4 ; i++) {
		for (int j = 1; j < 6; j++) {
			if(j==3) break esc1;  // j=3 ���� ���ĺ��� �� ����
			System.out.println("i=" + i + ", j = " + j);
			}
		}
	System.out.println("================");
	
	// ���� for���� ��� j�� 3�϶� continue
		for (int i = 1; i < 4 ; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue;  // j=3 ���� ���ĺ��� �� ����
				System.out.println("i=" + i + ", j = " + j);
				}
			}
		System.out.println("================");
	esc2 : 
		for (int i = 1; i < 4 ; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue esc2;  // j=3 ���� ���ĺ��� i�� �������� i++�� ��
				System.out.println("i=" + i + ", j = " + j);
				}
			}
	}
}
