/*
 * �̰߳�ȫ(���߳̽���)
 * ��ȫ -- ͬ�� -- �����ǰ�ȫ��  (�������������з�������Ǯ�ٸ��з���)
 * ����ȫ -- ��ͬ�� -- Ч�ʸ�һЩ (���������̰�̯���з����úз���ͬʱ��Ǯ�����ŵ��з�λ�ô���)
 * ��ȫ��Ч����������Զ�������ǵ����⡣
 * ��ȫ��������վ
 * Ч�ʣ�������վ
 * 
 * StringBuffer:
 * 		�̰߳�ȫ�Ŀɱ��ַ�����
 * 
 * StringBuffer��String������?
 * ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ䡣
 * ���ʹ��ǰ�����ַ�����ƴ�ӣ������˷�̫�����Դ��
 * 
 * StringBuffer�Ĺ��췽����
 * 		public StringBuffer():�޲ι��췽��
 *		public StringBuffer(int capacity):ָ���������ַ�������������
 *		public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
 *
 * StringBuffer�ķ�����
 *		public int capacity()�����ص�ǰ������	����ֵ
 *		public int length():���س��ȣ��ַ������� ʵ��ֵ
 */
package com.yida_01;

public class A_StringBuffer {

	public static void main(String[] args) {
		// public StringBuffer():�޲ι��췽��
		StringBuffer sb = new StringBuffer();// Ĭ����16���ֽڣ���API�ĵ���Դ��
		System.out.println("sb:" + sb);// Ĭ�ϵ���sb.toString()��������û����д�أ�
		System.out.println("sb.capacity:" + sb.capacity());// 16
		System.out.println("sb.length:" + sb.length());// 0
		System.out.println("------");
		
		// public StringBuffer(int capacity):ָ���������ַ�������������
		StringBuffer sb2 = new StringBuffer(30);// ��Դ��
		System.out.println("sb2:" + sb2);
		System.out.println("sb2.capaty:" + sb2.capacity());// 30
		System.out.println("sb2.length:" + sb2.length());// 0
		System.out.println("------");
		
		// public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
		StringBuffer sb3 = new StringBuffer("yida");// ��Դ��
		System.out.println("sb3:" + sb3);
		System.out.println("sb3.capaty:" + sb3.capacity());// 20
		System.out.println("sb3.length:" + sb3.length());// 4
	}

}
