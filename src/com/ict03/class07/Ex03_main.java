package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
		// ������ ��ü ���� ����
		// Inner02 t1 = new Inner02();
		
		// Member ����Ŭ���� ó�� ��ü ���� ����
		// Ex03 t1 = new Ex03();
		// Ex03.Inner02 t2 = t1.new Inner02();
		
		// �ܺ�Ŭ���� ��ü ����
		Ex03 t1 = new Ex03();
		
		// ����Ŭ������ ������ �ִ� �޼ҵ带 �����ؾ� 
		// ����Ŭ���� ���� ���� �ȴ�.
		// ����Ŭ������ ���� ����Ŭ������ ���� �޼ҵ��� �� ����
		// ���� ��ü�� ������ ������ �ؾ� �ȴ�.
		t1.play();
	}
}
