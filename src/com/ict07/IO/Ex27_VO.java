package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 오버라이드한 메소드 안에 객체 직렬화할 멤버를 넣어준다.
public class Ex27_VO implements Externalizable{

	private String name ;
	private int kor ;
	private int eng ;
	private int math ;
	private int sum ;
	private double avg;
	private String hak;
	
	// 생성자
	public Ex27_VO() {}
	public Ex27_VO(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		sum = kor+eng+math;
		avg = (int)((sum * 3.0*10)/10.0);
	}

	// 직렬화 하는 애 ↓ writeExternal;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// ↓직렬화 대상을 입력해줌. 
		out.writeObject(name);
		out.writeObject(kor);
		out.writeObject(eng);
		out.writeObject(math);
	}

	// 역직렬화 (read)↓ readExternal
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject() ;
		kor = (int)in.readObject();
		eng = (int)in.readObject();
		math = (int)in.readObject();
		
	}
	// getter / setter
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
