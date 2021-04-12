package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			URL url = new URL("https://www.naver.com/");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			System.out.println("���ڵ� : " + conn.getContentEncoding());
			System.out.println("���� : " + conn.getContentLength());
			System.out.println("���� Ÿ�� : " + conn.getContentType());
			System.out.println("=====================");
			// ������ �����ϴ� ������Ʈ�� HTTP ����� �ٵ�� ��������.
			// ����� HTTP �ٵ� �� ��û/���信 ���� ������ �����ϰ� �ִ�.
			// ��������� �̿��ؼ� �� ����̴��� �ؼ��ϰ� �����Ѵ�.
			// �ٵ�� html �ڵ�, �̹���, css, �ڹٽ�ũ��Ʈ
			
			Map<String, List<String>> list = conn.getHeaderFields();
			for (String k : list.keySet()) {
				System.out.println(list.get(k));
			}
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (Exception e) {
			}
		}
	}
}
