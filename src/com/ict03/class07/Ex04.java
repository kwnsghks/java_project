package com.ict03.class07;

// 3. static ����Ŭ����
public class Ex04 {
	String name = "ȫ�浿";
	private int age = 24 ;
	static String addr = "���ֵ�";
	
	public Ex04() {
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
	
	
	public static class Inner03 {
		String name = "ȫ����";
		final int i2 = 10;
		// ����Ŭ���������� static ��� ����
		// ������ static�� ����ϰ��� �Ϸ��� ����Ŭ�������� static�� ������ 
		static int i3 = 20;
		static final int i4 = 30;
		
		 public Inner03() {
			System.out.println("����Ŭ���� ������ : "+this);
		}
		 
		 // ����Ŭ������ �ܺ�Ŭ������ �޼ҵ�� �ʵ带 ������� ��밡��
		 // ����Ŭ���� �޼ҵ�
		 public void play() {
			 int money = 50000;
			 System.out.println("�̸� : " + name);
			 System.out.println("�ݾ� : " + money);
			 
			 // �ܺ�Ŭ������ �ʵ� static�� �پ�� ��� ����
			 // System.out.println("���� : " + age);
			
			 // �ܺ�Ŭ���� �޼ҵ� static�� �پ�� ��� ���� 
			 //sound();
		 }
	}
}












