/*
 * ������д�����
 * 	ע�⣺
 * 		�ַ���������ӣ����ȿ����ڴ��ַ��Ȼ����ƴ���ַ���;
 * 		�ַ���������ӣ�����ƴ���ַ�����Ȼ�󵽳�����������û�����ƴ�Ӻ���ַ���������У���ֱ�ӷ���ԭ���ַ���������û�У����ڳ������ﴴ���ַ���������
 */
package com.yida_03.mianshi;

public class C_Demo {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		System.out.println(s3 == s1 + s2);// ? 	false
		System.out.println(s3.equals((s1 + s2)));// ? 	true
		System.out.println(s3 == "hello" + "world");// ?   true
		System.out.println(s3.equals("hello" + "world"));// ? 	 true
	}

}
