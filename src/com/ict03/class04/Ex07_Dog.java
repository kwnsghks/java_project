package com.ict03.class04;

public class Ex07_Dog extends Ex06_Animal{

	@Override
	public void sound() {
		System.out.println("¸Û~~¸Û~~~");
	}

	@Override
	public void eat(String food) {
		System.out.println("°³ »ç·á");
	}

	@Override
	public String play() {
		return "¾Õ ¸¶´ç¿¡¼­ ³î±â";
	}
	

}
