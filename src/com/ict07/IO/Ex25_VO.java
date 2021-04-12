package com.ict07.IO;

import java.io.Serializable;

public class Ex25_VO implements Serializable{
	private String name ;
	transient int kor;
	transient int eng;
	transient int math;
	private int sum;
	private double avg;
	private String hak;
	
	public Ex25_VO() {}
	public Ex25_VO(String name, int kor, int eng, int math) {
		// ↓ constructor using field - 이름, 점수만 받기 때문에 select all 할 필요 없음.
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		sum = kor + eng + math;
		avg = (int)(sum/3.0*10)/10.0;
		if(avg >= 90) {
			hak = "A학점";
		}else if (avg >= 80) {
			hak = "B학점";
		}else if (avg >= 70) {
			hak = "C학점";
		}else {
			hak = "F학점";
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}

	
	
}
