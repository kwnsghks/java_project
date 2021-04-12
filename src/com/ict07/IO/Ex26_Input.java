package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex26_Input {
	public static void main(String[] args) {
		String pathname = "c:"+File.separator+"study"
						+File.separator+"util"+File.separator+"ict10.ser";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			Ex26_VO vo1 = (Ex26_VO)ois.readObject();
			Ex26_VO vo2 = (Ex26_VO)ois.readObject();
			Ex26_VO vo3 = (Ex26_VO)ois.readObject();
			System.out.println(vo1.getName());
			System.out.println(vo1.getAge());
			System.out.println(vo1.getWeight());
			System.out.println(vo1.isGender());
			
			System.out.println(vo2.getName());
			System.out.println(vo2.getAge());
			System.out.println(vo2.getWeight());
			System.out.println(vo2.isGender());
			
			System.out.println(vo3.getName());
			System.out.println(vo3.getAge());
			System.out.println(vo3.getWeight());
			System.out.println(vo3.isGender());
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
