package com.ict12.after;

public class Ex11 {
	public static void main(String[] args) {
		// ��ø while : while�� �ȿ� while��
		
		// ������-1
		int i = 2;
		while(i<10) {
			System.out.println(i+"��");
			int j = 1;
			while(j<10) {
				System.out.println(i+"x"+j+"="+(i*j)+" ");
				j++;
			}
			i++;
		}System.out.println();
		
		// ������-2
		int i2 = 2;
		while(i2<10) {
			System.out.println(i2+"��");
			int j2 = 1;
			while(j2<10) {
				System.out.print(i2+"x"+j2+"="+(i2*j2)+" ");
				j2++;
			}
			System.out.println();
			i2++;
		}System.out.println();
		
		// ������-3
		int i3 = 2;
		while(i3<10) {
			int j3 = 1;
			while(j3<10) {
				System.out.print(j3+"x"+i3+"="+(i3*j3)+" ");
				j3++;
			}
			System.out.println();
			i3++;
		}
	}
}
