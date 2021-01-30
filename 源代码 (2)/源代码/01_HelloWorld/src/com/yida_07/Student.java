package com.yida_07;

public class Student {
	private String name;
	private int age;
	private char sex;

	// �޲ι��췽�� �ڴ��������Ҽ�--source--Generate Constructors from Superclass
	// ���ι��췽�� �ڴ��������Ҽ�--source--Generate Constructors using fields..
	// ʹ�ÿ���Զ����ɹ��췽��(���Σ��޲ζ�����) alt+shift+s
	public Student() {
		super();
	}

	public Student(String name, int age, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	//�ڴ��������Ҽ�--source--Generate Getters and Setters...
	// ʹ�ÿ���Զ�����get��set������alt+shift+s
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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
