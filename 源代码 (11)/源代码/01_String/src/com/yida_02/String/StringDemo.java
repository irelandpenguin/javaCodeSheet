/*
 * �ַ����������ɶ���ַ���ɵ�һ�����ݡ�Ҳ���Կ�����һ���ַ����顣
 * ͨ���鿴API�����ǿ���֪��
 * 		A:�ַ�������ֵ"abc"Ҳ���Կ�����һ���ַ�������
 * 		B:�ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı䡣
 * 
 * ���췽����
 * 		public String():�չ���
 *		public String(byte[] bytes):���ֽ�����ת���ַ���
 *		public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
 *		public String(char[] value):���ַ�����ת���ַ���
 *		public String(char[] value,int index,int count):���ַ������һ����ת���ַ���
 *		public String(String original):���ַ�������ֵת���ַ���
 *
 * �ַ����ķ�����
 * 		public int length()�����ش��ַ����ĳ��ȡ�
 * 
 * �ַ������ص㣺һ������ֵ���Ͳ��ܸı䡣
 */
package com.yida_02.String;

public class StringDemo {
	
	public static void main(String[] args) {
		// public String():�չ���
		String s1 = new String();
		System.out.println("s1=" + s1);
		System.out.println("length=" + s1.length());
		System.out.println("----------");

		// public String(byte[] bytes):���ֽ�����ת���ַ�������
		byte[] bye = { 65, 66, 67, 68, 69 };
		String s2 = new String(bye);
		System.out.println("s2=" + s2);
		System.out.println("length=" + s2.length());
		System.out.println("-----------");
		
		
		// public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ�������
		byte[] bye2 = { 65, 66, 67, 68, 69 };// {97,98,99,100,101};//{48,49,50,51,52};
		String s3 = new String(bye2, 2, 3);
		System.out.println("s3=" + s3);
		System.out.println("length=" + s3.length());
		System.out.println("---------");
		
		// public String(char[] value):���ַ�����ת���ַ�������
		char[] ch = { 'a', 'b', 'c', 'd', 'e' };
		String s4 = new String(ch);
		System.out.println("s4=" + s4);
		System.out.println("length=" + s4.length());
		System.out.println("---------");
		
		// public String(char[] value,int index,int count):���ַ������һ����ת���ַ�������
		String s5 = new String(ch, 1, 3);
		System.out.println("s5=" + s5);
		System.out.println("length=" + s5.length());
		System.out.println("---------");
		
		// public String(String original):���ַ�������ֵת���ַ�������
		String s6 = new String("helloworld");
		System.out.println("s6=" + s6);
		System.out.println("length=" + s6.length());
		System.out.println("---------");
		
		// �ַ������ص㣺һ������ֵ���Ͳ��ܸı䡣
		/*
		 * "hello"��ŵ���������ĳ�������;
		 * "world"Ҳ��ŵ���������ĳ�������;
		 * ͬʱ������������һ��"helloworld"�ŵ��������s7����ָ�������ַ;
		 * ���ﻹ��Ҫע��һ�㣺s7�Ǳ�����"hello","world","helloworld"���ǳ���
		 */
		String s7 = "hello";//s7���ַ�������
		s7 += "world";//��Ч�� s7 = s7+"world";
		System.out.println("s7=" + s7);//helloworld
	}

}
