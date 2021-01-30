/*
 * �滻���ܣ�
 * public StringBuilder replace(int start,int end,String str):��start��ʼ��end��str�滻
 * 
 * ��ת���ܣ�
 * public StringBuilder reverse()
 * 
 * ���ø������������ַ�
 * public void setCharAt(int index, char ch)
 */
package com.yida_01;

class D_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("world");
		sb.append("java");
		System.out.println("sb:" + sb);
		System.out.println("------");

		// public StringBuilder replace(int start,int end,String
		// str):��start��ʼ��end��str�滻
		sb.replace(5, 10, "yidahulian");
		System.out.println("sb:" + sb);
		System.out.println("------");
		sb.replace(sb.length() - 4, sb.length(), "�˴ﻥ��");
		System.out.println("sb:" + sb);
		System.out.println("------");

		// public StringBuilder reverse()�ַ�����ת����
		StringBuilder sb2 = new StringBuilder("�˴ﻥ��");
		sb2.reverse();
		System.out.println("sb2:" + sb2);

		// public void setCharAt(int index, char ch)���ø������������ַ�
		StringBuilder sb3 = new StringBuilder("���,java");
		sb3.setCharAt(1, '��');
		System.out.println("sb3:" + sb3);
		System.out.println("------");
		sb3.setCharAt(2, '!');
		System.out.println("sb3:" + sb3);
		System.out.println("------");
	}
}
