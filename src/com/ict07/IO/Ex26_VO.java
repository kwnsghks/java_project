package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// �������̵��� �޼ҵ� �ȿ� ��ü ����ȭ�� ����� �־��ش�.
public class Ex26_VO implements Externalizable{

	private String name ;
	private int age ;
	private double weight ;
	private boolean gender ;


	
	// ������
	public Ex26_VO() {}
	
	public Ex26_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	// ����ȭ �ϴ� �� �� writeExterna;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// ������ȭ ����� �Է�����. 
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weight);
		out.writeObject(gender);
	}

	// ������ȭ (read)�� readExternal
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject() ;
		age = (int)in.readObject();
		weight = (double)in.readObject();
		gender = (boolean)in.readObject();
		
	}
	// getter / setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
}
