/*
 * ����1����Ҫ���Ұ�100������ݵĶ����ƣ��˽��ƣ�ʮ�����Ƽ������
 * ����2����Ҫ�����ж�һ�������Ƿ���int��Χ�ڵġ�
 * 		������Ҫ֪��int�ķ�Χ�Ƕ��?
 * 
 * Ϊ�˶Ի����������ͽ��и�����Ĳ�����Java�����ÿһ�ֻ������������ṩ�˶�Ӧ�������͡�
 * byte 			Byte
 * short			Short
 * int				Integer
 * long				Long
 * float			Float
 * double			Double
 * char				Character
 * boolean			Boolean
 * 
 * �ṩ��Щ���Ŀ�ľ������ڻ��������������ַ���֮���ת����
 * 
 * ����������ʮ���Ƶ�ת��
 * 		���Ƶķ�Χ��2-36����ʮ���ƿ�ת��2-36֮���������ơ�ͬ��2-36֮����������Ҳ��ת��ʮ���ơ�
 */
package com.yida_01;

public class A_Integer {

	public static void main(String[] args) {
		// ��ӡ100�Ķ�����
		System.out.println("100�Ķ�����Ϊ" + Integer.toBinaryString(100));
		
		// ��ӡ100�İ˽���
		System.out.println("100�İ˽���Ϊ" + Integer.toOctalString(100));
		
		// ��ӡ100��ʮ������
		System.out.println("100��ʮ������Ϊ" + Integer.toHexString(100));
		
		// ��ӡint����Сֵ�����ȡֵ��Χ
		System.out.println("int��ȡֵ��Χ" + Integer.MIN_VALUE + "~"
				+ Integer.MAX_VALUE);
		System.out.println("------");
		
		// ʮ���Ƶ���������
		// public static String toString(int i,int radix)
		String str = Integer.toString(100, 5);// ʮ����100ת�������
		System.out.println("ʮ����100ת�����Ϊ" + str);
		System.out.println("------");
		
		// �������Ƶ�ʮ����
		// public static int parseInt(String s,int radix)
		int num = Integer.parseInt(str, 5);// �����תʮ����
		System.out.println("�����" + str + "תʮ����Ϊ" + num);

		// ���Ƶķ�Χ��2-36����ʮ���ƿ�ת��2-36֮���������ơ�ͬ��2-36֮����������Ҳ��ת��ʮ���ơ�
		 
		System.out.println("------");
		int num2 = 1000;
		System.out.println(Integer.toString(num2));
		
	}

}
