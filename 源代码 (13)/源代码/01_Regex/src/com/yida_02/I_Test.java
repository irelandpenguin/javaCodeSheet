/*
 * У������������Ƿ�Ϸ���
 * 		Ҫ�󣺳���ʱ����1996.01.01��2017.12.12֮��ġ�
 * 
 * ������
 * 		A:����¼�����������
 * 		B:������������չ���
 * 			1996.01.01
 * 			1997.10.03
 * 			1999.08.15
 * 			2000.11.11
 * 			2006.06.01
 * 			2007.10.31
 * 			2017.12.12
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
package com.yida_02;

import java.util.Scanner;

public class I_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������(���磺1996.02.12)");
		String s = sc.nextLine();
		boolean b = checkBirthday(s);
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

	public static boolean checkBirthday(String s) {
		return s.matches("((199[6-9])|(200\\d)|(201[0-7]))\\.((0[1-9])|(1[012]))\\.((0[1-9])|([1-2]\\d)|(3[01]))");
	}
}
