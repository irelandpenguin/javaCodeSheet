/*
 * �ж�һ���ַ����Ƿ��ǶԳ��ַ���
 * ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"��"cbaddabc"�ǶԳ��ַ���
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
		//System.out.println("------");
		System.out.println(isSame2(s));
	}

	public static boolean isSame(String str) {
		/*
		 "cbaddabc" -> {'c','b','a','d','d','a','b','c'}
		 ary[0]   ary[7]
		 ary[1]	  ary[6]
		 ary[2]   ary[5]
		 ary[3]   ary[4]
		 
		 ary[i]   ary[ary.length-1-i]
		 */
		
		// �汾һ
		/* char[] ary = str.toCharArray();
		 for (int i = 0; i < ary.length / 2; i++) {
			 if (ary[i] != ary[ary.length - 1 - i]) {
				 return false;
			 }
		 }
		 return true;*/

		// �汾��
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isSame2(String str) {
		//Դ�ַ��� "cbaddabc"
		//��ת��     "cbaddabc"
		
		//Դ�ַ���  "mbc"
		//��ת��      "cbm"
		
		/*StringBuffer sb = new StringBuffer(str);
		sb.reverse();//��ת
		String newStr = sb.toString();
		return newStr.equals(str);*/
	
		return new StringBuffer(str).reverse().toString().equals(str);//��ʽ���
	}

}
