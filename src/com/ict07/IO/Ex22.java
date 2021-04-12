package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex22 {
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in) ;
		System.out.println("���ϴ� ���� �Է� : ") ;
		String msg = scan.next() ;
		System.out.println("���� ���� : " + msg) ;
		InputStreamReader �� OutputStreamWriter�� �̿��ؼ� �ۼ��϶�.	
		*/
		
		// ����Ϳ� ���
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		// Ű���带 ���� �Է�
		InputStreamReader isr = null;
		BufferedReader br = null;
				
		try {
			osw = new OutputStreamWriter(System.out); // <-ȭ��
			bw = new BufferedWriter(osw);

			isr = new InputStreamReader(System.in) ; // <- Ű����
			br = new BufferedReader(isr);
			
			bw.write("���ϴ� ���� �Է� : ");
			bw.flush();
			
			String msg = br.readLine();
			bw.write("���� ���� : " + msg);
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
