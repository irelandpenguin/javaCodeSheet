package com.yida_04;

public class Cat extends Animal {

	public Cat(){}
	public Cat(String name) {
		super(name);//���ø���Ĵ��ι��죬��ʼ����������
	}
	
	@Override
	public void eat() {
		System.out.println(getName()+"����");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"����˯");
	}

}
