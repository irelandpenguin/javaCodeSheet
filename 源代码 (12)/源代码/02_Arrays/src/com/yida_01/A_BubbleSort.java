/*
 * ���������㷨�кܶ��֣����磺ð������ѡ�����򣬿������򣬲�������ϣ������ȡ�
 * ��������ֻѧϰǰ��2�־��㹻�ˣ���ð������ѡ������
 * 
 * ð������
 * 	����Ԫ�������Ƚϣ��������ţ���һ����ϣ����ֵ�����������������
 */
package com.yida_01;

public class A_BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 23, 15, 5, 67, 9 };
		System.out.println("����ǰ��");
		printArray(arr);
		System.out.println("�����");
		bubbleSort(arr);
		printArray(arr);
	}

	// ð������
	public static void bubbleSort(int[] ary) {
		for (int i = 1; i < ary.length; i++) {//������ѭ������
			for (int j = 0; j < ary.length-i; j++) {//�����Ƚϣ��ҳ�����
				if (ary[j] > ary[j+1]) {
					int tmp = ary[j];//tmp���������ڽ���ary[j]��ary[j+1]
					ary[j] = ary[j+1];
					ary[j+1] = tmp;
				}
			}
		}
	}
	
	// ��ӡ����Ԫ��
	public static void printArray(int[] ary) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {
				sb.append(ary[i]).append("]");
			} else {
				sb.append(ary[i]).append(", ");
			}
		}
		System.out.println(sb.toString());
	}

	// �Ӵ�С��������ôд�أ�

}
