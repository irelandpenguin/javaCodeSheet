/*
 * Integer�Ĺ��췽����
 * public Integer(int value)
 * public Integer(String s)
 * 		ע�⣺����ַ����������������ַ���ɣ�
 * 
 * 
 *  int���ͺ�String���͵��໥ת��
 *  int --> String
 * 		String.valueOf(num) //�Ƽ�
 * 		Integer.toString(num) //�Ƽ�
 * 
 * String --> int
 * 		Integer.parseInt(s) //�Ƽ�
 */
package com.yida_01;

public class B_Integer {
	public static void main(String[] args) {
		// ��ʽһ��
		Integer i = new Integer(100);
		System.out.println("i:" + i);

		// ��ʽ����
		Integer ii = new Integer("100");
		//Integer ii = new Integer("ab");//����NumberFormatException
		System.out.println("ii:" + ii);
		
		System.out.println("------");

		// int -> String
		// ��ʽ1��
		String s1 = "" + 100;
		System.out.println("s1:" + s1);
		System.out.println("--------");
		
		// ��ʽ2��
		String s2 = String.valueOf(100);//�Ƽ�ʹ��
		System.out.println("s2:" + s2);
		System.out.println("--------");
		
		// ��ʽ3��
		Integer it = new Integer(100);
		String s3 = it.toString();
		System.out.println("s3:" + s3);
		System.out.println("-------");

		// ��ʽ4��
		String s4 = Integer.toString(100);//�Ƽ�ʹ��
		System.out.println("s4:" + s4);
		System.out.println("-------");
	
		// ------------------------------

		// String -> int
		// ��ʽ1��
		String str = "100";
		Integer it2 = new Integer(str);
		int num = it2.intValue();
		System.out.println("num:" + num);
		System.out.println("-------");

		// ��ʽ����
		int num2 = Integer.parseInt(str);//�Ƽ�ʹ��
		System.out.println("num2:" + num2);
	}
}
