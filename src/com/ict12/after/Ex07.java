package com.ict12.after;

public class Ex07 {
	public static void main(String[] args) {
		// switch ~ case �� : if ���� ���� �б⹮
		// if ���� ����ϴ� ���ǽ��� boolean, �񱳿���, ������ �̴�.
		// switch ���� byte, short, int, char, String (<=���ڰ�)�� ���� ��밡��
		// ** ������ ������ if ���� ���ϴ�.
		// ����  switch (���ڰ�) {
		//       case ���ǰ� 1 : ���ڰ����� �䱸�� ���� ���ǰ�1 �϶� ������ ���� ; break;
		//       case ���ǰ� 2 : ���ڰ����� �䱸�� ���� ���ǰ�2 �϶� ������ ���� ; break;
		//       case ���ǰ� 3 : ���ڰ����� �䱸�� ���� ���ǰ�3 �϶� ������ ���� ; break;
		//       default       : ���ǰ� 1,2,3 ��� �ƴ� ���, �� �������� �� ����
		//       }
		// ** ���ǻ��� : break���� ������ ���� break�� ���� ������ ��� ���๮�� �����Ѵ�.
		//               break���� ���������� ������ �Ѵ�.
		
		// int k1 �� 1�Ǵ� 3�̸� ����, 2�Ǵ� 4�̸� ���� �������� �ܱ���
		int k1 = 1                                                                                                                                                                                                                                                                                                                                      ;
		String res = " " ;
		switch (k1) {
		case 1: res = "����"; break;
		case 3: res = "����"; break;
		case 2: res = "����"; break;
		case 4: res = "����"; break;
			
		default: res = "�ܱ���"; break;
		}
		System.out.println(res);
		
		// ���� ������ �̿��ϸ� 
		switch (k1) {
		case 1:
		case 3: res = "����"; break;
		case 2:
		case 4: res = "����"; break;
			
		default: res = "�ܱ���"; break;
		}
		System.out.println(res);

	}
}
