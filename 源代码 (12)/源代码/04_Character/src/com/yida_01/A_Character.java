/*
 * Character ���ڶ����а�װһ���������� char ��ֵ
 * ���⣬�����ṩ�˼��ַ�������ȷ���ַ������Сд��ĸ����д��ĸ�����ֵȣ�
 * �����ַ��Ӵ�дת����Сд����Сдת���ɴ�д��
 * 
 * ���췽����
 * 		Character(char value)
 * 
 * public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
 * public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
 * public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
 * public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
 * public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
 */
package com.yida_01;

public class A_Character {

	public static void main(String[] args) {
		Character ch = new Character('A');
		System.out.println("ch:" + ch);
		System.out.println("------");

		// public static boolean isLowerCase(char ch):�жϸ������ַ��Ƿ���Сд�ַ�
		System.out.println(Character.isLowerCase('a'));//true
		System.out.println(Character.isLowerCase('A'));//false
		System.out.println("------");

		// public static boolean isUpperCase(char ch):�жϸ������ַ��Ƿ��Ǵ�д�ַ�
		System.out.println(Character.isUpperCase('A'));//true
		System.out.println(Character.isUpperCase('a'));//false
		System.out.println("------");
		
		
		// public static boolean isDigit(char ch):�жϸ������ַ��Ƿ��������ַ�
		System.out.println(Character.isDigit('8'));//true
		System.out.println(Character.isDigit('b'));//false
		System.out.println("------");
		
		// public static char toUpperCase(char ch):�Ѹ������ַ�ת��Ϊ��д�ַ�
		char ch1 = Character.toUpperCase('w');
		System.out.println("ch:" + ch1);
		System.out.println("------");
		
		// public static char toLowerCase(char ch):�Ѹ������ַ�ת��ΪСд�ַ�
		char ch2 = Character.toLowerCase('B');
		System.out.println("ch2:" + ch2);
	}

}
