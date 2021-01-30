/*
 * DateForamt��
 * 		���Խ����������ַ����Ļ���ת���������԰����ڸ�ʽ�����ַ�����Ҳ���԰��ַ����������ڡ�
 * 
 * 		������
 * 			public final String format(Date date) ����ת���ַ���
 * 			public Date parse(String source) �ַ���ת������
 * 
 * ���������ǳ����࣬����Ӧʹ����������SimpleDateFormat��
 * 
 * SimpleDateFormat��
 * 		���췽����
 * 			SimpleDateFormat():Ĭ��ģʽ
 * 			SimpleDateFormat(String pattern):������ģʽ
 * 			���������ģʽ�ַ��������д��?
 * 			ͨ���鿴API�����Ǿ��ҵ��˶�Ӧ��ģʽ
 * 				�� y
 * 				�� M	
 * 				�� d
 * 				ʱ H (24С����) ʱh (12Сʱ����)
 * 				�� m
 * 				�� s
 * 
 * 			���磺2014��12��12�� 12:12:12 �ɱ�ʾΪ yyyy��MM��dd�� HH:mm:ss
 */
package com.yida_02.simpledateformat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A_DateFormat {

	public static void main(String[] args) throws ParseException {
		// ���ڸ�ʽ�����ַ���
		Date d = new Date();
		DateFormat sdf = new SimpleDateFormat();// Ĭ��ģʽ
		String str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		/*
		 * FULL ������ʾ
		 * LONG ������ʾ
		 * MEDIUM �ж���ʾ
		 * SHORT �����ʾ
		 */
		//getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale) 
        //��ȡ����/ʱ���ʽ�����ø�ʽ�����и������Ի����ĸ�����ʽ�����
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
		str = df.format(d);
		System.out.println(str);
		
		System.out.println("-------");
		
		// ��ʽ����ֻ���꣬�£��յ��ַ���
		sdf = new SimpleDateFormat("yyyy/MM/dd");
		str = sdf.format(new Date());
		System.out.println(str);
		System.out.println("------");
		
		// ��ʽ����ֻ��ʱ���֣�����ַ���
		sdf = new SimpleDateFormat("HH:mm:ss");
		str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		// ��ʽ����ֻ���£��գ�ʱ���ֵ��ַ���
		sdf = new SimpleDateFormat("MM��dd�� HH:mm");
		str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		// ��ʽ����ֻ���꣬�£��գ�ʱ���ֵ��ַ�������ʽ����
		sdf = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��");
		str = sdf.format(d);
		System.out.println(str);
		System.out.println("------");
		
		// �ַ�������Ϊ����
		// ע�⣺��ʽ����͸������ַ�����ʽƥ��
		String strTime = "2018-12-08 12:26:30";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d2 = sdf2.parse(strTime);
		System.out.println(d2);
		System.out.println("------");
		
		// ע�⣺��ʽ����͸������ַ�����ʽƥ��
		strTime = "2016��11��08�� 11ʱ16��";
		sdf2 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��");
		d2 = sdf2.parse(strTime);
		System.out.println(d2);
	}

}
