/*
 * StringBuilder�Ĳ�ѯ����:
 * public int indexOf(String str)���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е��������Ҳ�������-1
 * public int indexOf(String str, int fromIndex)��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е��������Ҳ�������-1
 * public int lastIndexOf(String str)�������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е��������Ҳ�������-1
 */
package com.yida_01;

public class F_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("helloyidajava").append("yidakeji").append("yidahulian");
		System.out.println("sb:" + sb);
		System.out.println("-------");

		// public int indexOf(String str)���ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е��������Ҳ�������-1
		int index = sb.indexOf("yida");
		System.out.println("index:" + index);
		System.out.println("-------");

		// public int indexOf(String str, int
		// fromIndex)��ָ������������ʼ�����ص�һ�γ��ֵ�ָ�����ַ����ڸ��ַ����е��������Ҳ�������-1
		int index2 = sb.indexOf("yida", 13);
		System.out.println("index:" + index2);
		System.out.println("--------");

		// public int lastIndexOf(String str)�������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е��������Ҳ�������-1
		int index3 = sb.lastIndexOf("yida");
		System.out.println("index3:" + index3);
	}

}
