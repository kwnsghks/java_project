package com.ict02.array;

public class Ex05 {
	public static void main(String[] args) {
		String[] name = {"홍","임","장","박","이"};
		int[] kor = {80,90,80,70,100};
		int[] eng = {80,95,85,75,100};
		int[] math = {100,100,80,100,100};
		int[] rank = {1,1,1,1,1};
		
		// 총점, 평균, 학점
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		for (int i = 0; i < hak.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i]/3.0*10)/10.0;
			if(avg[i]>=90) {
				hak[i] = "A";
			}else if(avg[i]>=80) {
				hak[i] = "B";
			}else if(avg[i]>=70) {
				hak[i] = "C";
			}else {
				hak[i] = "F";
			}
		}
		
		// 순위를 구하자 
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력(자바이스케이프 문자 : \t(탭), \n(줄바꾸기))
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
		
	}
}








