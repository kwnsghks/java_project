package com.ict12.after;

import java.util.Calendar;

public class Ex19 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // ��ǻ���� ���� ��¥�� �ð�, ������ ���Ѵ�.
		System.out.println(now.get(Calendar.MONTH) +1+"��"); // 0 - 11
	}

}
