package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�ο��� : ");
		int su = scan.nextInt();
		
		// ��ǰ��� ����(Ex10) �� ������ �迭
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.�Ƹ޸�ī��(2500)");
			System.out.println("2.ī���ī(3000)");
			System.out.println("3.ī���(3500)");
			System.out.println("4.�ڸ��꽺(3000)");
			System.out.print("�����ϼ��� >>> ");

			int menu = scan.nextInt();
			Ex10 product = new Ex10();
			if(menu == 1) {
				product.setName("�Ƹ޸�ī��");
				product.setPrice(2500);
			}else if(menu == 2) {
				product.setName("ī���ī");
				product.setPrice(3000);
			}else if(menu == 3) {
				product.setName("ī���");
				product.setPrice(3500);
			}else if(menu == 4) {
				product.setName("�ڸ��꽺");
				product.setPrice(3000);
			}
			offer[i] = product;
		}
		
		// ��ü�ݾ� 
		int sum = 0 ;
		for (int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
		}
		System.out.println("�� �� : " + sum);
		System.out.print("�� �� �� : ");
		int input = scan.nextInt();
		System.out.print("�� �� : " + (input - sum));
		
	}
}













