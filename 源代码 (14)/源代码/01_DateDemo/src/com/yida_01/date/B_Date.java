/*
 * Date����
 * public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ
 * public void setTime(long time):����ʱ��
 * 
 * ��εõ�һ������ֵ
 * 		(1).ͨ��Date��getTime()��ȡ;
 * 		(2).ͨ��System.currentTimeMillis()��ȡ;
 * 
 * ��һ������ֵת��ΪDate
 * 		(1).ͨ��Date�Ĺ��췽��ת��
 * 		(2).ͨ��Date��setTime(long time)����ת��
 */
package com.yida_01.date;

import java.util.Date;

public class B_Date {

	public static void main(String[] args) {
		// ��ȡ����ֵ
		// public long getTime():��ȡʱ�䣬�Ժ���Ϊ��λ
		Date d = new Date();
		System.out.println(d.getTime());
		System.out.println(System.currentTimeMillis());
		System.out.println("------");

		
		// ��һ������ֵת��ΪDate
		// public void setTime(long time):����ʱ��
		Date d2 = new Date();
		long time = 1000 * 60 * 60;// �����ʾ1Сʱ����Ϊ1Сʱ=60�֣�1��=60�룬1��=1000����
		d2.setTime(time);
		System.out.println("d2:" + d2);// ��������й��ڶ�����������
		
		Date d3 = new Date(time);
		System.out.println("d3:" + d3);// ��������й��ڶ�����������
	}

}
