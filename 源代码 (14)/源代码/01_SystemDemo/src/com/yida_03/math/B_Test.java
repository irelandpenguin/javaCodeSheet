/*
 * �����⣺�����һ������������ʵ�ֻ�ȡ���ⷶΧ�ڵ��������
 * 
 * ������
 * 		A:����¼���������ݡ�
 * 			int strat;
 * 			int end;
 * 		B:��취��ȡ��start��end֮��������
 * 			��дһ������ʵ�����Ч�����õ�һ���������(int)
 * 		C:�����������
 */
package com.yida_03.math;

import java.util.Random;
import java.util.Scanner;

public class B_Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����뿪ʼ����");
		int start = sc.nextInt();
		System.out.println("�������������");
		int end = sc.nextInt();
		//int num = randNum(start, end);
		int num = randNum2(start, end);
		System.out.println(start + "~" + end + "֮��������Ϊ" + num);
	}
	
	//start=45, end=95
	public static int randNum(int start, int end) {
		//int num = (int)(Math.random()*100+1);//���ǻ�ȡ1~100�������  Math.random()*100+1: 0.0~100.0 + 1 = 1.0~100.0
		// ��λ�ȡstart~end��������أ�
		//int num = (int) (Math.random() * end+start);//����ò�Ʋ�����  Math.random() * end+start��0.0~95.0 + 45.0 = 45.0 ~ 140.0
		int num = (int) (Math.random() * (end-start+1) + start);//Math.random() * (end-start+1) : 0.0~51.0 + 45 = 45.0 ~ 95.0
		return num;
	}
	
	//start=45, end=95
	public static int randNum2(int start, int end) {
		Random r = new Random();
		int num = r.nextInt((end-start+1))+start;
		return num;
	}

}
