/*
 * У���������Ƿ�Ϸ���
 * 		Ҫ�󣺳��������1990�굽2017��֮��ġ�
 * 
 * ������
 * 		A:����¼��������
 * 		B:���������ݹ���
 * 			1990
 * 			1991
 * 			1992
 * 			2000
 * 			2001
 * 			2010
 * 			2017
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
package com.yida_02;

import java.util.Scanner;

public class E_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����������ݣ�");
		String s = sc.nextLine();
		boolean b = checkYear(s);
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

	public static boolean checkYear(String year) {
		return year.matches("199\\d|200\\d|201[0-7]");
	}

}
