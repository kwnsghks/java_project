package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

	//C:\\study\\util\\test100.txt
	//���� �̸� : 000  (��Ʈ�� �̿�)
	//���� : 00 (��Ʈ�� �̿�)
	//��ȭ��ȣ : 000-0000-0000
	
public class Ex09 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" 
				+ File.separator + "util"+ File.separator + "test100.txt";	
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "�̸� : ����ȯ\n���� : 26 \n��ȭ��ȣ : 010-5298-7744" ;
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (Exception e) {
		} finally {
			try {
				bos.close();
				fos.close();
			}catch(Exception e) {
		}
		pathname =  "C:" + File.separator + "study" 
				+ File.separator + "util"+ File.separator + "test100.txt";	
		}
	}
}
