/*
 * ģ���¼,�����λ���,����ʾ���м��Ρ�
 * �����¼�ɹ�������������С��Ϸ��
 */
package com.yida_04.String;

import java.util.Scanner;

public class C_Test {

	public static void main(String[] args) {
		String userName = "admin";
		String userPwd = "admin";

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {// ֻ�����ε�¼����
			System.out.println("�������û�����");
			String name = sc.nextLine();
			System.out.println("���������룺");
			String pwd = sc.nextLine();

			// �ж��û����������Ƿ���ȷ
			if (userName.equals(name) && userPwd.equals(pwd)) {
				System.out.println("��ϲ�㣬��¼�ɹ�!");
				GuessNumber.guess();// ��ʼ������С��Ϸ
				break;
			} else {
				int count = 2 - i;
				if (count > 0) {
					System.out.println("�㻹��" + count + "�ε�¼����");
				} else {
					System.out.println("�����¼���������꣬����ϵ����Ա!");
				}
			}
		}
	}

}
