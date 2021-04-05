package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer ,  StringBulider => 문자열을 빈번하게 수정,삭제,추가할 경우 사용을 권장한다.
		
		String msg = "hello";
		System.out.println(msg);
		
		// String은 불변의 속성을 가지고 있어서 
		// 메모리 새로운 영역을 차지해서 hello java를 새로 만든다. 
		msg = msg + " java";
		System.out.println(msg);
		
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		
		// StringBuffer는 가변의 속성을 가지고 있어서 
		// 현재 영역에서 내용을 추가한다.
		
		// 내용을 추가할때 (append("문자열");
		sb.append("JAVA");
		
		System.out.println(sb.toString());
		
		
	}
}
