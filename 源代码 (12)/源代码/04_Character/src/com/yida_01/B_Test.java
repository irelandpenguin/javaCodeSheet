/*
 * ����¼��һ���ַ�����ͳ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ���
 * �����ַ����ֵĴ�����(�����������ַ�)
 */
package com.yida_01;

import java.util.Scanner;

public class B_Test {

	public static void main(String[] args) {
		int count1 = 0;// ͳ��Сд�ַ�
		int count2 = 0;// ͳ�ƴ�д�ַ�
		int count3 = 0;// ͳ�������ַ�

		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ�����");
		String s = sc.nextLine();

		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (Character.isLowerCase(arr[i])) {
				count1++;
			} else if (Character.isUpperCase(arr[i])) {
				count2++;
			} else if (Character.isDigit(arr[i])) {
				count3++;
			}
		}

		System.out.println("Сд�ַ���" + count1 + "��\n��д�ַ���" + count2 + "��\n�����ַ���"
				+ count3 + "��");
	}

}
