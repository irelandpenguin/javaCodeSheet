package com.yida_03;

public class Person {
	private String name;
	private int age;
	
	//�޲ι���
	public Person() {}
	//���ι���
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//get��set����
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	//��Ա����
	public void show() {
		System.out.println(name+"---"+age);
	}
}
