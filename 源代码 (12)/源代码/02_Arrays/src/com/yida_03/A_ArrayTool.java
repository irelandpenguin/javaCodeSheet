/*
 * Arrays:���������в����Ĺ����ࡣ����˵����Ͳ��ҡ�
 * public static String toString(int[] a) ������ת���ַ���
 * 
 * public static void sort(int[] a) ��������(Ĭ�ϴ�С����)
 * public static void sort(int[] a, int fromIndex, int toIndex) ����ָ����Χ�ڵ�Ԫ������
 * 
 * public static int binarySearch(int[] a,int key) ���ֲ��ң����ص�һ�γ��ֵ�����λ��
 * 
 * public static int[] copyOfRange(int[] original, int from, int to) �������ָ����Χ���Ƶ�һ�������飬����������
 * 
 * public static boolean equals(int[] a, int[] a2) �ж����������������Ԫ���Ƿ���ͬ
 * 
 * ע�⣺�������з��������������������������������ͣ� �磺boolean[],byte[],char[],long[],float[],double[],Object[]�ȡ�
 */
package com.yida_03;

import java.util.Arrays;

public class A_ArrayTool {
	public static void main(String[] args) {
		// public static String toString(int[] a) ������ת���ַ���
		int[] arr1 = { 12, 1, 8, 5, 80 };
		String s = Arrays.toString(arr1);
		System.out.println(s);
		System.out.println("------");
		
		// public static void sort(int[] a) ��������(Ĭ�ϴ�С����)
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("------");
		
		// public static void sort(int[] a, int fromIndex, int toIndex)����ָ����Χ�ڵ�Ԫ������
		int[] arr2 = { 20, 1, 12, 5, 80, 4, 60, 45, 25, 100 };
		System.out.println(Arrays.toString(arr2));// ����ǰ
		Arrays.sort(arr2, 1, 6);// ��fromIndex��ʼ����toIndex����������toIndex
		System.out.println(Arrays.toString(arr2));// �����
		System.out.println("------");
		
		// public static int binarySearch(int[] a,int key) ���ֲ��ң����ص�һ�γ��ֵ�����λ��
		int[] arr3 = { 2, 10, 12, 45, 80 };//��С�����ź��������
		System.out.println(Arrays.toString(arr3));
		int index = Arrays.binarySearch(arr3, 44);
		System.out.println("index=" + index);
		System.out.println("------");
		
		// public static int[] copyOfRange(int[] original, int from, int to)
		// �������ָ����Χ���Ƶ�һ�������飬����������
		int[] newArr3 = Arrays.copyOfRange(arr3, 1, 5);// ��fromIndex��ʼ���Ƶ�toIndex����������toIndex
		System.out.println("newArr3:" + Arrays.toString(newArr3));
		System.out.println("------");
		
		// public static boolean equals(int[] a, int[] a2) �ж����������������Ԫ���Ƿ���ͬ
		int[] arr4 = { 10, 23, 2, 12, 5 };
		int[] arr5 = { 10, 23, 2, 12, 5 };
		System.out.println(Arrays.equals(arr4, arr5));
	}
}
