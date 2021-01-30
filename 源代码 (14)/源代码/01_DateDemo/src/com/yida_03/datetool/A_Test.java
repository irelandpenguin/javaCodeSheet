/*
 * �ڵ�ǰ���������MyDateFormat����������ַ���ת��������
 * 
 * 
 * �������������ڱ�Ĺ�����ʹ��DateTool�࣬��ô���أ�
 * 		(1) ����jar�������裺ѡ��DateTool.javaȻ�󵥻��Ҽ�ѡ��Export���ڵ�������ѡ��
 * 			JAR file��Ȼ������һ����������ѡ��jar�Ĵ��·�������Finish��
 * 		(2) ����doc˵���ĵ������裺ѡ��DateTool.javaȻ�󵥻��Ҽ�ѡ��Export���ڵ�������ѡ��
 * 			javadoc��Ȼ������һ����������ѡ��˵���ĵ��Ĵ��·�������Finish��
 * 		(3) ������������jar����Ȼ��ճ������Ĺ�����,��ѡ��Build Path -> Add to Build Path��
 * 		(4) �������Ϳ���ֱ��ʹ��DateTool����ķ����ˡ�
 */
package com.yida_03.datetool;

import java.text.ParseException;
import java.util.Date;

public class A_Test {

	public static void main(String[] args) throws ParseException {	
		// ����ת�ַ���
		Date d = new Date();
		String strDate = DateTool.dateToString(d, "yyyy-MM-dd HHʱmm��ss��");
		System.out.println(strDate);
		System.out.println("------");
		
		strDate = DateTool.dateToString(d, "yyyy��MM��dd��");
		System.out.println(strDate);
		System.out.println("------");
		
		strDate = DateTool.dateToString(d, "HH:mm:ss");
		System.out.println(strDate);
		System.out.println("------");
		
		// �ַ���ת����
		String str = "2008��08��06�� 12:06:30";
		Date d2 = DateTool.stringToDate(str, "yyyy��MM��dd�� HH:mm:ss");
		System.out.println(d2);
		System.out.println("------");
		
		str = "2008-08-06";
		d2 = DateTool.stringToDate(str, "yyyy-MM-dd");
		System.out.println(d2);
		System.out.println("------");
		
		str = "12ʱ06��30��";
		d2 = DateTool.stringToDate(str, "HHʱmm��ss��");
		System.out.println(d2);
		System.out.println("------");
	}

}
