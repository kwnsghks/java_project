package com.ict12.after;

public class Ex12 {

	public static void main(String[] args) {
		// break�� : ���� �ݺ����� Ż���� �� ���
		// continue�� : continue�� ������ ���๮�� �����ϰ� ���� ȸ���� ������ �� ��.
		//              for���� ���� ������, while�� �϶��� ������� ����
		
		// 1~10���� ����� �� i�� 4�϶� break ;
		for (int i = 1; i < 11 ; i++) {
			if(i==4) break ;  // �극��ũ�� ���������� ������ 4���ķ� ������ ����.(Ż��)
			System.out.println(i);
		}
		System.out.println("==================");
		// 1~10���� ����� �� i�� 4�϶� continue ;
		for (int i = 1; i < 11 ; i++) {
			if(i==4) continue ;  // 4�� ������ �ʰ� �������� �Ѿ.
			System.out.println(i);
		}
		System.out.println("==================");
		
		// ���� for������ break, continue ���
		// j�� 3�϶� break �Ǵ� continue
		for (int i = 1; i < 4 ; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) break;  // j=3 ���� ���ĺ��� �� ����
				System.out.println("i=" + i + ", j = " + j);
			}
		}System.out.println("==================");
		
		for (int i = 1; i < 4 ; i++) {
			for (int j = 1; j < 6; j++) {
				if(j==3) continue; // j=3 ���� �κи� ���ϰ� ���� ���๮���� �Ѿ.
				System.out.println("i=" + i + ", j = " + j);
			}
		}
		
	}

}
