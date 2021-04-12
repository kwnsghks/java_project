package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_jun {
	public static void main(String[] args) {

	String pathname1 = "C:"+File.separator+"study"+File.separator+"util"
			+File.separator+"res"+File.separator+ "java_1.png" ; 
	File file1 = new File(pathname1) ;
	
	String pathname2 = "C:\\study\\util\\res\\java_2.png";
	File file2 = new File(pathname2) ;
	
	FileInputStream fis = null;
	FileOutputStream fos = null;
	try {
		fis = new FileInputStream(file1);
		fis = new FileInputStream(file2);
		
		fos = new FileOutputStream(file1);
		fos = new FileOutputStream(file2);
	}catch (Exception e) {
	}finally {
		try {
			fis.close();
			fos.close();
		}catch (Exception e) {
		
		}
	}
	
	}
}
