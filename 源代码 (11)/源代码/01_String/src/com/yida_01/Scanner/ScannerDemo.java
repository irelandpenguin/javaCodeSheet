/*
 * Scanner:���ڽ��ռ���¼�����ݡ�
 * 		A:����
 * 		B:��������
 * 		C:���÷���
 */
package com.yida_01.Scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// ��API�����ĵ���ѧϰScanner�������÷���
		Scanner sc = new Scanner(System.in);// ��������¼�����
		
		System.out.println("������һ���ַ�����");
		String str = sc.nextLine();
		System.out.println("��������ַ���Ϊ" + str);

		/*System.out.println("������һ��������");
		int num = sc.nextInt();
		System.out.println("�����������Ϊ" + num);*/

		/*System.out.println("������һ����������");
		double dou = sc.nextDouble();
		System.out.println("������ĸ�����Ϊ" + dou)*/;

		/*System.out.println("������һ������ֵ��");
		boolean bl = sc.nextBoolean();
		System.out.println("������Ĳ���ֵΪ" + bl);*/
	}

}
