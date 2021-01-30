/*
 * String��Ļ�ȡ����
 * public int length():��ȡ�ַ����ĳ��ȡ�
 * public char charAt(int index):��ȡָ������λ�õ��ַ�
 * public int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ����������Ҳ�������-1
 * public int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ����������Ҳ�������-1
 * public int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ����������Ҳ�������-1
 * public int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ����������Ҳ�������-1
 * public int lastIndexOf(String str)�������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е��������Ҳ�������-1
 * public String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
 * public String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
 */
package com.yida_05.String;

public class A_StringDemo {

	public static void main(String[] args) {
		// public int length():��ȡ�ַ����ĳ��ȡ�
		String s = "hello";
		System.out.println("length=" + s.length());

		System.out.println("------");

		// public char charAt(int index):��ȡָ������λ�õ��ַ�
		String s2 = "hello world";
		char c = s2.charAt(6);
		System.out.println("s2.charAt(6)=" + c);
		c = s2.charAt(s2.length()-1);//��ȡ���һ���ַ�
		System.out.println("���һ���ַ�Ϊ��" + c);
		
		System.out.println("------");

		
		// public int indexOf(int ch):����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		int index = s2.indexOf('l');
		System.out.println(s2 + "���ַ�l��һ�γ��ֵ�λ��Ϊ" + index);
		index = s2.indexOf('A');
		System.out.println(s2 + "���ַ�A��һ�γ��ֵ�λ��Ϊ" + index);
		
		System.out.println("------");

		// public int indexOf(int ch,int fromIndex):����ָ���ַ��ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		int index2 = s2.indexOf('l', 6);
		System.out.println("�ַ�l��ԭ�ַ���" + s2 + "����Ϊ6�Ժ��һ�γ��ֵ�λ��Ϊ" + index2);
		index2 = s2.indexOf('A', 6);
		System.out.println("�ַ�A��ԭ�ַ���" + s2 + "����Ϊ6�Ժ��һ�γ��ֵ�λ��Ϊ" + index2);
		
		System.out.println("------");

		// public int indexOf(String str):����ָ���ַ����ڴ��ַ����е�һ�γ��ִ���������
		String s3 = "hi, yidahulian, i love yida, welcom to yidahulian";
		String s4 = "yida";
		int index3 = s3.indexOf(s4);
		System.out.println(s4 + "��ԭ�ַ���" + s3 + "�е�һ�γ��ֵ�λ��Ϊ" + index3);
		index3 = s3.indexOf("YIDA");
		System.out.println("YIDA��ԭ�ַ���" + s3 + "�е�һ�γ��ֵ�λ��Ϊ" + index3);
		
		System.out.println("------");

		// public int indexOf(String str,int fromIndex):����ָ���ַ����ڴ��ַ����д�ָ��λ�ú��һ�γ��ִ���������
		int index4 = s3.indexOf(s4, 15);
		System.out.println(s4 + "��ԭ�ַ���" + s3 + "�д�����15�Ժ��һ�γ��ֵ�λ��Ϊ" + index4);
		index4 = s3.indexOf("YIDA", 15);
		System.out.println("YIDA��ԭ�ַ���" + s3 + "�д�����15�Ժ��һ�γ��ֵ�λ��Ϊ" + index4);
		
		System.out.println("------");
		
		//public int lastIndexOf(String str)�������ұ߳��ֵ�ָ�����ַ����ڴ��ַ����е��������Ҳ�������-1
		int index5 = s3.lastIndexOf("yida");
		System.out.println("yida��ԭ�ַ���" + s3 + "������һ�γ��ֵ�λ��Ϊ" + index5);
		
		System.out.println("------");

		// public String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ���,Ĭ�ϵ�ĩβ��
		String sub1 = s3.substring(16);
		System.out.println("��ȡ���Ӵ�Ϊ" + sub1);
		
		System.out.println("------");

		// public String substring(int start,int end):��ָ��λ�ÿ�ʼ��ָ��λ�ý�����ȡ�ַ�����
		String sub2 = s3.substring(16, 27);
		System.out.println("��ȡ���Ӵ�Ϊ" + sub2);
		
		System.out.println("------");

		// ���󣺱�����ȡ�ַ����е�ÿһ���ַ���
		String str = "hello yidahulian";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println(ch);
		}
	}

}
