package com.yida_01;

import java.util.Scanner;

public class B_CheakQQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������QQ�ţ�");
		String qq = sc.nextLine();
		boolean validate = check(qq);
		System.out.println(qq + "��" + (validate ? "��Ч��!" : "��Ч��!"));
	}

	public static boolean check(String qq) {
		return qq.matches("[1-9][0-9]{4,14}");//��������ʽ���ж�(��������ѧϰ������ʽ)
	}

}
