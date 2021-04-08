package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

	//C:\\study\\util\\test100.txt
	//본인 이름 : 000  (스트링 이용)
	//나이 : 00 (스트링 이용)
	//전화번호 : 000-0000-0000
	
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
			
			String msg = "이름 : 김준환\n나이 : 26 \n전화번호 : 010-5298-7744" ;
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
