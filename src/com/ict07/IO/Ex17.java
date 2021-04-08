package com.ict07.IO;

import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

public class Ex17 {
	public static void main(String[] args) {
		// FileInputStream : read() : int(아스키) => char형 변환, 대소문자, 숫자만 가능
		//                   read(byte[] b), String 이용
		// FileReader      : read() : int(유니코드) => char형 변환, 전 세계문자 처리 가능
		//                   read(char[] b), String 이용
		
		String pathname = "c:"+File.separator+"study"+
							File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			
			// ↓한글자 읽기
			// int k = fr.read();
			// System.out.println(k+":" + (char)(k));
			
			/* 전체 읽기
			int k = 0 ;
			while( (k=fr.read()) != -1) {
				System.out.print((char)(k));
				// System.out.println(k+":"+(char)(k));
			}*/
			
			/* char[] 이용
			char[] c = new char[(int)(file.length())] ;
			fr.read(c);
			for (char k : c) {
				System.out.print(k);
			}*/
			
			// String 이용
			char[] c = new char[(int)(file.length())];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
		}catch(Exception e) {
		}finally {
			try {
				fr.close();
			}catch(Exception e2) {
		}
	}
}
}
