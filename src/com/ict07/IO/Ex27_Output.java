package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex27_Output {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		String pathname = "c:"+File.separator+"study"
						+File.separator+"util"+File.separator+"ict11.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			ArrayList<Ex27_VO> list = new ArrayList<Ex27_VO>();
			
			esc:
			while(true) {
				System.out.println("이름 : ") ;
				String name = scan.next();
				System.out.println("국어 : ");
				int kor = scan.nextInt();
				System.out.println("영어 : ") ;
				int eng = scan.nextInt();
				System.out.println("수학 : ") ;
				int math = scan.nextInt();
				
				Ex27_VO vo = new Ex27_VO(name, kor, eng, math);
				list.add(vo);
				while(true) {
					System.out.println("계속할까요? (y/n)>>");
					String msg = scan.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}else {
						continue;
					}
				}
			}
			oos.writeObject(list);
			oos.flush();
			
		} catch (Exception e) {
			System.out.println(e);// 오류날꺼 있을까봐 찍음
		}finally {
			try {
			oos.close();
			bos.close();
			fos.close();
		} catch (Exception e2) {
			System.out.println(e2);// 오류날꺼 있을까봐 찍음
		}
		}
	}
}
