package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

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

		// ��¥ ���� ���� , ��¥�� ���� �� �ʿ��Ѱ� ���ˡ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm");
		
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			System.out.println(file2);
			// ��ǻ�Ϳ� ������ �� �ִ� ������ ���丮 or ���� �ۿ� ����.
			
			// ������¥ ���ϱ� (ù������ �߾���)
			if(file2.isDirectory()) {
				System.out.println("���丮 : " + file2 + "\nũ�Ⱑ �������� ����\n"  +
						"������ ��¥ : " + sdf.format(file2.lastModified()));
				
			}else{
				System.out.println("\n���� : " + file2 + "ũ�� : " + (int)(file2.length()/1024)+"KB\n"); 
			}                                  // length�� ���̰� �ƴ� �뷮�� ����. ��
		}
	}
}
