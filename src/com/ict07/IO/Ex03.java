package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		// 작업할 특정 위치 지정(존재하지 않음)
		String pathname = "C:"+File.separator+"study"+File.separator+"util"+
							File.separator+"io_test.txt";
		File file = new File(pathname);
		try {
			boolean b1 = file.createNewFile();
			if(b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			} // 첫번째 실행시 성공 - 파일이 만들어진 후 중복으로 인해 파일 생성 실패
			pathname = "C:"+File.separator+"study"+File.separator+"util"+
					File.separator+"IO_Test";
			
			File file2 = new File(pathname);
			
			boolean b2 = file2.mkdirs() ;  // ← mkdir()과 mkdirs 의 차이?
			if(b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			} // 첫번째 실행시 성공 - 파일이 만들어진 후 중복으로 인해 파일 생성 실패  
			// 또는 똑같은 경로에 있을 떄 실패함.
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if(b3) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패");
			}
			// 파일 삭제
			pathname = "C:"+File.separator+"study"+File.separator+"util"+
					File.separator+"IO_Test"+File.separator+"io_test.txt";
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if(b4) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			
			// 경로표시 (다 똑같이 표시된다.)
			pathname = "C:"+File.separator+"study"+File.separator+"util" ;
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getCanonicalPath());
			System.out.println(file5.getPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
			//- mkdir(), mkdirs() : boolean => 디렉토리를 생성하면 true 
			//  디렉토리 생성못하면 false(같은 이름 있으면 생성못함.)
			// - mkdir(), mkdirs() 의 차이점
			//  : 만들고자 하는 디렉토리의 상위 디렉토가 존재하지 않을 경우 생성 불가 => mkdir();
			// 예) c:\base\want  => want 디렉토리를 만들 때, base 디렉토리가 없는 경우 생성불가.
			//                  상위 디렉토리인 base와 want 디렉토리까지 만들어준다. => mkdirs();
}
