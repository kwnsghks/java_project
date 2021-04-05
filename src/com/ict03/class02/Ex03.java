package com.ict03.class02;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		// ���� : Math.random(),   RandomŬ����
		
		// 1. Random Ŭ����
		Random ran = new Random();
		
		// ���� �ڷ����� �����͸� �������� ����
		System.out.println("boolean�� : " + ran.nextBoolean());
		System.out.println("int�� : " + ran.nextInt() );
		System.out.println("long�� : " + ran.nextLong() );
		
		// �Ǽ����´� 0.0�̻� ~ 1.0�̸�
		System.out.println("float�� : " + ran.nextFloat());
		System.out.println("double�� : " + ran.nextDouble());
		System.out.println();
		
		// Ư�������� �����ؼ� ����ϴ� ���
		// 1) nextInt(����) : 0 ~ ���������� �� �� �߻�
		int s1 = ran.nextInt(3);  // 0~2
		System.out.println(s1);
		
		// 2) (int)(nextDouble() * ����) : 0 ~ ���������� �� �� �߻�
		int s2 = (int)(ran.nextDouble()*3); // 0-2
		System.out.println(s2);
		
		// 2. Math Ŭ���� : �����ڰ� ����.
		//                  �޼ҵ���� static�̴�.
		//                  ��ü ���� ���� ȣ�� ����
		// 1) random() : 0.0 ~ 1.0 �̸�
		  System.out.println(Math.random());
		  
		// 2) Ư�� ������ ������ �� 
		int s3 = (int)(Math.random()*3); // 0 ~ 2 
		System.out.println(s3);
		System.out.println();
		
		// 3) abs : ���밪 ��ȯ
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		// 4) ceil(�ø�), round(�ݿø�), floor(����)
		System.out.println("�ø� : " + Math.ceil(3.45)); // 4
		System.out.println("�ø� : " + Math.ceil(3.55)); // 4
		
		System.out.println("���� : " + Math.floor(3.45)); // 3
		System.out.println("���� : " + Math.floor(3.55)); // 3
		
		System.out.println("�ݿø� : " + Math.round(3.45)); // 3
		System.out.println("�ݿø� : " + Math.round(3.55)); // 4
		
		// 5) max �� ��  ū �� ã��
		//    min �� �� ������ ã��
		System.out.println("max : " + Math.max(44.9, 45));
		System.out.println("min : " + Math.min(-44.9, -45));
		
		// 6) pow(double a, double b) : ����
		System.out.println(Math.pow(2, 3)); // 2�� 3�� => 8.0
		System.out.println(Math.pow(3, 2)); // 3�� 2�� => 9.0
	}
}

















