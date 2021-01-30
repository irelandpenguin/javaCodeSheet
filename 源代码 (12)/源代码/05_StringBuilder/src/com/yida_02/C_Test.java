/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
 * 
 * ������
 * 		�ж�һ���ַ����Ƿ��ǶԳƵ��ַ�������ֻ��Ҫ��
 * 			��һ�������һ���Ƚ�
 * 			�ڶ����͵����ڶ����Ƚ�
 * 			...
 * 		�ȽϵĴ����ǳ��ȳ���2��
 */
package com.yida_02;

import java.util.Scanner;

public class C_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ���:");
		String s = sc.nextLine();
		System.out.println(isSame(s));
		System.out.println("------");
		System.out.println(isSame2(s));
	}

	public static boolean isSame(String str) {
		// �汾һ
		// char[] ary = str.toCharArray();
		// for (int i = 0; i < ary.length / 2; i++) {
		// if (ary[i] != ary[ary.length - 1 - i]) {
		// return false;
		// }
		// }
		// return true;

		// �汾��
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSame2(String str) {
		return new StringBuilder(str).reverse().toString().equals(str);
	}
}
