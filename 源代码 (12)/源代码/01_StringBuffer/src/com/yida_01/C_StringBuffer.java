/*
 * StringBuffer��ɾ������
 * public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 */
package com.yida_01;

public class C_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello").append("world").append("yida");//��ʽ���
		System.out.println("sb:" + sb);
		System.out.println("------");

		// public StringBuffer deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
		//System.out.println(sb.length()); 
		sb.deleteCharAt(2);
		//System.out.println(sb.length()); 
		System.out.println("sb:" + sb);

		// public StringBuffer delete(int start,int end):ɾ����ָ��λ�ÿ�ʼ��ָ��λ�ý��������ݣ������ر���
		sb.delete(5, 10);
		//System.out.println(sb.length());
		System.out.println("sb:" + sb);

		sb.delete(0, sb.length());
		System.out.println("sb:" + sb);
		//System.out.println(sb.length());
	}

}
