/*
 * У�����䡣
 * 		Ҫ��ֻ�������֣�ֻ����18~45֮�䡣
 * 
 * ������
 * 		A�������������䣻
 * 		B: �����û�������
 * 			18
 * 			30	
 * 			40
 * 			23
 * 			45
 * 		C��������ʽ�ж��Ƿ�Ϸ���
 * 		D����������
 */
package com.yida_02;

import java.util.Scanner;

public class D_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������䣺");
		String age = sc.nextLine();
		boolean b = checkAge(age);
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

	public static boolean checkAge(String age) {
		return age.matches("1[8-9]|[2-3]\\d|4[0-5]");
	}
}
