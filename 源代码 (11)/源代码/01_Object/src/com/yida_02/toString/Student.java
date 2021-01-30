package com.yida_02.toString;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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

	/*
	//�ֹ���д���Ѹ�������г�Ա����ֵ��ɷ���
	@Override //������ã���ʾ������д����ķ���
	public String toString() {
		return "����:"+name+", ����:"+age;
	}
	*/
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
