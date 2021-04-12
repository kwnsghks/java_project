package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Ex26_Output {
	public static void main(String[] args) {
		String pathname = "c:"+File.separator+"study"
						+File.separator+"util"+File.separator+"ict10.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			Ex26_VO vo1 = new Ex26_VO("태권브이",42,197.2,true);
			Ex26_VO vo2 = new Ex26_VO("태권보이",60,170,true);
			Ex26_VO vo3 = new Ex26_VO("태권걸",50,160,false);
			oos.writeObject(vo1);
			oos.writeObject(vo2);
			oos.writeObject(vo3);
			oos.flush();
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
		try {
			oos.close();
			bos.close();
			fos.close();
		} catch (Exception e2) {
			System.out.println(e2);
		}
		}
	}
}
