package com.ict12.after;

public class Ex02 {

	public static void main(String[] args) {
		// ��������� +,-,*,/,%(������)
		// ���� �ڷ����� ū �ڷ����� �����ϸ� ū �ڷ����� �ȴ�.
		
		// �Ҽ��� ù°�ڸ� ���ϱ�
		double d1 = 24.6843 ; // 24.6
		int d2 = (int)(d1 * 10) ; // d1�� double �̹Ƿ� d1*10 �� double
		System.out.println(d2) ; // 246
		
		double d3 = d2 / 10 ;
		System.out.println(d3);  // d2 �� int �̹Ƿ� d2 / 10 �� int�̴�.
		
		double d4 = d2 / 10.0 ; // d2 �� int �̹Ƿ� d2 / 10.0 �� double�̴�.
		System.out.println(d4);
		
		// �ѹ��� ����
		double d5 = (int)(d1 * 10) / 10.0 ;
		System.out.println(d5);
		
		// ������ ����
		int d6 = 12579 ; // 12570
		int d7 = d6 / 10 ; // 1257
		int d8 = d7 * 10 ; // 12570 ;
		
		// �ѹ��� ����
		int d9 = (d6/10)*10 ;
		System.out.println(d9);
		
		// '/'�� ����� int�� �ϸ� ���� �ȴ�.
		// '%' �� ���� �������� ���Ѵ�. 
		int k1 = 7 ;
		int k2 = 3 ;
		int k3 = k1 / k2 ; // ��
		int k4 = k1 % k2 ; // ������
		System.out.println(k3);
		System.out.println(k4);
		
		// � ���� 2�� ���� �������� 0 �Ǵ� 1 �ΰ����� ����
		// � ���� 5�� ���� �������� 0, 1, 2, 3, 4 �ΰ����� ����
		
		// � ���� 2�� ���� �������� 0 => ¦��
		// � ���� 2�� ���� �������� 1 => Ȧ��
		
	}
}