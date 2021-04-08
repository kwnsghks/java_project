package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;

public class Ex15 {
	public static void main(String[] args) {
		// ���� ��Ʈ�� (��� �߽�) : ��� ó���� 2byte�� ó��
		// ��� : �� ������ ��� ���� ������ ���� ���ϵ�
		// �ֻ��� Ŭ���� : Reader(�Է�), Writer(���)
		
		// FileOutputStream(����Ʈ) : 1byteó�� , write(int b), write(byte[] b) : ���� (�ƽ�Ű �ڵ�)
		// FileWriter(����)         : 2byteó�� , write(int b), write(char[] b), write(String str);
		
		String pathname = "c:"+File.separator+"study"+File.separator+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			// �ѱ��� ����
			fw.write(97); // a
			fw.write(65); // A
			fw.write(13); // �� �ٹٲٱ�
			
			// int �̹Ƿ� char�� ��ü�� �� �ִ�.
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('��'); // FileOutputStream�� �ȵ����� FileWriter �� ����
			fw.write('��'); // FileOutputStream�� �ȵ����� FileWriter �� ����
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			char[] c = {'k','o','r','e','a',13,'��','��','��','��'};
			fw.write(c);
			fw.write("\r�ѱ� ICT ���簳�߿�\r");
			fw.write("1������\n");
			fw.write("�ڹ� ����");
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
