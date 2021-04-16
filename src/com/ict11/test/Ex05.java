package com.ict11.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 문서가 아닌 모든 파일을 복사 및 붙이기 하는 경우
		
		// 문서파일을 복사 및 붙이기 하는 경우
				Scanner scan = new Scanner(System.in);
				System.out.println("복사 장소와 파일명 : ");
				String pathname1 = scan.next();
				System.out.println("붙이기 장소와 파일명");
				String pathname2 = scan.next();
				
				// 입력(읽기)
				File file1 = new File(pathname1);
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				// 출력(쓰기)
				File file2 = new File(pathname2);
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				
				try {
					// 읽기
					fis = new FileInputStream(file1);
					bis = new BufferedInputStream(fis);
					
					//쓰기
					fos = new FileOutputStream(file2);
					bos = new BufferedOutputStream(fos);
					// 그림, 소리, 동영상 파일들을 처리할 때 무조건 1byte씩 처리하자.
					int k = 0;
					while((k = bis.read()) != -1) {   // null 이 아닌 -1 인 이유 : int형이 더이상 읽을 수 없을 때)
						bos.write(k);
					}
					bos.flush();
					
				} catch (Exception e) {
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
