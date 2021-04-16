package com.ict11.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 문서파일을 복사 및 붙이기 하는 경우
		Scanner scan = new Scanner(System.in);
		System.out.println("복사 장소와 파일명 : ");
		String pathname1 = scan.next();
		System.out.println("붙이기 장소와 파일명");
		String pathname2 = scan.next();
	
		// 입력(읽기)
		File file1 = new File(pathname1);
		FileReader fr = null;
		BufferedReader br = null;
		// 출력(쓰기)
		File file2 = new File(pathname2);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			// 읽기
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg+"\n");
			}
			//쓰기
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			String str = sb.toString();
			bw.write(str);
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
	}
}
