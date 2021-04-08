package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// �۾��� Ư�� ��ġ ����(�������� ����)
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+
							File.separator+"io_test.txt";
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println("���� ���� ����");
			} // ù��° ����� ���� - ������ ������� �� �ߺ����� ���� ���� ���� ����
			pathname = "C:"+File.separator+"study"+File.separator+"util"+
					File.separator+"IO_Test";
			
			File file2 = new File(pathname);
			
			boolean b2 = file2.mkdirs() ;  // �� mkdir()�� mkdirs �� ����?
			if(b2) {
				System.out.println("���丮 ���� ����");
			}else {
				System.out.println("���丮 ���� ����");
			} // ù��° ����� ���� - ������ ������� �� �ߺ����� ���� ���� ���� ����  
			// �Ǵ� �Ȱ��� ��ο� ���� �� ������.
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if(b3) {
				System.out.println("���丮 ���� ����");
			}else {
				System.out.println("���丮 ���� ����");
			}
			// ���� ����
			pathname = "C:"+File.separator+"study"+File.separator+"util"+
					File.separator+"IO_Test"+File.separator+"io_test.txt";
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if(b4) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println("���� ���� ����");
			}
			
			// ���ǥ�� (�� �Ȱ��� ǥ�õȴ�.)
			pathname = "C:"+File.separator+"study"+File.separator+"util" ;
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getCanonicalPath());
			System.out.println(file5.getPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			//- mkdir(), mkdirs() : boolean => ���丮�� �����ϸ� true 
			//  ���丮 �������ϸ� false(���� �̸� ������ ��������.)
			// - mkdir(), mkdirs() �� ������
			//  : ������� �ϴ� ���丮�� ���� ���䰡 �������� ���� ��� ���� �Ұ� => mkdir();
			// ��) c:\base\want  => want ���丮�� ���� ��, base ���丮�� ���� ��� �����Ұ�.
			//                  ���� ���丮�� base�� want ���丮���� ������ش�. => mkdirs();
}
