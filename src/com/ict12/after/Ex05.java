package com.ict12.after;

public class Ex05 {
	public static void main(String[] args) {
		// if~ else~ : ���ǽ��� ���� ���� ������ �� ���� ����� ó���Ѵ�.
		// ����) if(���ǽ�){
		//          ���ǽ��� ���� �� ������ ����
		//          ���ǽ��� ���� �� ������ ����
		//       }else{
		//          ���ǽ��� ������ �� ������ ����
		//          ���ǽ��� ������ �� ������ ����
		//       }
		//       ��, ������ ������ �� ���̸� ������ ����
		
		// double avg�� 60 �̻��̸� �հ�, �ƴϸ� ���հ�
		double avg = 59;
		String res = "�ʱⰪ";
		if(avg>= 60) {
			res = "�հ�";
		}else {
			res = "���հ�";
		}
		System.out.println(res);
		
		// int k1 �� Ȧ������ ¦������ �Ǻ�����
		int k1 = 12;
		if(k1 % 2 == 0) {
			res = "¦��";	
		}else {
			res = "Ȧ��";
		}
		System.out.println(res);

		// char c1 �� �빮������ �ҹ������� �Ǻ�����
		char c1 = '��';
		if(c1>='A' && c1<='Z') {
			res = "�빮��";
		}else {
			res = "�빮�� �ƴ�";
		}
		System.out.println(res);
	}
}
