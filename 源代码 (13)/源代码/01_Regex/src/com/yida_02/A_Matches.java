/*
 * ѧϰ ������ʽ.txt���֪ʶ��
 * 
 * �жϹ���
 *		String���public boolean matches(String regex)
 *		���ݸ�����������ʽ��ƥ���ж��ַ�����
 *
 * ����
 * 		У���ֻ������Ƿ���Ч?
 * 
 * ������
 * 		A:����¼���ֻ�����
 * 		B:�����ֻ�����Ĺ���
 * 			13436975980
 * 			13688886868
 * 			15866668888
 * 			15799321156
 * 			18912345678
 * 			18886867878
 * 			18638833883
 * 		C:���ù��ܣ��жϼ���
 * 		D:������
 */
package com.yida_02;

import java.util.Scanner;

public class A_Matches {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ֻ��ţ�");
		String s = sc.nextLine();
		boolean bl = checkTel(s);
		System.out.println(s + (bl ? "�Ϸ���" : "��Ч��"));
	}

	public static boolean checkTel(String s) {
		return s.matches("1[358][0-9]{9}");
	}

}
