package com.ict03.class01;

public class Ex05 {
	// ���������� : �ܺο��� �����Ͽ� ����� �� �ִ� �ܰ踦 ����
	// public :  ������ �� ���� ����
	// protected : ������Ű���� �ٸ� ��Ű���� ��Ӱ����̸� ���� ����
	// ����      : ���� ��Ű�������� ���� ����
	// private   : �ܺο����� ���� �Ұ� ���ο����� ���� ����
	
	public int s1 = 10 ;
	private int s2 = 20 ;
	public static int s3 = 30;
	private static int s4 = 40 ;
	
	public void add() {
		s1 = s1 + 10 ;
		s2 = s2 + 10 ;
		s3 = s3 + 10 ;
		s4 = s4 + 10 ;
	}
	
	private void add2() {
		s1 = s1 + 10 ;
		s2 = s2 + 10 ;
		s3 = s3 + 10 ;
		s4 = s4 + 10 ;
	}
	// �޼ҵ尡 �޼ҵ� ȣ�Ⱑ��
	void add3() {
	     add2();	
	}
	
	
}
