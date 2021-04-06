package com.ict05.collection;

// VO(ValueObject) : 데이터를 저장하고는 객체를 뜻함.
public class Ex03 {
	private String name ;
	private int price ;
	
	public Ex03() {}
	// 생성자 만들기 => 소스 메뉴 - 제너레이트 컨스트럭터 유징 필드
	//                  getter만 사용하면 수정할 수 없게 만들 수 있다.
	//                 (private 접근 못하고 setter 없으면 수정이 안됨. 가져오기만 가능)
	public Ex03(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
