/*
 * У���û����Ƿ�Ϸ���
 * 		�û���ֻ����5~8λ��ĸ,���ֻ���ĸ�����ֵ���ϣ���һ���ַ�����Ϊ0��
 * 
 * ����:
 * 		A������¼���û�����
 * 		B: �����û�������
 * 			hello
 * 			HELLO
 * 			12345678
 * 			well888
 * 			HEL666
 * 			helWEL55
 * 		C: ����������ʽ�жϼ��ɣ�
 * 		D: ��������
 * 
 */
package com.yida_02;

import java.util.Scanner;

public class B_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û�����");
		String s = sc.nextLine();
		boolean b = checkUser(s);
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

	public static boolean checkUser(String s) {
		return s.matches("[a-zA-Z1-9][a-zA-Z0-9]{4,7}");
	}

}
