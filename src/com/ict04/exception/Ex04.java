package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// finally : ����ó���� ������� �ݵ�� �����ؾ� �Ǵ� ������ 
		//           ó���Ҷ� ���(�����ͺ��̽�, ��/���, ��Ʈ��ũ ���� �ַ� ����Ѵ�.)
		// try ~ catch ~ finally
		
		 Scanner scan = new Scanner(System.in);
		try {
	    	int var = 27 ;
	    	System.out.print("���� �Է� : ");
	    	int su = scan.nextInt();
	    	System.out.println("���� : " + (var/su));
	    //	return  ;
		} catch (Exception e) {
		   System.out.println("����� �Է��ϼ��� : " + e);
		   return;
		} finally {
			System.out.println("�ݵ�� �����ؾ� �� ����");
		}
	    
	     System.out.println("�����ϼ̽��ϴ�.");
		
	}
}
