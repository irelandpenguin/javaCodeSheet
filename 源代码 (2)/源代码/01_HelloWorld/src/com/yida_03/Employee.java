package com.yida_03;

public class Employee extends Person {
	private int number;//Ա����
	
	//�޲ι���
	public Employee(){}
	//���ι���
	public Employee(String name, int age, int number) {
		super(name,age);//���ø�����ι��죬��ʼ����������(���Ǹ����name��age)
		this.number = number;
	}
	
	//get��set����
	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	//��Ա����
	public void show() {//������д������
		//super.show();//��ӡ����������
		//System.out.println(number);//��ӡԱ����
		
		System.out.println(getName()+"---"+getAge()+"---"+number);
	}
}
