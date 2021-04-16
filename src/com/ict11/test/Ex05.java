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
		// ������ �ƴ� ��� ������ ���� �� ���̱� �ϴ� ���
		
		// ���������� ���� �� ���̱� �ϴ� ���
				Scanner scan = new Scanner(System.in);
				System.out.println("���� ��ҿ� ���ϸ� : ");
				String pathname1 = scan.next();
				System.out.println("���̱� ��ҿ� ���ϸ�");
				String pathname2 = scan.next();
				
				// �Է�(�б�)
				File file1 = new File(pathname1);
				FileInputStream fis = null;
				BufferedInputStream bis = null;
				// ���(����)
				File file2 = new File(pathname2);
				FileOutputStream fos = null;
				BufferedOutputStream bos = null;
				
				
				try {
					// �б�
					fis = new FileInputStream(file1);
					bis = new BufferedInputStream(fis);
					
					//����
					fos = new FileOutputStream(file2);
					bos = new BufferedOutputStream(fos);
					// �׸�, �Ҹ�, ������ ���ϵ��� ó���� �� ������ 1byte�� ó������.
					int k = 0;
					while((k = bis.read()) != -1) {   // null �� �ƴ� -1 �� ���� : int���� ���̻� ���� �� ���� ��)
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
