/*
 * ����ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
 * ������
 * 		"Hello123World"
 * �����
 * 		��д�ַ���2��
 * 		Сд�ַ���8��
 * 		�����ַ���3��
 */
package com.yida_05.String;

public class B_Test {

	public static void main(String[] args) {
		String s = "Hello123World";
		int count1 = 0;// ��д��ĸ�ַ�����
		int count2 = 0;// Сд��ĸ�ַ�����
		int count3 = 0;// �����ַ�����
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 'A' && c <= 'Z') {// �жϴ�д��ĸ
				count1++;
			} else if (c >= 'a' && c <= 'z') {// �ж�Сд��ĸ
				count2++;
			} else if (c >= '0' && c <= '9') {// �ж�����
				count3++;
			}
		}

		System.out.println("��д��ĸ�ַ�����Ϊ" + count1 + "\n" + "Сд��ĸ�ַ�����Ϊ" + count2
				+ "\n" + "�����ַ�����Ϊ" + count3);
	}

}
