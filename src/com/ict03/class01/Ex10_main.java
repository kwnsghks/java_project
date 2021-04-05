package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int su = scan.nextInt();
		
		// 상품명과 가격(Ex10) 을 가지는 배열
		Ex10[] offer = new Ex10[su];
		for (int i = 0; i < offer.length; i++) {
			System.out.println("1.아메리카노(2500)");
			System.out.println("2.카페모카(3000)");
			System.out.println("3.카페라떼(3500)");
			System.out.println("4.자몽쥬스(3000)");
			System.out.print("선택하세요 >>> ");

			int menu = scan.nextInt();
			Ex10 product = new Ex10();
			if(menu == 1) {
				product.setName("아메리카노");
				product.setPrice(2500);
			}else if(menu == 2) {
				product.setName("카페모카");
				product.setPrice(3000);
			}else if(menu == 3) {
				product.setName("카페라떼");
				product.setPrice(3500);
			}else if(menu == 4) {
				product.setName("자몽쥬스");
				product.setPrice(3000);
			}
			offer[i] = product;
		}
		
		// 전체금액 
		int sum = 0 ;
		for (int i = 0; i < offer.length; i++) {
			sum = sum + offer[i].getPrice();
		}
		System.out.println("총 액 : " + sum);
		System.out.print("입 금 액 : ");
		int input = scan.nextInt();
		System.out.print("잔 돈 : " + (input - sum));
		
	}
}













