/*
 * ��ϰ��2���ַ�����ת��
 */
package com.yida_02;

import java.util.Scanner;

public class B_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ���");
		String s = sc.nextLine();
		String result = reverseString(s);
		System.out.println(result);
		System.out.println("------");

		result = reverseString2(s);
		System.out.println(result);
	}

	//��ʽһ����String��ƴ��
	public static String reverseString(String s) {
		// �汾һ
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			str += s.charAt(i);
		}
		return str;

		// �汾��
		// String str = "";
		// char[] ary = s.toCharArray();
		// for (int k = ary.length - 1; k >= 0; k--) {
		// str += ary[k];
		// }
		// return str;

		// �汾��
		// String str = "";
		// for (int j = s.length() - 1; j >= 0; j--) {
		// str += s.substring(j, j + 1);
		// }
		// return str;
	}

	//��ʽ������StringBuilder��reverse()����
	public static String reverseString2(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}
