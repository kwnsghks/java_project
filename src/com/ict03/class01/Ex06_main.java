package com.ict03.class01;

public class Ex06_main {
	public static void main(String[] args) {
		Ex06 t = new Ex06();
		
		String s1 = t.k1();
		System.out.println("�̸� : " + s1);
		
		int s2 = t.k2();
		System.out.println("���� : " + s2);
		
	    double s3 = t.k3();
	    System.out.println("Ű : " + s3);
	    
	    char s4 = t.k4();
	    System.out.println("��ũ "+54);
	    
	    t.m1("��浿");
	    System.out.println("�̸� : " + t.k1());
	    
	    t.m2(37);
	    System.out.println("���� : " + t.k2());
	    
	    t.m3(170.4);
	    System.out.println("Ű : " + t.k3());
	    
	    t.m4('B');
	    System.out.println("��ũ : " + t.k4());
	}
}
