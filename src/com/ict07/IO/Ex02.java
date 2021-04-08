package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File 클래스를 사용하기 전에 특정 위치를 지정
		// 내 pc 유틸파일 - C:\\study\\util
		String pathname_1 = "C:\\study\\util" ;  // 운영체제가 windows 일 때 사용 
		String pathname_2 = "C:/study/util" ;   // 운영체제가 Linux, Unix 일 때 사용
		
		// 운영체제와 상관없이 사용하는 방법
		// ↓ JVM에서 바꾸어줌. (윈도우, 유닉스, 리눅스 상관없이 가능)
		String pathname_3 = "C:"+File.separator+"study"+File.separator+"util";  
		
		File file = new File(pathname_3);
		String[] arr = file.list();

		// 날짜 형식 지정 , 날짜를 넣을 때 필요한게 포맷↓
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-hh:mm");
		
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			System.out.println(file2);
			// 컴퓨터에 저장할 수 있는 종류는 디렉토리 or 파일 밖에 없음.
			
			// 수정날짜 구하기 (첫주차에 했었음)
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2 + "\n크기가 존재하지 않음\n"  +
						"수정한 날짜 : " + sdf.format(file2.lastModified()));
				
			}else{
				System.out.println("\n파일 : " + file2 + "크기 : " + (int)(file2.length()/1024)+"KB\n"); 
			}                                  // length는 길이가 아닌 용량을 뜻함. ↑
		}
	}
}
