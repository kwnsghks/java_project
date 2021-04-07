package com.ict06.Thread;
// 자바 프로그래밍 책 674p
import java.util.*;

public class Ex17_Car {
	// 컬렉션 : 자동차들을 저장하는 저장공간(창고)
	private List<String> carList = null;
	
	// 생성자 : 해당 클래스가 객체로 생성되면 carList를 생성한다.
	public Ex17_Car() {
		carList = new ArrayList<String>();  // 생성자가 만들어지면서 위의 carList가 완성됨.
	}
	
	// 랜덤으로 자동차 생산
	public String getCar() {
		String carName = null;
		switch ((int)(Math.random()*3)) {
		case 0 : carName ="SM5"; break;
		case 1 : carName ="SM6"; break;
		case 2 : carName ="SM7"; break;
		}
		return carName;
	}
	// 소비자가 자동차를 사는 메소드
	public synchronized String pop() {
		String carName = null;
		// 재고가 없으면 
		if(carList.size() == 0) {
			System.out.println("차가 없네요. 생성할 때까지 기다려주세요.");
			try {
				System.out.println("차가 없어요 생산할 때까지"+"기다리세요.");
				this.wait();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	// 재고가 있을 때는 carList에서 가장 나중에 들어간 차를 판매(삭제)
		carName = (String)carList.remove(carList.size()-1);
		System.out.println("손님이 차를 사갔습니다."+"손님이 구입하신 차량의 이름은 =>\" "+ carName + "\"");
		return carName;
	}
	// 자동차를 carList에 넣기
	// 창고에 자동차가 5대 되면 소비자들에게 판매를 시작한다.
	public synchronized void push(String car) {
		carList.add(car);
		System.out.println("(자동차가 만들어져 창고에 보관)차가 만들어졌습니다."+"차 이름은\""+ car + "\"");
		if(carList.size()==5) {
			// 재고가 0일때 대기시킨 스레드를 준비상태로 변경시킨다.
			this.notify();
		}
	}
}
