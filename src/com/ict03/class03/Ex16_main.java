package com.ict03.class03;

public class Ex16_main {
	public static void main(String[] args) {
		// �ڽ��� ȣ���ϴ� ���� : 
		//   �θ�Ŭ������ ������� �� �ڽ�Ŭ������ ���������.
		Ex15 person1 = new Ex15();
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.id);
		System.out.println();
		
		Ex15 person2 = new Ex15("�Ӳ���");
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.id);
		System.out.println();
	}
}
