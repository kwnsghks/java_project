package com.ict03.class04;

public class Ex08_Cat extends Ex06_Animal{
    
	@Override
	public void sound() {
		System.out.println("�߿�~ �߿�~");
	}

	@Override
	public void eat(String food) {
		System.out.println("����");		
	}

	@Override
	public String play() {
		return "Ĺ Ÿ������ ���ڱ�";
	}
	
}
