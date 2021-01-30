package com.yida_01.datetool;

import java.text.ParseException;
import java.util.Date;

import com.yida_03.datetool.DateTool;

/*
 * ����jar��������jar����Ȼ��ճ������ǰ������,��ѡ��Build Path -> Add to Build Path��
 * 
 * ʹ��MyDateFormat����������ַ���ת��������
 */
public class Test {

	public static void main(String[] args) throws ParseException {
		// ����ת�ַ���
		Date d = new Date();
		String strDate = DateTool.dateToString(d, "yyyy��MM��dd�� HHʱmm��ss��");
		System.out.println(strDate);
		System.out.println("------");

		// �ַ���ת����
		String str = "2012��08��12�� 17:30";
		Date d2 = DateTool.stringToDate(str, "yyyy��MM��dd�� HH:mm");
		System.out.println(d2);
	}

}
