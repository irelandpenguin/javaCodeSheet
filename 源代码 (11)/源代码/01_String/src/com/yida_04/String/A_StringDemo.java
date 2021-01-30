/*
 * String����жϹ��ܣ�
 * public boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
 * public boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
 * public boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 * public boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
 * public boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
 * public boolean isEmpty():�ж��ַ����Ƿ�Ϊ�ա�
 * 
 * ע�⣺
 * 		�ַ�������Ϊ�պ��ַ�������Ϊ�ա�
 * 		String s = "";
 * 		String s = null;
 */
package com.yida_04.String;

public class A_StringDemo {

	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = "hello world";
		String s3 = "Hello WORLD";
		//public boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ,���ִ�Сд
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		
		
		System.out.println("-----------");
		
		//public boolean equalsIgnoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ,���Դ�Сд
		System.out.println(s1.equalsIgnoreCase(s3));//true
		
		System.out.println("-----------");
		
		//public boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
		System.out.println(s1.contains("wor"));//true
		System.out.println(s1.contains("Wor"));//false
		
		System.out.println("-----------");
		
		//public boolean startsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����ͷ
		System.out.println(s1.startsWith("hello"));//true
		System.out.println(s1.startsWith("h"));//true
		System.out.println(s1.startsWith("Hel"));//false
		
		System.out.println("-----------");
		
		//public boolean endsWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
		System.out.println(s1.endsWith("world"));//true
		System.out.println(s1.endsWith("ld"));//true
		System.out.println(s1.endsWith("lD"));//false
		
		System.out.println("-----------");
		
		String s4 = "";//���ڴ��ַ��������Ϊ��
		System.out.println("isEmpty:" + s4.isEmpty());//true
		
		//String s5 = null;//�ڴ��ַΪ��
		//System.out.println("isEmpty:" + s5.isEmpty());// NullPointerException s5���󶼲����ڣ����Բ��ܵ��÷�������ָ���쳣
		
	}

}
