package com.ict12.after;

public class Ex06 {
	public static void main(String[] args) {
		// ���� if�� : �������� if���� ����ϴ� ��
		// ���� : if(���ǽ�1){
		//           ���ǽ�1�� ���� �� ������ ����;
		//           }else if(���ǽ�2){
		//           ���ǽ�1�� �����̸鼭 ���ǽ�2�� ���� �� ����;
		//           }else if(���ǽ�3){
		//           ���ǽ�1,2�� �����̸鼭 ���ǽ�3�� ���� �� ����;
		//           }else{
		//           ���ǽ�1,2,3 �� ��� ������ ��, �� �������� ��� ����;
		//           }
		
		// int k1�� ������ 90 �̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, �������� F
		int k1 = 89;
		String res = "";
		if(k1 >=90) {
			res = "A����";
		}else if(k1 >=80) {
			res = "B����";
		}else if(k1 >=70) {
			res = "C����";
		}else {
			res = "F����";
		}
		System.out.println(res);
		
		// char k2�� �빮������, �ҹ�������, ��������, ��Ÿ�������� �Ǻ�
		char k2 = '!';
		if (k2>='A'&& k2 <='Z') {
			res = "�빮��";
		}else if (k2>='a'&& k2 <='z') {
			res = "�ҹ���";
		}else if (k2>='0'&& k2 <='9') {
			res = "����";
		}else {
			res = "��Ÿ����";
		}
		 System.out.println(res);
		
		
	}
}
