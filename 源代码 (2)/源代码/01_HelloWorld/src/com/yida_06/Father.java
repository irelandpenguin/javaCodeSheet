package com.yida_06;
/**
 * ����
 * @author Administrator
 *
 */
public abstract class Father {
	private String name;
	
	public Father(String name) {
		this.name = name;
	}
	
	//get��set����
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public abstract void study();//ѧϰ
	public abstract void play();//��
}
