package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Input {
	public static void main(String[] args) {
		String pathname = "c:"+File.separator+"study"
						+File.separator+"util"+File.separator+"ict11.ser";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<Ex27_VO> list = (ArrayList<Ex27_VO>)ois.readObject();
			
			for (Ex27_VO k : list) {
				k.setSum(k.getKor()+k.getEng()+k.getMath());
				k.setAvg((int)k.getSum()/3.0*10/10.0);
				if(k.getAvg()>=90) {
					k.setHak("A«–¡°");
				}else if(k.getAvg()>=80) {
					k.setHak("B«–¡°");
				}else if(k.getAvg()>=70) {
					k.setHak("C«–¡°");
				}else {
					k.setHak("F«–¡°");
				}
			}
			System.out.println("¿Ã∏ß\t√—¡°\t∆Ú±’\t«–¡°");
			for (Ex27_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getSum()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak());
			}
		} catch (Exception e) {
			System.out.println(e); // ø¿∑˘≥Ø≤® ¿÷¿ª±Ó∫¡ ¬Ô¿Ω
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2); // ø¿∑˘≥Ø≤® ¿÷¿ª±Ó∫¡ ¬Ô¿Ω
			}
		}
	}
}
