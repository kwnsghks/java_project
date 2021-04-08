package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex11 {
	public static <BufferdInputSteam> void main(String[] args) {
		//C:\\study\\util\\java_1.png ������
		//C:\\study\\util\\res\\ �ȿ� �����ϴ� �ڵ�
		// ����, ������ ���� ����,�̵� ���� ����
		
		// �д� ��ġ
		String pathname1 = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"java_1.png" ;
		File read_file = new File(pathname1);
		
		// ���� ��ġ
		String pathname2 = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"res"+File.separator+"java_1.png";
		File write_file = new File(pathname2);
		
		// ���� �о ����
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		// OutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
			
			// �׸�, �Ҹ�, ������ ���ϵ��� ó��(����, �̵�)�� ���� 
			//  ������ 1byte�� ó���ؾ� �ȴ�.
			int k = 0;
			// 1byte �б�
			while((k = bis.read()) !=-1) {
				// 1byte ����
				bos.write(k);
			}
			bos.flush();
 		} catch (Exception e) {
 			System.out.println(e);
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
