/*
 * У�����롣
 * 		ֻ����6λ���֣�0���ܿ�ͷ��
 * 
 * ������
 * 		A:����¼�����֣�
 * 			111111
 * 			123456
 * 			123321
 * 			111222
 * 			888408
 * 			502666
 * 		B������������ʽ���жϺϷ��ԣ�
 * 		C:��������
 */
package com.yida_02;

import java.util.Scanner;

public class C_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������룺");
		String s = sc.nextLine();
		boolean b = s.matches("[1-9]\\d{5}");
		System.out.println(b ? "�Ϸ�" : "���Ϸ�");
	}

}
