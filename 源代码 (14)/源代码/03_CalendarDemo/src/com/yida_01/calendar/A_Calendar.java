/*
 * Calendar:��Ϊ�ض�˲����һ������ YEAR��MONTH��DAY_OF_MONTH��HOUR �������ֶ�֮���ת���ṩ��һЩ������
 * ��Ϊ���������ֶΣ������������ڵ����ڣ��ṩ��һЩ������
 * 
 * public int get(int field):���ظ��������ֶε�ֵ��
 * �������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա������������int���͡�
 */
package com.yida_01.calendar;

import java.util.Calendar;

public class A_Calendar {

	public static void main(String[] args) {
		Calendar rightNow = Calendar.getInstance();// ����������������ֶ����ɵ�ǰ���ں�ʱ���ʼ��
		int year = rightNow.get(Calendar.YEAR);// ��ȡ��
		int month = rightNow.get(Calendar.MONTH);// ��ȡ��(ע�⣺�·ݱ�ʵ���·���1)
		int date = rightNow.get(Calendar.DAY_OF_MONTH);// ��ȡ��
		System.out.println(year + "��" + (month + 1) + "��" + date + "��");
		System.out.println("------");
		
		int hour = rightNow.get(Calendar.HOUR);// ��ȡСʱ
		int minute = rightNow.get(Calendar.MINUTE);// ��ȡ����
		int second = rightNow.get(Calendar.SECOND);// ��ȡ��
		System.out.println(hour + "ʱ" + minute + "��" + second + "��");
	}

}
