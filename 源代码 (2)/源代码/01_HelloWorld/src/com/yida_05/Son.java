package com.yida_05;

public class Son implements Father {
	private String name;
	
	public Son(String name) {
		this.name = name;
	}

	@Override
	public void song() {
		System.out.println(name+"�����и���-Сƻ��.mp3");
	}

	@Override
	public void dance() {
		System.out.println(name+"������");
	}

}
