package com.yida_06;

public class Son extends Father implements SongAndDance {

	public Son(String name) {
		super(name);//���ø���Ĺ��췽��������ʼ����������
	}
	
	@Override
	public void song() {
		System.out.println(getName()+"�����и���-Сƻ��.mp3");
	}

	@Override
	public void dance() { System.out.println(getName()+"������");
	}

	@Override
	public void study() {
		System.out.println(getName()+"ѧϰ�˴ﻥ����JAVA�γ�");
	}

	@Override
	public void play() {
		System.out.println(getName()+"��Լ���Ϸ");
	}

}
