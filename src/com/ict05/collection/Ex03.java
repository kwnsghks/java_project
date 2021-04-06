package com.ict05.collection;

// VO(ValueObject) : �����͸� �����ϰ�� ��ü�� ����.
public class Ex03 {
	private String name ;
	private int price ;
	
	public Ex03() {}
	// ������ ����� => �ҽ� �޴� - ���ʷ���Ʈ ����Ʈ���� ��¡ �ʵ�
	//                  getter�� ����ϸ� ������ �� ���� ���� �� �ִ�.
	//                 (private ���� ���ϰ� setter ������ ������ �ȵ�. �������⸸ ����)
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
