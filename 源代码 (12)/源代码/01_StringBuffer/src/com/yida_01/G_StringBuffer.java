/*
 * String��StringBuffer���໥ת��
 */
package com.yida_01;

public class G_StringBuffer {

	public static void main(String[] args) {
		// String -> StringBuffer
		//StringBuffer sb = "hello";//�����ܰ��ַ���ֱ�Ӹ�ֵ��StringBuffer

		
		// ��ʽһ��ͨ�����췽��
		StringBuffer sb = new StringBuffer("hello");
		System.out.println("sb:" + sb);

		// ��ʽ����ͨ��append()����
		StringBuffer sb2 = new StringBuffer();
		sb2.append("world");
		System.out.println("sb2:" + sb2);
		System.out.println("------");
		
		// StringBuffer -> String
		// ��ʽһ��ͨ�����췽��
		String s = new String(sb);
		System.out.println("s:" + s);
		
		// ��ʽ����ͨ��toString()����
		String s2 = sb2.toString();
		System.out.println("s2:" + s2);
		
		// ��ʽ����ͨ��valueOf()����
		String s3 = String.valueOf(sb2);
		System.out.println("s3:" + s3);
	}

}
