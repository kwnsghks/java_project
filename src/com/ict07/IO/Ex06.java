package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {
	// �ӵ� ����� ���ؼ� BufferedOutputStream�� ����Ѵ�.
	// ȥ�ڼ��� ����� �� ���� �ݵ�� OutputSteam�� �޾Ƽ� ���
	// ������ : BufferedOutputStream(OutputStream out)

	// Ư�� ��ġ�� ���ϱ��� ����
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "ict_02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null ;
		try{
			// ���������� ������ ����� �ϰ�, ������ �����Ѵ�.
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			

			// ���������� ������ ����� �ϰ�, ������ �����Ѵ�.
			// fos = new FileOutputStream(file, true);
			
			// �ѱ��� ����
			bos.write(65);  // A
			bos.write(97);  // a
			System.out.println("\r");
			
			// int �̱� ������ char�� ����� �� �ִ�.
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			// �ڹٿ��� �� ������ 13(Carriage return = CR = \r) �̴�.
			// �ٸ� ����߿��� (\r\n (Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.)
			
			bos.write(13);
			
			// �迭�� �̿��ؼ� �������� ����
			byte[] b = {'H','i',' ','J','a','v','a',13,'g','i','r','l','s',13};
			bos.write(b);
			
			// String�� �̿��ϸ� ���� �̿� ���ڵ� ����
			String str = "Hello \r�ȳ�\r123\r����";
			byte[] b2 = str.getBytes();
			bos.write(b2);
			bos.flush();
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally
		{
			try {
					bos.close();
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}

