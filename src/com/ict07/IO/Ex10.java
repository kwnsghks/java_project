package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

	//C:\\study\\util\\test100.txt
	//���� �̸� : 000  (��Ʈ�� �̿�)
	//���� : 00 (��Ʈ�� �̿�)
	//��ȭ��ȣ : 000-0000-0000
	//�ؽ�Ʈ ���Ͽ��ٰ� ���°� �ְ� �ִ°� ���� ��.
	// + ��ƿ���� ����, �������ϵ� �־ ��
public class Ex10 {
	public static void main(String[] args) {
		String pathname = "C:" + File.separator + "study" 
				+ File.separator + "util"+ File.separator + "test100.txt";	
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			}catch (Exception e) {
			}
		}
		pathname =  "C:" + File.separator + "study" 
				+ File.separator + "util"+ File.separator + "test100.txt";	
	}
}
