/*
 * String����������ܣ�
 * 
 * �滻����
 * public String replace(char old,char new)
 * public String replace(CharSequence target,CharSequence replacement)
 *
 * ȥ���ַ������ߵĿո�	
 * public String trim()
 * 
 * �Ƚ������ַ���  
 * public int compareTo(String str)
 * public int compareToIgnoreCase(String str)
 */
package com.yida_07.String;

public class A_StringDemo {
	
	public static void main(String[] args) {
		// public String replace(char old,char new) �滻����(�ַ����滻)
		String s = "hi,yidahulian";
		String s2 = s.replace('i', 'o');
		System.out.println(s + "�滻��Ľ��Ϊ" + s2);
		
		System.out.println("------");
		
		// public String replaceAll(String old,String new) �滻����(�ַ������滻)
		String s3 = "i love yida, welcom to yida, study yida";
		//String s4 = s3.replaceAll("yida", "java");
		
		//public String replace(CharSequence target,CharSequence replacement) �滻����(�ַ������滻)
		String s4 = s3.replace("yida", "java");
		System.out.println(s3 + "�滻��Ľ��Ϊ" + s4);
		
		System.out.println("------");

		// public String trim() ȥ���ַ�����ͷ�Ŀո�
		String s5 = " 		 good good study, day day up! 				 ", s6;
		s6 = s5.trim();
		System.out.println("ȥ���ַ�����ͷ�Ŀո�����Ϊ" + s6);
		
		System.out.println("------");

		// public int compareTo(String str) �Ƚ������ַ���(���ִ�Сд)
		String s7 = "hello", s8 = "java";
		int result = s7.compareTo(s8);
		System.out.println(s7 + "��" + s8 + "�ȽϺ�Ľ��Ϊ" + result);
		if (result > 0) {
			System.out.println(s7 + "����" + s8);
		} else if (result < 0) {
			System.out.println(s7 + "С��" + s8);
		} else {
			System.out.println(s7 + "����" + s8);
		}
		
		System.out.println("------");
		
		// public int compareToIgnoreCase(String str) �Ƚ������ַ���(�����ִ�Сд)
		String s9 = "zELLO";
		int result2 = s7.compareToIgnoreCase(s9);
		System.out.println(s7 + "��" + s9 + "�ȽϺ�Ľ��Ϊ" + result2);
		if (result2 > 0) {
			System.out.println(s7 + "����" + s9);
		} else if (result2 < 0) {
			System.out.println(s7 + "С��" + s9);
		} else {
			System.out.println(s7 + "����" + s9);
		}
	}

}
