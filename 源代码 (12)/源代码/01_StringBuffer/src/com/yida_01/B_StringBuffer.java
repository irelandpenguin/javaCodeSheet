/*
 * StringBuffer����ӹ��ܣ�
 * public StringBuffer append(String str):���԰���������������ӵ��ɱ��ַ�������,�����ؿɱ��ַ�������
 * 
 * public StringBuffer insert(int offset,String str):��ָ��λ�ð��������͵����ݲ��뵽�ɱ��ַ�������,�����ؿɱ��ַ�������
 */
package com.yida_01;

public class B_StringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();// �����ɱ��ַ�������

		// public StringBuffer append(String
		// str):���԰���������������ӵ��ַ�������������,�������ַ�������������
		StringBuffer sb2 = sb.append("yida");
		System.out.println("sb:" + sb);// yida
		System.out.println("sb2:" + sb2);// yida
		System.out.println(sb == sb2);// sb2�ĵ�ַ��sbһ����sb2����sb
		System.out.println("------");

		
		// ������Ӳ�ͬ���͵�����
		sb.append("hello");
		sb.append(true);
		sb.append(100);
		sb.append('A');
		sb.append(3.14f);
		sb.append(4.26);
		sb.append(88888888);
		System.out.println("sb:" + sb);
		System.out.println("------");
		
		// ���ַ�������ӵ��ַ�����������
		// sb.append(str)
		char[] ary = { 'a', 'B', '0', 'X' };
		sb.append(ary);
		System.out.println("sb:" + sb);
		System.out.println("------");
		sb.append(ary, 1, 2);
		System.out.println("sb:" + sb);
		//System.out.println("------");
		
		// ��ʽ���(��ʽ��̵�ǰ�᣺ÿ��.ǰ�涼������һ������ſ��ԣ�)
		StringBuffer ssb = new StringBuffer();
		ssb.append("���").append("yidahulian").append(true).append(100).append(3.14);
		System.out.println("ssb:" + ssb);
		
		// public StringBuffer insert(int offset,String
		// str):��ָ��λ�ð��������͵����ݲ��뵽�ַ�������������,�������ַ�������������
		StringBuffer buffer = new StringBuffer("hello");
		buffer.insert(5, "world");
		System.out.println("buffer:" + buffer);
		System.out.println("------");
		
		// �������벻ͬ��������
		buffer.insert(0, true);
		buffer.insert(1, 'A');
		buffer.insert(2, 3.14);
		buffer.insert(buffer.length(), 100);
		System.out.println("buffer:" + buffer);
		System.out.println("------");
		
		// ���ַ�������뵽�ַ���������������
		char[] chs = { 'a', 'b', 'c', 'd' };
		buffer.insert(0, chs);
		System.out.println("buffer:" + buffer);
		System.out.println("------");
		buffer.insert(buffer.length(), chs, 1, 2);
		System.out.println("buffer:" + buffer);
	}
}
