package com.ict07.IO;

public class Ex01 {
	// File 클래스 : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
	// 생성자 : File(File parent, String child), File(String pathname)
	//          File(String parent, String child), File(URI uri)
	//       ** parent => 상위경로, child => 하위경로
	//          parent + child => 전체 경로
	//          pathname => 전체 경로
	//          uri => 나중 네트워크 할 때 필요

	// 주요 메소드 
	// - createNewFile() : boolean => 파일을 생성하면 true
	//                                생성하지 못하면 false(같은 이름 있으면 생성못함.)
	// - mkdir(), mkdirs() : boolean => 디렉토리를 생성하면 true 
	//                                  디렉토리 생성못하면 false(같은 이름 있으면 생성못함.)
	// - mkdir(), mkdirs() 의 차이점
	//   : 만들고자 하는 디렉토리의 상위 디렉토가 존재하지 않을 경우 생성 불가 =>mkdir();
	// 예) c:\base\want  => want 디렉토리를 만들 때, base 디렉토리가 없는 경우 생성불가.
	//                      상위 디렉토리인 base와 want 디렉토리까지 만들어준다. => mkdirs()
	
	// - delete()      : 파일, 디렉토리 삭제
	// - isDirectory() : 디렉토리이면 true
	// - isFile()      : 파일이면 true
	// ** 저장측면에서 컴퓨터에는 파일과 디렉토리만 존재한다.
	//   즉, 파일이 아니면 디렉토리이다. - 디렉토리가 아니면 파일이다.
	
	// ** List() : 지정한 위치의 파일 및 디렉토리를 String[]에 담는다.(웹 디스크 만들 때 사용)
	// - length(): 배열이나 String에서는 길이를 뜻하지만 File 클래스에서는
	//             길이가 아니라 파일의 크기를 byte로 표현한 것. 
	//             용량 : byte  =>  KB  =>  MB  =>  GB  =>  TB (한단계 올라갈 때마다 1024(2의 10승))
	
	// - getAbsolutePath() : 절대 경로 표시  (파일 윗부분)
	//                       경로의 풀네임 (시작부터 끝까지) => 여기서 시작은 루트를 말함
	// - getPath()         : 상대 경로 표시
	//                       현재 위치에서 해당 파일까지 접근하기 위해 거쳐야 되는 경로
	// - getCanonicalPath() : 정규화 경로
	
	// - lastModified()     : 마지막 수정날짜 (수정한 날짜)
	
	
}
