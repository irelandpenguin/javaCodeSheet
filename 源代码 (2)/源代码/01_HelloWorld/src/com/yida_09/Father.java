package com.yida_09;

/**
 * ����
 * 
 * @author �˴ﻥ��-Mr Qain
 * @version V1.1
 */
public abstract class Father {
	private String name;

	/**
	 * ���ι���
	 * 
	 * @param name
	 *            ����
	 */
	public Father(String name) {
		this.name = name;
	}

	/**
	 * ��������
	 * 
	 * @param name
	 *            ����
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * ��������
	 */
	public String getName() {
		return name;
	}

	/**
	 * ѧϰ
	 */
	public abstract void study();// ѧϰ

	/**
	 * ��
	 */
	public abstract void play();// ��
}
