package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Ex02 {
	public static void main(String[] args) {
		// URL 클래스 : URL(Uniform Resource Locator) : 접근 가능한 자원의 주소를 말함.
		//              final 클래스이기 때문에 상속 안됨.
		// 
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		String pathname = "C:"+File.separator+"study"+File.separator+"util"
							+File.separator+"네이버영화.txt" ;
		File file = new File(pathname);
		FileWriter fw = null;  // 문자를 쓰기때문에 FileWriter를 씀
		BufferedWriter bw = null;
		try {
			// 먼저 웹페이지를 읽자.
			URL url = new URL("https://movie.naver.com/");
			is = url.openStream();
			 //   ↓ 기계와 기계가 통신한걸 사람이 알게끔 보여져야함.(InputStreamReader)
			isr = new InputStreamReader(is,"utf-8"); // "utf-8" 은 한글처리까지 함.
			br=new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null){
				sb = sb.append(msg+"\n");
			}
				
			System.out.println(sb.toString());
			// ↓ 파일 만들어서 써줌.
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
