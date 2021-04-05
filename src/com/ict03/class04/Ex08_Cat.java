package com.ict03.class04;

public class Ex08_Cat extends Ex06_Animal{
    
	@Override
	public void sound() {
		System.out.println("具克~ 具克~");
	}

	@Override
	public void eat(String food) {
		System.out.println("积急");		
	}

	@Override
	public String play() {
		return "墓 鸥况俊辑 泪磊扁";
	}
	
}
