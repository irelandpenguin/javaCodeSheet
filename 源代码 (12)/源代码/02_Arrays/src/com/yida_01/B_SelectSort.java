/*
 * ѡ������
 * 	��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
 */
package com.yida_01;

public class B_SelectSort {

	public static void main(String[] args) {
		int[] arr = { 23, 15, 5, 67, 9 };
		System.out.println("����ǰ��");
		printArray(arr);
		System.out.println("�����");
		selectSort(arr);
		printArray(arr);
	}

	// ѡ������
	public static void selectSort(int[] ary) {
		for (int i = 0; i < ary.length-1; i++) {//���ѭ������ѭ������
			for (int j = i+1; j < ary.length; j++) {//���αȽϣ��ҳ���Сֵ
				if (ary[i] > ary[j]) {
					int tmp = ary[i];//tmp���������ڽ���ary[i]��ary[j]
					ary[i] = ary[j];
					ary[j] = tmp;
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
