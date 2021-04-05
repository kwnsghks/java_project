package com.ict03.class02;

import java.util.Scanner;

public class Ex04 {
	// 컴퓨터와 가위, 바위, 보 게임하기 
	// 컴퓨터는 랜덤으로 가위(0),바위(1),보(2)를 갖는다.
	// 사용자가 가위,바위,보를 선택해서 컴퓨터와 게임을 한다.
	
	/* 월요일까지 숙제
	각자 3자리[1]의 숫자를 임의로 정한 뒤, 
	서로에게 3자리의 숫자를 불러서 결과를 확인한다. 
	그리고 그 결과를 토대로 상대가 적은 숫자를 예상한 뒤 맞힌다.
	* 사용되는 숫자는 0에서 9까지 서로 다른 숫자이다. 
	* 숫자는 맞지만 위치가 틀렸을 때는 볼.
	* 숫자와 위치가 전부 맞으면 스트라이크.
	* 숫자와 위치가 전부 틀리면 아웃.

	종료조건 : 9번까지
	           3아웃
	*/
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalcount = 0 ;
		int vcnt = 0 ;
		
		esc:
		while (true) {
			totalcount++;
			// 컴퓨터
			int computer = (int)(Math.random()*3); // 0,1,2
			System.out.print("1.가위, 2.바위, 3.보  >> ");
			int user = scan.nextInt();
			if (computer == 0) {
				if(user == 1) {
					System.out.println("비김");
				}else if(user == 2) {
					vcnt++;
					System.out.println("이김");
				}else if(user == 3) {
					System.out.println("짐");
				}
			}else if(computer == 1) {  // 바위
				if(user == 1) {
					System.out.println("짐");
				}else if(user == 2) {
					System.out.println("비김");
				}else if(user == 3) {
					vcnt++;
					System.out.println("이김");
				}
			}else if(computer ==2) {  //보
				if(user == 1) {
					vcnt++;
					System.out.println("이김");
				}else if(user == 2) {
					System.out.println("짐");
				}else if(user == 3) {
					System.out.println("비김");
				}
			}
			while(true) {
				System.out.print("계속할까요?(y/n) >> ");
				String msg = scan.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue ;
				}
			}
		}
		System.out.println("수고하셨습니다.");
		System.out.println("당신의 도전횟수:"+totalcount + ", 승률:"+(vcnt*1.0/totalcount)*100+"%" );
	}
}

















