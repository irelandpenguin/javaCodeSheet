/*
 * StringBuilder��ɾ������
 * public StringBuilder deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
 * public StringBuilder delete(int start,int end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
 */
package com.yida_01;

public class C_StringBuilder {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello").append("world").append("yida");
		System.out.println("sb:" + sb);
		System.out.println("------");

		 //public StringBuilder deleteCharAt(int index):ɾ��ָ��λ�õ��ַ��������ر���
		// sb.deleteCharAt(2);
		// System.out.println("sb:" + sb);

		// public StringBuilder delete(int start,int
		// end):ɾ����ָ��λ�ÿ�ʼָ��λ�ý��������ݣ������ر���
		// sb.delete(5, 10);
		// System.out.println("sb:" + sb);

		// sb.delete(0, sb.length());
		// System.out.println("sb:" + sb);
	}
}
