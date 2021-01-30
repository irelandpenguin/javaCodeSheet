/*
 * ��ϰ��1����һ��˳���ַ�����{'A','C','E','P','R','T','V','X','Y','Z'}���ҳ��ַ�'A','E','X','W'��Ӧ�������Ҳ�����ӡ-1��
 */
package com.yida_02;

public class B_Test {

	public static void main(String[] args) {
		char[] arr = { 'A', 'C', 'E', 'P', 'R', 'T', 'V', 'X', 'Y', 'Z' };
		
		/*int idx = binSearch(arr, 'A');
		System.out.println("�ַ�" + 'A' + "������Ϊ" + idx);
		idx = binSearch(arr, 'E');
		System.out.println("�ַ�" + 'E' + "������Ϊ" + idx);
		idx = binSearch(arr, 'X');
		System.out.println("�ַ�" + 'X' + "������Ϊ" + idx);
		idx = binSearch(arr, 'W');
		System.out.println("�ַ�" + 'W' + "������Ϊ" + idx);*/
		
		//�Ľ��汾
		char[] chars = { 'A', 'E', 'X', 'W' };
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			int idx = binSearch(arr, c);
			System.out.println("�ַ�" + c + "������Ϊ" + idx);
		}
	}

	// ���ֲ���
	public static int binSearch(char[] ary, char value) {
		int min = 0, max = ary.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (ary[mid] == value) {
				return mid;
			} else if (ary[mid] > value) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}

}
