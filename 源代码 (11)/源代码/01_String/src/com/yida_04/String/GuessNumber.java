package com.yida_04.String;

import java.util.Scanner;

public class GuessNumber {
	public static void guess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ʼ��Ϸ��");

		int randomNum = (int) (Math.random() * 100 + 1);
		//System.out.println("���������Ϊ" + randomNum);

		while (true) {
			System.out.println("��������µ�����(1~100)��");
			int num = sc.nextInt();
			if (num == randomNum) {
				System.out.println("��ϲ�㣬�¶���!");
				break;
			} else if (num > randomNum) {
				System.out.println("�´���");
			} else {
				System.out.println("��С��");
			}
		}
	}
}
