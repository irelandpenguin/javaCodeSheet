/*
 * У��qq����.
 * 		1:Ҫ�������5-15λ����
 * 		2:0���ܿ�ͷ
 * 
 * ������
 * 		A:����¼��һ��QQ����
 * 		B:дһ������ʵ��У��
 * 		C:���ù��ܣ���������
 */
package com.yida_01;

import java.util.Scanner;

public class A_CheckQQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������QQ�ţ�");
		String qq = sc.nextLine();
		boolean validate = check(qq);
		System.out.println(qq + "��" + (validate ? "��Ч��!" : "��Ч��!"));
	}

	public static boolean check(String qq) {
		boolean val = false;
		char[] arr = qq.toCharArray();
		if (arr[0] != '0') {
			if (arr.length >= 5 && arr.length <= 15) {
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] >= '0' && arr[i] <= '9') {
						val = true;
					} else {
						val = false;
						break;
					}
				}
			}
		}
		return val;
	}

}
