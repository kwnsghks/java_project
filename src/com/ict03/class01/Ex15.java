package com.ict03.class01;

public class Ex15 {
	int s1 = 100 ;
	
	// �ʱ�ȭ �� �����ʹ� �ʱ�ȭ�� ������ ��������.
	static int s2 = 200 ;
	
	// static �ʱ�ȭ 
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
		// s5 = 5000;
	}
	// �ʱ�ȭ ���� �����ص� ���� �߻� ����
	static int s3 = 300;
	static int s4 ;
	
	public static void main(String[] args) {
		// main()�� static �̹Ƿ� ���������� instance�̸� ����� �� ����.
		// System.out.println(s1);
		System.out.println(s2);  // 2000
		System.out.println(s3);  // 300
		System.out.println(s4);  // 4000
		
	
	}
}









