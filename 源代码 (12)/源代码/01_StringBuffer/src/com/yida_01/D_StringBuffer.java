 /*
 * �滻���ܣ�
 * public StringBuffer replace(int start,int end,String str):��start��ʼ��end��str�滻
 * 
 * ��ת���ܣ�
 * public StringBuffer reverse()
 * 
 * ���ø������������ַ�
 * public void setCharAt(int index, char ch)
 */
package com.yida_01;

public class D_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);
		System.out.println("------");
		
		
		// public StringBuffer replace(int start,int end,String
		// str):��start��ʼ��end��str�滻
		sb.replace(5, 10, "yidahulian");
		System.out.println("sb:" + sb);
		System.out.println("------");
		sb.replace(sb.length() - 4, sb.length(), "�˴ﻥ��");
		System.out.println("sb:" + sb);
		System.out.println("------");
		
		// public StringBuffer reverse()�ַ�����ת����
		StringBuffer sb2 = new StringBuffer("�˴ﻥ��");
		sb2.reverse();
		System.out.println("sb2:" + sb2);
		
		// public void setCharAt(int index, char ch)���ø������������ַ�
		StringBuffer sb3 = new StringBuffer("���,java");
		sb3.setCharAt(1, '��');
		System.out.println("sb3:" + sb3);
		System.out.println("------");
		sb3.setCharAt(2, '!');
		System.out.println("sb3:" + sb3);
		System.out.println("------");
		
	}

}
