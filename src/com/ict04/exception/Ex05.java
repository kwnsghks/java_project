package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	// throws (���� �絵, ��������)
	// - ���ܰ� �߻��ϸ� ����ó���� ���� �ʰ�, �ڽ��� ȣ���� ������ ���� ��ü�� �����ϴ� ��
	// - ���߿��� ����ó��(try~catch)�� �ϴ� ���� ����.
	public static void main(String[] args){
		Ex05 test = new Ex05();
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("�����Է� : ");
			String msg = scan.next();
			test.setData(msg);
		} catch (Exception e) {
			System.out.println("ù���ڴ� ���ڷ� �Է��ϼ���");
		}
	}
	
	public void setData(String msg) throws NumberFormatException {
		// msg�� ������ ���̰� �Ѱ� �̻��̸� ����
		if(msg.length()>=1) {
			String str = msg.substring(0,1); // ù���ڸ� �����ض�
			 prnData(str);
		}
	}
	
	public void prnData(String str) throws NumberFormatException  {
		// try {
			int dan = Integer.parseInt(str);
			System.out.println(dan + "��");
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + (dan * i));
			}
		// } catch (Exception e) {
		//	System.out.println("ù���ڴ� ���ڷ� �Է��ϼ���");
		// }
	}
}





