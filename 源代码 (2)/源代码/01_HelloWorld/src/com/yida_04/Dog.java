package com.yida_04;

public class Dog extends Animal {
	
	public Dog(){}
	public Dog(String name) {
		super(name);//���ø���Ĵ��ι��죬��ʼ����������
	}

	@Override //@override��ʾ��д(���߸���)
	public void eat() {
		System.out.println(getName()+"�Թ�ͷ");
	}

	@Override
	public void sleep() {
		System.out.println(getName()+"ſ��˯");
	}

}
