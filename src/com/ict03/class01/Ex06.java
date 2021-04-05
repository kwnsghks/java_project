package com.ict03.class01;

public class Ex06 {
	private String name = "홍길동";
	private int age = 24 ;
	private double height = 180.3 ;
    private char rank = 'A';
    
    // private 변수에 접근하기 위해서는 메소드를 사용해야 된다.
    // getter()
     public String k1() {
    	return name;
    }
    public int k2() {
    	return age ;
    }
    public double k3() {
    	return height;
    }
    public char k4() {
    	return rank ;
    }
    // 변수에 접근해서 해당 변수의 데이터를 변경할때 사용
    // setter
    public void m1(String t1) {
    	name = t1 ;
    }
    public void m2(int t1) {
    	age = t1;
    }
    public void m3(double t1) {
    	height = t1;
    }
    public void m4(char t1) {
    	rank = t1;
    }
}














