package com.ict03.class04;

public abstract class Ex01 {
	// �߻� Ŭ���� : �߻�޼ҵ带 ������ �ִ� Ŭ������ �߻�Ŭ������� �Ѵ�.
	//               �Ϲ����� �޼ҵ�� �ʵ带 ���� �� �ִ�.
	//               �߻�Ŭ�������� �ݵ�� abstract ���� ����Ѵ�.
	
	// �߻� �޼ҵ� : ��üȭ�� ���� ���� �޼ҵ带 �ǹ��Ѵ�.
	//               body ����� �������� ���� �޼ҵ带 ���Ѵ�.
	//               body ����� ������ ���๮�� ����.(��üȭ�� ���� �ʾҴٴ� ��)
	//               �߻�޼ҵ忡�� �ݵ�� abstract ���� ����Ѵ�.
	
	// ������ : �ϳ��� �޼ҵ峪 Ŭ������ ���� �� 
	//          �̰͵��� �پ��� ������� ���۽�Ű�� ���� �ǹ��Ѵ�.
	
	
	int s1 = 10 ;                // �ν��Ͻ� ����
	static int s2 = 10 ;         // static ����
	final int S3 = 10 ;          // �ν��Ͻ� ���
	static final int S4 = 10;    // static ���
	
	public void play() {
		System.out.println("�ν��Ͻ� �޼ҵ�");
	}
	public static void prn() {
		System.out.println("static �޼ҵ�");
	}
	// �߻�޼ҵ�
	public abstract void sound() ;
}










