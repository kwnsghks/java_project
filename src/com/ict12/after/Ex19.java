package com.ict12.after;

import java.util.Calendar;

public class Ex19 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // 컴퓨터의 현재 날짜와 시간, 요일을 뜻한다.
		System.out.println(now.get(Calendar.MONTH) +1+"월"); // 0 - 11
	}

}
