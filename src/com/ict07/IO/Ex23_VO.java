package com.ict07.IO;

import java.io.Serializable;

// ��ü ����ȭ�� ������ȭ�� �ϱ� ���� Serializable �̳� Externalizable�� ��ӹ޾ƾ� �Ѵ�.
// Serializable ��ӹ����� �ش� Ŭ������ ��ü�� ���鶧 ������ �ִ� ��� ������� ����ȭ ����̴�.
// ��, ���� �տ� transient ���� ����ϸ� ����ȭ ��󿡼� ���� �ȴ�.
//     ���ܵ� ������ �����ʹ� �⺻���� ���´�. (int�� 0, double�� 0.0, boolean�� false)

public class Ex23_VO implements Serializable{
	private String name ;
	private int age ;
	transient double weight ;
	transient boolean gender ;

	public Ex23_VO() {}

	public Ex23_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

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
