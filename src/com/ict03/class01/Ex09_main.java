package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {
	public static void main(String[] args) {
	// 5���� �̸� , ����, ����, ���� ������ �޾Ƽ� 
	// �̸�, ����, ���, ����, ������ ���ϰ� �������� 
		
		// �Է� �޾Ƽ� �迭�� ���� 
		Scanner scan = new Scanner(System.in);
		Ex09[]  arr = new Ex09[5]; // Ŭ������ �����ϴ� �迭
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			int kor = scan.nextInt();
			System.out.print("���� : ");
			int eng = scan.nextInt();
			System.out.print("���� : ");
			int math = scan.nextInt();
			
			Ex09 person = new Ex09();
			person.setName(name);
			person.p_sum(kor, eng, math);
			// person.p_avg();
			// person.p_hak();
			arr[i] = person;
		}
		
		// ���� 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])  continue;
				if(arr[i].getSum() <  arr[j].getSum()) {
					  arr[i].setRank(arr[i].getRank()+1);
				}
			}
		}
		// ����
		// �ڸ��� �����ϱ� ���� �ӽ�����
		Ex09 tmp = new Ex09();
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// ���
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName()+"   ");
			System.out.print(arr[i].getSum()+"   ");
			System.out.print(arr[i].getAvg()+"   ");
			System.out.print(arr[i].getHak()+"   ");
			System.out.println(arr[i].getRank());
		}
	}
}













