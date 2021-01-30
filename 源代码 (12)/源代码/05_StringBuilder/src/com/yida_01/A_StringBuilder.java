/*
 * �̰߳�ȫ(���߳̽���)
 * ��ȫ -- ͬ�� -- �����ǰ�ȫ��  (�������������з�������Ǯ�ٸ��з���)  -- StringBuffer
 * ����ȫ -- ��ͬ�� -- Ч�ʸ�һЩ (���������̰�̯���з����úз���ͬʱ��Ǯ�����ŵ��з�λ�ô���) -- StringBuilder
 * 
 * StringBuilder:
 * 		�̲߳���ȫ�Ŀɱ��ַ�����
 * 
 * StringBuilder��String������?
 * ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ䡣
 * ���ʹ��ǰ�����ַ�����ƴ�ӣ������˷�̫�����Դ��
 * 
 * StringBuilder�Ĺ��췽����
 * 		public StringBuilder():�޲ι��췽��
 *		public StringBuilder(int capacity):ָ���������ַ�������������
 *		public StringBuilder(String str):ָ���ַ������ݵ��ַ�������������
 *
 * StringBuilder�ķ�����
 *		public int capacity()�����ص�ǰ������	����ֵ
 *		public int length():���س��ȣ��ַ������� ʵ��ֵ
 */
package com.yida_01;

public class A_StringBuilder {

	public static void main(String[] args) {
		// public StringBuilder():�޲ι��췽��
		StringBuilder sb = new StringBuilder();// Ĭ����16���ֽڣ���API�ĵ���Դ��
		System.out.println("sb:" + sb);// Ĭ�ϵ���sb.toString()��������û�������أ�
		System.out.println("sb.capacity:" + sb.capacity());// 16
		System.out.println("sb.length:" + sb.length());// 0
		System.out.println("------");

		// public StringBuilder(int capacity):ָ���������ַ�������������
		StringBuilder sb2 = new StringBuilder(30);// ��Դ��
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capaty:" + sb2.capacity());// 30
		System.out.println("sb2.length:" + sb2.length());// 0
		System.out.println("------");

		// public StringBuilder(String str):ָ���ַ������ݵ��ַ�������������
		StringBuilder sb3 = new StringBuilder("yida");// ��Դ��
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capaty:" + sb3.capacity());// 20
		System.out.println("sb3.length:" + sb3.length());// 4
	}

}
