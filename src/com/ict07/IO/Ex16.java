package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex16 {
	public static void main(String[] args) {
		// Bufferedwrite : �ӵ������ ���� ���. �ٹٲٱ� �޼ҵ尡 �����Ѵ�.
		
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"ict06.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);  // ������ �ȶ�
			
			// �ѱ��� ����
			bw.write(97); // a
			bw.write(65); // A
			bw.newLine(); // �� �ٹٲٱ�
			
			// int �̹Ƿ� char�� ��ü�� �� �ִ�.
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.write('��'); // FileOutputStream�� �ȵ����� FileWriter �� ����
			bw.write('��'); // FileOutputStream�� �ȵ����� FileWriter �� ����
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.newLine();
			
			char[] c = {'k','o','r','e','a',13,'��','��','��','��'};
			bw.write(c);
			bw.write("�ѱ� ICT ���簳�߿�");
			bw.newLine();  //  �� ���� �޼ҵ�
			bw.write("1������");
			bw.newLine();
			bw.write("�ڹ� ����");
			bw.newLine();
			//bw.write(13);
			
			bw.flush();
		}catch(Exception e) {
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
			}
		}
	}
}
