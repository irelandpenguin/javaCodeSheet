/*
 * String��ת�����ܣ�
 * public byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
 * public char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
 * public static String valueOf(char[] chs):���ַ�����ת���ַ�����
 * public static String valueOf(int i):��int���͵�����ת���ַ�����
 * public static String valueOf(char c):��char���͵�����ת���ַ�����
 * public static String valueOf(double d):��double���͵�����ת���ַ�����
 * ע�⣺valueOf�������кܶ��������أ���JDK API�����ĵ��������԰��������͵�����ת���ַ�����
 * public String toLowerCase():���ַ���ת��Сд��
 * public String toUpperCase():���ַ���ת�ɴ�д��
 * public String concat(String str):���ַ���ƴ�ӡ�
 * public String[] split(String regex):���ݸ���������ʽ��ƥ���ִ��ַ�����
 * 		ע�⣺����ֻ�Ǽ�ʹ�ã�������ʽ���滹����ϸ���⡣
 */
package com.yida_06.String;

public class A_StringDemo {

	public static void main(String[] args) {
		// public byte[] getBytes():���ַ���ת��Ϊ�ֽ����顣
		String s = "helloworld";
		byte[] bye = s.getBytes();
		for (int i = 0; i < bye.length; i++) {
			System.out.print(bye[i] + " ");
		}
		
		//�ֽ�����ת�ַ���
		//String ss = new String(bye);
		//System.out.println(ss);
		
		
		System.out.println("\n------");

		// public char[] toCharArray():���ַ���ת��Ϊ�ַ����顣
		char[] cha = s.toCharArray();
		for (int i = 0; i < cha.length; i++) {
			System.out.print(cha[i] + " ");
		}
		
		//�ַ�����ת�ַ���
		//String ss = new String(cha);
		//System.out.println(ss);

		System.out.println("\n------");
		
		// public static String valueOf(char[] chs):���ַ�����ת���ַ�����
		char[] chars = { 'y', 'i', 'd', 'a', 'h', 'u', 'l', 'i', 'a', 'n' };
		String s2 = String.valueOf(chars);
		System.out.println(s2);

		System.out.println("------");
		
		// public static String valueOf(int i):��int���͵�����ת���ַ�����
		// public static string valueOf(char c):��char���͵�����ת���ַ�����
		// public static string valueOf(double d):��double���͵�����ת���ַ�����
		// ע�⣺valueOf�������кܶ��������أ���JDK API�����ĵ��������԰��������͵�����ת���ַ�����
		int num = 100;
		char c = 'A';
		double dl = 3.14;
		String s_num = String.valueOf(num);
		String s_c = String.valueOf(c);
		String s_dl = String.valueOf(dl);
		System.out.println("ת����Ľ��Ϊ" + s_num + ", " + s_c + ", " + s_dl);
		
		System.out.println("------");

		// public String toLowerCase():���ַ���ת��Сд��
		// public String toUpperCase():���ַ���ת�ɴ�д��
		String s3 = "YiDaHuLian";
		String s_low = s3.toLowerCase();
		String s_upper = s3.toUpperCase();
		System.out.println("�任��Ľ��Ϊ" + s_low + ", " + s_upper);
		
		System.out.println("------");

		// public String concat(String str):���ַ���ƴ�ӡ�
		String s4 = "hello", s5 = "world", s6, s7;
		s6 = s4.concat(s5);
		System.out.println("ƴ�Ӻ���ַ���Ϊ" + s6);
		s7 = s4 + s5;
		System.out.println("ƴ�Ӻ���ַ���Ϊ" + s7);
		
		System.out.println("------");

		// public String[] split(String regex):���ݸ���������ʽ��ƥ���ִ��ַ�����
		//ע�⣺����ֻ�Ǽ�ʹ�ã�������ʽ���滹����ϸ���⡣
		String s8 = "hello world i love yida";
		String[] ary = s8.split(" ");
		for (int i = 0; i < ary.length; i++) {
			String str = ary[i];
			System.out.println(str);
		}
		
		System.out.println("------");
		
		String[] ary2 = s8.split("world");
		for (int i = 0; i < ary2.length; i++) {
			String str = ary2[i];
			System.out.println(str);
		}
	}

}
