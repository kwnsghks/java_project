package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

// ��ü ������ : ObjectInputStream : readObject()
public class Ex23_Input {
	public static void main(String[] args) {
		// ��ü ������ȭ : ����ȭ�� �����̳� ������ ���� �������� �����ϴ� ������ ��.
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+File.separator+"ict07.ser" ;
		
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			// ������ȭ : ���� ��ü�� �ǵ��� ����.
			Ex23_VO vo = (Ex23_VO) ois.readObject();
			
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			
		} catch (Exception e) {
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
