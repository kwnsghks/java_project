package com.ict12.after;

public class Ex08 {
	public static void main(String[] args) {
		// for�� : ������ ��Ģ�� ���� ���๮�� �ݺ�ó���ϴ� ��
		// ���� : for(�ʱ��; ���ǽ�; ������){
		//            ���ǽ��� ���� �� ������ ����;
		//            ���ǽ��� ���� �� ������ ����;
		//         }
		
		// for�� ������ ������ �ʱ�ĺ��� �����Ѵ�.
		// ���ǽ��� ���� ���� ����, ���ǽ��� �����̸� for���� ���� ������.
		// for���� ���� ������ ������ ���������� ���� ������ ���Ҹ� �ϰ� �ٷ� ���ǽ����� ����.
		
		// 1~10���� ���
		for (int i = 1; i < 11; i++) {
			System.out.print(" "+i);
		}
		System.out.println();
		for (int i = 1; i < 11; i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}System.out.println();
		
		// 21~40���� Ȧ���� ���
		for (int i = 21; i < 41; i++) {
			if(i%2==1) {
				System.out.println(i);
			}
			
		}
		// 5�� ���
		System.out.println("5��");
		for (int i = 1; i < 10; i++) {
			System.out.println("5*"+i+"="+i*5 );
		}
		System.out.println();
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0	
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
		System.out.println();
		// �ٸ� ���
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if(i%4==0) {
				System.out.println();
			}
		}
		
	}
}
