package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		// �ӵ������ ���ؼ� BufferedInputStream�� ����Ѵ�.
		// �Ȱ��� ȥ�ڼ� ����� �� ����, �ݵ�� InputStream�� �޾Ƽ� ����Ѵ�.
		// ������ : BufferedInputStream(InputStream in)
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict_01.txt" ;
		File file = new File(pathname); 
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			// �ѱ��� �о���� : read() => ����(�ƽ�Ű�ڵ�) -> ����ȯ
			 int k = bis.read();
			 System.out.println(k + ":" + (char)(k));

			// �ѱ��ھ� ��� �ϱ� : �׸�, �Ҹ�, ������, ������ ������ �ش� ����� ���.
			//                      �񿵾���� ���ڵ��� ���� �� ����.
			
			 /*
			int k = 0 ;
			while(true) {
				k = fis.read();
				if(k==-1) break;
				System.out.println(k+":"+(char)(k));
			}*/
			 
			/*
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
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				bis.close();
				fis.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}


