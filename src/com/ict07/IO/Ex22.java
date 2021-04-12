package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in) ;
		System.out.println("원하는 문자 입력 : ") ;
		String msg = scan.next() ;
		System.out.println("받은 문자 : " + msg) ;
		InputStreamReader 와 OutputStreamWriter를 이용해서 작성하라.	
		*/
		
		// 모니터에 출력
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		// 키보드를 통해 입력
		InputStreamReader isr = null;
		BufferedReader br = null;
				
		try {
			osw = new OutputStreamWriter(System.out); // <-화면
			bw = new BufferedWriter(osw);

			isr = new InputStreamReader(System.in) ; // <- 키보드
			br = new BufferedReader(isr);
			
			bw.write("원하는 문자 입력 : ");
			bw.flush();
			
			String msg = br.readLine();
			bw.write("받은 문자 : " + msg);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}
