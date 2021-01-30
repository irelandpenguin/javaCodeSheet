/*
 * �����⣺
 * 1��String,StringBuffer,StringBuilder������?
 * ��
 * 	String�����ݲ��ɱ�ģ���StringBuffer,StringBuilder�������ݿɱ�ġ�
 * 	StringBuffer��ͬ���ģ����ݰ�ȫ,Ч�ʵ�;StringBuilder�ǲ�ͬ����,���ݲ���ȫ,Ч�ʸ�
 * 
 * 2��StringBuilder�����������?
 * ��
 * 	���߶����Կ�����һ��������װ���������ݡ�
 * 	������,StringBuilder������������һ���ַ������ݡ�
 * 	��������Է��ö������ݣ���������ͬһ���������͵ġ�
 * 
 * 3:��ʽ��������
 * String��Ϊ�������ݣ��ǰ��������ʹ��ݻ����������ʹ��ݣ�
 * StringBuilder��Ϊ�������� ���ǰ��������ʹ��ݻ����������ʹ��ݣ�
 * ��
 * 	String��Ϊ�������ݣ��ǰ��������ʹ��ݣ�����ʽ�����ĸı䲻Ӱ��ʵ�ʲ���;
 * 	StringBuilder��Ϊ�������ݣ�Ҳ�ǰ��������ʹ��ݣ�����ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ�����
 */
package com.yida_03;

public class A_MianShi {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// hello---world
		
		//String��Ϊ�������ݣ���ͼ���һ�¡�

		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld
		
		//StringBuilder��Ϊ�������ݣ���ͼ���һ�¡�
	}

	public static void change(String str1, String str2) {
		str1 = str2;
		str2 = str1 + str2;
	}

	public static void change(StringBuilder sbr1, StringBuilder sbr2) {
		sbr1 = sbr2;
		sbr2.append(sbr1);
	}
}
