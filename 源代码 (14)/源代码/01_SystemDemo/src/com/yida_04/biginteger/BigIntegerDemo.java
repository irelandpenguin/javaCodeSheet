/*
 * BigInteger:�����ó���Integer��Χ�ڵ����ݽ�������
 * 
 * ���췽����
 * BigInteger(String val) 
 * 
 * ������
 * public BigInteger add(BigInteger val):��
 * public BigInteger subtract(BigInteger val):��
 * public BigInteger multiply(BigInteger val):��
 * public BigInteger divide(BigInteger val):��
 * public BigInteger[] divideAndRemainder(BigInteger val):�����̺�����������
 * public BigInteger max(BigInteger val):���ֵ
 * public BigInteger min(BigInteger val):��Сֵ
 */
package com.yida_04.biginteger;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		// �⼸�����ԣ���Ϊ�˼򵥳���int��Χ�ڣ�Integer�Ͳ����ٱ�ʾ�����Ծ͸�̸���ϼ����ˡ�
		Integer i = new Integer(100);
		System.out.println(i);
		System.out.println(Integer.MAX_VALUE);// ���͵����Χֵ
		Integer i2 = new Integer("2147483647"); 
		System.out.println(i2);
		//Integer i3 = new Integer("2147483648");// ���� NumberFormatException
		//System.out.println(i3);

		System.out.println("------");
		
		// ��������ͨ������������������
		BigInteger bi = new BigInteger("214748364821474836482147483648214748364821474836482147483648");// ������
		System.out.println("bi:" + bi);

		System.out.println("------");
		
		// public BigInteger add(BigInteger val) ������ ���
		BigInteger b1 = new BigInteger("1000000000000000000000000");
		BigInteger b2 = new BigInteger("2000000000000000000000001");
		BigInteger result = b1.add(b2);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger subtract(BigInteger val) ������ ���
		result = b1.subtract(b2);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger multiply(BigInteger val) ������ ���
		result = b1.multiply(b2);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger divide(BigInteger val) ������ ������õ�������
		result = b2.divide(b1);
		System.out.println("result:" + result);
		System.out.println("------");
		
		// public BigInteger[] divideAndRemainder(BigInteger val)������
		// ����������̺�����������
		BigInteger[] arr = b2.divideAndRemainder(b1);
		System.out.println("��:" + arr[0] + "������:" + arr[1]);
		
		// public BigInteger max(BigInteger val):���ֵ
		result = b1.max(b2);
		System.out.println("���ֵΪ" + result);
		
		// public BigInteger min(BigInteger val):��Сֵ
		result = b1.min(b2);
		System.out.println("��СֵΪ" + result);
	}

}
