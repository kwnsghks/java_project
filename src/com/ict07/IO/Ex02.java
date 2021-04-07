package com.ict07.IO;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		// File Ŭ������ ����ϱ� ���� Ư�� ��ġ�� ����
		// �� pc ��ƿ���� - C:\\study\\util
		String pathname_1 = "C:\\study\\util" ;  // �ü���� windows �� �� ��� 
		String pathname_2 = "C:/study/util" ;   // �ü���� Linux, Unix �� �� ���
		
		// �ü���� ������� ����ϴ� ���
		// �� JVM���� �ٲپ���. (������, ���н�, ������ ������� ����)
		String pathname_3 = "C:"+File.separator+"study"+File.separator+"util";  
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			if(file2.isDirectory()) {
				System.out.println("���丮 : " + file2);
			}else{
				System.out.println("���� : " + file2);
			}
		}
	}
}
