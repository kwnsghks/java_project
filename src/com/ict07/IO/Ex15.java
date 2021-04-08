package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// 문자 스트림 (사람 중심) : 모든 처리를 2byte씩 처리
		// 대상 : 전 세계의 모든 언어로 구성된 문서 파일들
		// 최상위 클래스 : Reader(입력), Writer(출력)
		
		// FileOutputStream(바이트) : 1byte처리 , write(int b), write(byte[] b) : 숫자 (아스키 코드)
		// FileWriter(문자)         : 2byte처리 , write(int b), write(char[] b), write(String str);
		
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			// 한글자 쓰기
			fw.write(97); // a
			fw.write(65); // A
			fw.write(13); // ← 줄바꾸기
			
			// int 이므로 char로 대체할 수 있다.
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('대'); // FileOutputStream은 안되지만 FileWriter 는 가능
			fw.write('한'); // FileOutputStream은 안되지만 FileWriter 는 가능
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'대','한','민','국'};
			fw.write(c);
			fw.write("\r한국 ICT 인재개발원\r");
			fw.write("1강의장\n");
			fw.write("자바 수업");
			fw.flush();
		}catch(Exception e) {
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
