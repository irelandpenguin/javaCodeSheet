/*
 * У��������Ƿ�Ϸ���
 * 		Ҫ�󣺳�����Ӧ��1��31֮�䣬���ﲻ������������(ƽ�꣬����)��
 * 
 * ������
 * 		A:����¼�������
 * 		B:��������չ���
 * 			1
 * 			2
 * 			3
 * 			10
 * 			19
 * 			20
 * 			29
 * 			30
 * 			31
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
package com.yida_02;

import java.util.Scanner;

public class G_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������գ�");
		String s = sc.nextLine();
		boolean b = checkDay(s);
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

	public static boolean checkDay(String day) {
		return day.matches("[1-9]|[12]\\d|3[01]");
	}
}
