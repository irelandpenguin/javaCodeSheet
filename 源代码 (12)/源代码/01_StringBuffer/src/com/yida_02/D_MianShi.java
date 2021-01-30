/*
 * �����⣺
 * 1��String,StringBuffer,StringBuilder������?
 * ��
 * 	String�����ݲ��ɱ�ģ���StringBuffer,StringBuilder�������ݿɱ�ġ�
 * 	StringBuffer��ͬ���ģ����ݰ�ȫ,Ч�ʵ�;StringBuilder�ǲ�ͬ����,���ݲ���ȫ,Ч�ʸ�
 * 
 * 2��StringBuffer�����������?
 * ��
 * 	���߶����Կ�����һ��������װ���������ݡ�
 * 	������,StringBuffer������������һ���ַ������ݡ�
 * 	��������Է��ö������ݣ���������ͬһ���������͵ġ�
 * 
 * 3:��ʽ��������
 * String��Ϊ�������ݣ��ǰ��������ʹ��ݻ����������ʹ��ݣ�
 * StringBuffer��Ϊ�������� ���ǰ��������ʹ��ݻ����������ʹ��ݣ�
 * ��
 * 	String��Ϊ�������ݣ��ǰ��������ʹ��ݣ�����ʽ�����ĸı䲻Ӱ��ʵ�ʲ���;
 * 	StringBuffer��Ϊ�������ݣ�Ҳ�ǰ��������ʹ��ݣ�����ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ�����
 */
package com.yida_02;

public class D_MianShi {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		System.out.println(s1 + "---" + s2);// hello---world
		change(s1, s2);
		System.out.println(s1 + "---" + s2);// hello---world

		// String��Ϊ�������ݣ���ͼ���һ�¡�
		
		StringBuffer sb1 = new StringBuffer("hello");
		StringBuffer sb2 = new StringBuffer("world");
		System.out.println(sb1 + "---" + sb2);// hello---world
		change(sb1, sb2);
		System.out.println(sb1 + "---" + sb2);// hello---worldworld
		 
		// StringBuffer��Ϊ�������ݣ���ͼ���һ�¡�
	}

	public static void change(String str1, String str2) {
		str1 = str2;
		str2 = str1 + str2;
	}

	public static void change(StringBuffer sbr1, StringBuffer sbr2) {
		sbr1 = sbr2;
		sbr2.append(sbr1);
	}

}
