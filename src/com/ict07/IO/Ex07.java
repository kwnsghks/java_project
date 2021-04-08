package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		// 1. FileInputStream : ������ ������� 1byte�� �����͸� �б⸦ �� �� �ִ� ��Ʈ��
		// - ������ : FileInputStream(File file), FileInputStream(String name)
		//   File file, String name => Ư����ġ + �����̸�
		// - �ֿ� �޼ҵ�
		// read() : int => ����� ����(�ƽ�Ű �ڵ�)�� ����. - �ƽ�Ű�ڵ�� ������ ����
		//                 char������ ����ȯ �ؾ� ���ڰ� �ȴ�.
		//                 �� �̻� ���� ���� ������ -1 �� ���´�.
		//                 �� ����� ���ڴ� ���� �� ����.(�ѱ�, ���� ��)
		// read(byte[] b) : int => �迭�� ���� ���ڿ� ������ 
		//                         �迭 ũ�⸸ŭ ���ڸ� ���� �� �ִ�.
		//                         byte[] b �� ���� ���ڵ��� �迭ũ�⸸ŭ ����ȴ�.
		
		// close : open�� ��Ʈ�� �ݱ�(��� �� �ݱ�), ���� finally ���� ó��.
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict_01.txt" ;
		File file = new File(pathname); 
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// �ѱ��� �о���� : read() => ����(�ƽ�Ű�ڵ�) -> ����ȯ
			// int k = fis.read();
			// System.out.println(k + ":" + (char)(k));

			// �ѱ��ھ� ��� �ϱ� : �׸�, �Ҹ�, ������, ������ ������ �ش� ����� ���.
			//                      �񿵾���� ���ڵ��� ���� �� ����.
			/*
			int k = 0 ;
			while(true) {
				k = fis.read();
				if(k==-1) break;
				System.out.println(k+":"+(char)(k));
			}
			int k = 0 ;
			// fis�� �̿��ؼ� �� ���ڸ� �о��� �� -1 �� ���� ������ �����ض�
			while((k=fis.read()) != -1) {
				System.out.println(k+":"+(char)(k));
			}*/
			
			// �迭�� �̿��ϴ� ��� : �񿵾�� ��� ���ϴ� ���� ����
			/*
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			for (byte k : b) {
				System.out.println(k+":"+(char)(k));
			}*/
			
			// String�� �̿��ϸ� ���� �̿� ���ڵ� ����
			// String �����ڿ��� byte[] ���ڷ� �޴� �����ڸ� �̿��ϸ� �ȴ�.
			byte[] b = new byte[(int)(file.length())] ;
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
