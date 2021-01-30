/*
 * ��һ��������������������?
 * 
 * ������
 * 		A:����¼����ĳ�����������
 * 		B:�Ѹ��ַ���ת��Ϊһ������
 * 		C:ͨ�������ڵõ�һ������ֵ
 * 		D:��ȡ��ǰʱ��ĺ���ֵ
 * 		E:��D-C�õ�һ������ֵ
 * 		F:��E�ĺ���ֵת��Ϊ��
 * 			/1000/60/60/24
 */
package com.yida_03.datetool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class B_Test {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳ����꣬�£���(���磺2008.12.08)");
		String str = sc.nextLine();
		long day = days(str, "yyyy.MM.dd");
		System.out.println("�������������" + day + "����");
	}

	public static long days(String strDate, String format)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		long originTimer = date.getTime();// �������ڶ�Ӧ��ʱ��(����)
		long currentTimer = System.currentTimeMillis();// ��ǰϵͳʱ��(����)
		long existTimer = currentTimer - originTimer;// �Ѵ��ڵ�ʱ��(����)
		long num = existTimer/1000/60/60/24;// ��ȡ����
		return num;
	}

}
