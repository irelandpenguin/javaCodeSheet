/*
 * ������д�����
 * 	�����������Ĳ�һ������Ϊfloat���͵����ݴ洢�����Ͳ�һ�����µġ� ���Ǵ󲿷ֵ�ʱ�򣬶��Ǵ�����Ч����λ��
 * 
 * �����������ʱ��float���ͺ�double�����׶�ʧ���ȡ�
 * ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
 * 
 * BigDecimal�ࣺ
 * 		���ɱ�ġ����⾫�ȵ��з���ʮ�����������Խ�����ݶ�ʧ���⡣
 * 
 * 
 * ���췽����
 * 		public BigDecimal(String val)
 * 
 * ������
 * 		public BigDecimal add(BigDecimal augend)
 * 		public BigDecimal subtract(BigDecimal subtrahend)
 * 		public BigDecimal multiply(BigDecimal multiplicand)
 *		public BigDecimal divide(BigDecimal divisor)
 * 		public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):�̣�������λС�������ȡ��
 */
package com.yida_05.bigdecimal;

import java.math.BigDecimal;

public class BigDecimalDemo {

	public static void main(String[] args) {
		//������д�����
		System.out.println(0.09 + 0.01);// ����Ϊ��0.10������Ϊ0.09999999999999999
		System.out.println(1.0 - 0.32);// ����Ϊ��0.68������Ϊ0.6799999999999999
		System.out.println(1.015 * 100);// ����Ϊ101.5������Ϊ101.49999999999999
		System.out.println(1.301 / 100);// ����Ϊ0.01301������Ϊ0.013009999999999999
		
		
		System.out.println(1.0 - 0.12);// ����Ϊ0.88������Ϊ0.88

		System.out.println("------");
		
		// ����BigDecimal����
		resolve("0.09", "0.01", "+");
		resolve("1.0", "0.32", "-");
		resolve("1.015", "100", "*");
		resolve("1.301", "100", "/");
		resolve("999999999999999999999999.09", "33333333333333333333333333333333.01", "+");

		System.out.println("------");
		
		/*
		 * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode) 
		 * ������divisor �̣� scale ������λС���� roundingMode ���ȡ�ᣬĬ�϶���BigDecimal.ROUND_HALF_UP
		 */
		resolve("1.351", "100", "/");
		BigDecimal bd1 = new BigDecimal("1.351");
		BigDecimal bd2 = new BigDecimal("100");
		System.out.println("divide:"+ bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP));//�����ڡ��������롱
		System.out.println("divide:"+ bd1.divide(bd2, 8, BigDecimal.ROUND_HALF_UP));
		
	}

	// �����ݴ�����������
	public static void resolve(String s1, String s2, String flag) {
		BigDecimal bd1 = new BigDecimal(s1);
		BigDecimal bd2 = new BigDecimal(s2);
		BigDecimal result = null;

		if (flag.equals("+")) {
			result = bd1.add(bd2);
		} else if (flag.equals("-")) {
			result = bd1.subtract(bd2);
		} else if (flag.equals("*")) {
			result = bd1.multiply(bd2);
		} else if (flag.equals("/")) {
			result = bd1.divide(bd2);
		}

		if (result != null) {
			System.out.println("result:" + result);
		}
	}

}
