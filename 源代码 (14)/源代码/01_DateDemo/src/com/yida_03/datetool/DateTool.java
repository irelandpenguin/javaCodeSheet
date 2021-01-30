/**
 * �������ں��ַ����໥ת���Ĺ�����
 * 
 * @author Ǯ��ʦ
 * @version V1.0
 */
package com.yida_03.datetool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
	// ˽�й��죬��ֹ��紴������
	private DateTool() {
	}

	/**
	 * ����ת���ַ���
	 * 
	 * @param date
	 *            Ҫת��������
	 * @param format
	 *            ת���ĸ�ʽ
	 * @return ����ת����������ַ���
	 */
	public static String dateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * �ַ���ת��������
	 * 
	 * @param strDate
	 *            Ҫת�����ַ���
	 * @param format
	 *            ת���ĸ�ʽ��ע�⣺��ʽһ��Ҫ���ַ�����ʽƥ�䣡
	 * @return ����ת���������
	 * @throws ParseException 
	 */
	public static Date stringToDate(String strDate, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(strDate);
	}
}
