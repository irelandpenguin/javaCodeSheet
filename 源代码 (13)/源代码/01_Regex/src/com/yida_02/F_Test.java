/*
 * У������·��Ƿ�Ϸ���
 * 		Ҫ�󣺳����·�Ӧ��1��12֮�䡣
 * 
 * ������
 * 		A:����¼������·�
 * 		B:��������·ݹ���
 * 			1
 * 			2
 * 			3
 * 			10
 * 			11
 * 			12
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
package com.yida_02;

import java.util.Scanner;

public class F_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������·ݣ�");
		String s = sc.nextLine();
		boolean b = checkMonth(s);
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

	public static boolean checkMonth(String month) {
		return month.matches("[1-9]|1[0-2]");
	}

}
