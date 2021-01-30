package com.yida_01;

/*
 * �����򣬲�Ҫ�����ա��о�����ͬѧ���Կ�һ����������ʱ���ҡ�
 * 
 * ��������
 * ����˼�룺 ��׼����λ˼�롣 
 * ����
 * ÿ�ζ�ȡ����ĵ�һ��Ԫ����Ϊ��׼�������ȣ����ڱ�̽��Ȼ�׼��С��Ԫ�أ��ҵ�����ֹͣ̽��;
 * Ȼ�����ڱ�̽��Ȼ�׼�����Ԫ�أ��ҵ��ˣ���ֹͣ̽��;
 * �������ڱ�δ����ʱ���򲻶Ͻ��������ڱ�̽�⵽��Ԫ�أ�ֱ�������ڱ�����ʱ����׼��������ʱ���Ǹ�Ԫ�ؽ�����������׼����λ��
 */
public class D_QuickSort {
	private static int[] ary = { 6, 1, 2, 7, 9, 3, 4, 5, 10, 8 };
	
	public static void main(String[] args) {
		System.out.println("����ǰ��");
		printArray(ary);
		System.out.println("�����");
		quickSort(0, ary.length-1);
		printArray(ary);
	}

	// ��ӡ����Ԫ��
	public static void printArray(int[] ary) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length-1) {
				sb.append(ary[i]).append("]");
			} else {
				sb.append(ary[i]).append(", ");
			}
		}
		System.out.println(sb.toString());
	}

	/**
	 * ��������
	 * 
	 * ����˼�룺 ��׼����λ˼�롣 
	 * ����
	 * ÿ�ζ�ȡ����ĵ�һ��Ԫ����Ϊ��׼�������ȣ����ڱ�̽��Ȼ�׼��С��Ԫ�أ��ҵ�����ֹͣ̽��;
	 * Ȼ�����ڱ�̽��Ȼ�׼�����Ԫ�أ��ҵ��ˣ���ֹͣ̽��;
	 * �������ڱ�δ����ʱ���򲻶Ͻ��������ڱ�̽�⵽��Ԫ�أ�ֱ�������ڱ�����ʱ����׼��������ʱ���Ǹ�Ԫ�ؽ�����������׼����λ��
	 * 
	 * ����1�����ڱ�������̽��Ȼ�׼������� 
	 * ����2�����ڱ�������̽��Ȼ�׼��С��������ÿһ�ζ����������ڱ���̽�⣡
	 */
	public static void quickSort(int left, int right) {
		if (left > right) {
			return;
		}

		int tmp = ary[left];// ��׼��
		int i = left;// ���ڱ�
		int j = right;// ���ڱ�
		int t;// ���ڽ�������ʱ����

		while (i != j) {
			// ���ȣ����ڱ���̽�⣬�ҳ��Ȼ�׼��С��Ԫ��
			while (ary[j] >= tmp && i < j) {
				j--;
			}

			// Ȼ�����ڱ�̽�⣬�ҳ��Ȼ�׼�����Ԫ��
			while (ary[i] <= tmp && i < j) {
				i++;
			}

			if (i < j) {// �������ڱ�δ����ʱ���򲻶Ͻ��������ڱ�̽�⵽��Ԫ��
				t = ary[i];
				ary[i] = ary[j];
				ary[j] = t;
			}
		}

		// i == j ��ʾ�����ڱ���������ʱ��׼��������ʱ��Ԫ�ؽ���
		ary[left] = ary[i];
		ary[i] = tmp;

		quickSort(left, i-1);// ����������ߵģ�������һ���ݹ�Ĺ���
		quickSort(i+1, right);// ���������ұߵģ�����Ҳ��һ���ݹ�Ĺ���
	}
}
