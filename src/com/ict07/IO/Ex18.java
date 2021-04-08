package com.ict07.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Iterator;

public class Ex18 {
	public static void main(String[] args) {
		// BufferReader : 속도향상을 위해서 사용 , 한줄씩 읽는 메소드가 존재
		String pathname = "c:"+File.separator+"study"+
							File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			// ↓한글자 읽기
			// int k = br.read();
			// System.out.println((char)(k));
			
		 /*↓전체 읽기
			int k = 0 ;
			while( (k=br.read()) != -1) {
				System.out.print((char)(k));
				// System.out.println(k+":"+(char)(k));
			}*/
			
			/* char[] 이용
			char[] c = new char[(int)(file.length())] ;
			br.read(c);
			for (char k : c) {
				System.out.print(k);
			}*/
			
			/* String 이용
			char[] c = new char[(int)(file.length())];
			br.read(c);
			String msg = new String(c);
			System.out.println(msg);
			*/
			
			// 처음줄 읽기
			// String msg = br.readLine();
			// System.out.println(msg);
			
			// 모두 읽기
			String msg = null;
			StringBuffer sb = new StringBuffer(); //
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());  // ← 없으면 실행창에 안뜸.
			
		}catch(Exception e) {
		}finally {
			try {
				br.close();
				fr.close();
			}catch(Exception e2) {
		}
	}// 읽을 파일을 스캐너에 치게끔 함. 복사 원본, 복사사본을 스캔으로 받기
}
}
