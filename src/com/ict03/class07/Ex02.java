package com.ict03.class07;

// 1. Member ����Ŭ����
public class Ex02 {
	String name = "ȫ�浿";
	private int age = 24 ;
	static String addr = "���ֵ�";
	
	public Ex02() {
		System.out.println("�ܺ�Ŭ���� ������ : " + this);
	}
	
	public void sound() {
		int money = 1000;
		final int  time = 2 ;
		// ���������� static ��� �Ұ�
		//static int number = 12;
		// static final int number2 = 12;
		System.out.println("�ܺ�Ŭ���� �޼ҵ� : "+ name +", money : " + money);
	}
	
	
	public class Inner01 {
		String name = "ȫ����";
		final int i2 = 10;
		// ����Ŭ���������� static ��� ����
		// static int i3 = 20;
		static final int i4 = 30;
		
		 public Inner01() {
			System.out.println("����Ŭ���� ������ : "+this);
		}
		 
		 // ����Ŭ������ �ܺ�Ŭ������ �޼ҵ�� �ʵ带 ������� ��밡��
		 // ����Ŭ���� �޼ҵ�
		 public void play() {
			 int money = 50000;
			 System.out.println("�̸� : " + name);
			 System.out.println("�ݾ� : " + money);
			 System.out.println("���� : " + age);
			 // �ܺ�Ŭ���� �޼ҵ� 
			 sound();
		 }
	}
}












