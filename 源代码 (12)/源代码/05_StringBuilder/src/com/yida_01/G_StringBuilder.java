/*
 * String��StringBuilder���໥ת��
 */
package com.yida_01;

public class G_StringBuilder {
	public static void main(String[] args) {
		// String -> StringBuilder
		// StringBuilder sb = "hello";//�����ܰ��ַ���ֱ�Ӹ�ֵ��StringBuilder

		// ��ʽһ��ͨ�����췽��
		StringBuilder sb = new StringBuilder("hello");
		System.out.println("sb:" + sb);

		// ��ʽ����ͨ��append()����
		StringBuilder sb2 = new StringBuilder();
		sb2.append("world");
		System.out.println("sb2:" + sb2);
		System.out.println("------");

		// StringBuilder -> String
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
