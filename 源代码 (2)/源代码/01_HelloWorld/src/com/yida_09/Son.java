package com.yida_09;

/**
 * 
 * @author �˴ﻥ��-Mr Qain
 * @version V1.1
 * 
 */
public class Son extends Father implements SongAndDance {

	/**
	 * ���ι���
	 * 
	 * @param name
	 *            ����
	 */
	public Son(String name) {
		super(name);// ���ø���Ĺ��췽��������ʼ����������
	}

	/**
	 * ʵ���˽ӿ�SongAndDance�ĳ��跽��
	 */
	@Override
	public void song() {
		System.out.println(getName() + "�����и���-Сƻ��.mp3");
	}

	/**
	 * ʵ���˽ӿ�SongAndDance�����跽��
	 */
	@Override
	public void dance() {
		System.out.println(getName() + "������");
	}

	/**
	 * ��д�˸���Father��ѧϰ����
	 */
	@Override
	public void study() {
		System.out.println(getName() + "ѧϰ�˴ﻥ����JAVA�γ�");
	}

	/**
	 * ��д�˸���Father���淽��
	 */
	@Override
	public void play() {
		System.out.println(getName() + "��Լ���Ϸ");
	}

}
