/*
 * Date:��ʾ�ض���˲�䣬��ȷ�����롣 
 * 
 * ���췽����
 * 		Date():���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���ע�⣺�����Ĭ�Ϻ���ֵ��ָ��ǰϵͳʱ��ĺ���ֵ
 * 		Date(long date)�����ݸ����ĺ���ֵ�������ڶ���
 */
package com.yida_01.date;

import java.util.Date;

public class A_Date {

	public static void main(String[] args) {
		// Date():���ݵ�ǰ��Ĭ�Ϻ���ֵ�������ڶ���
		Date d = new Date();
		System.out.println("d1:" + d);
		System.out.println("------");
		
		// Date(long date)�����ݸ����ĺ���ֵ�������ڶ���
		Date d2 = new Date(0);// ��׼��׼ʱ�䣬 �� 1970 �� 1 �� 1 �� 00:00:00GMT
		System.out.println("d2:" + d2);// ��Ϊ�й��ڶ��������������������ʱ�����㣬Ӧ�ȱ�׼��׼ʱ����Сʱ
		System.out.println("------");
		
		long time = System.currentTimeMillis();// ��ȡ��ǰϵͳʱ��(����)
		Date d3 = new Date(time);
		System.out.println("d3:" + d3);
		System.out.println("------");
		
		//long time2 = 1000 * 60 * 60;// �����ʾ1Сʱ����Ϊ1Сʱ=60�֣�1��=60�룬1��=1000����
		//long time2 = 1000 * 60;// �����ʾ1��
		long time2 = 1000;// �����ʾ1��
		Date d4 = new Date(time2);
		System.out.println("d4:" + d4);
	}

}
