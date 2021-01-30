package com.yida_08;

/**
 * ������Ҫ����Ϊ�����ṩ��ݵķ���������
 * 
 * @author �˴ﻥ��-Mr Qain
 * @version V1.0
 */
public class ArrayTool {
	// ����һ��˽�й��죬��ǿ����粻�ܴ����޲ι���
	private ArrayTool() {
	}

	/**
	 * ��������Ԫ��
	 * 
	 * @param array ��������
	 */
	public static void show(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.println(j);
		}
	}

	/**
	 * ���������е����Ԫ��ֵ
	 * 
	 * @param array ��������
	 * @return ���������Ԫ��ֵ
	 */
	public static int max(int[] array) {
		int maxValue = array[0];
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (maxValue < j) {
				maxValue = j;
			}
		}
		return maxValue;
	}

	/**
	 * ����ֵ�����Ҷ�Ӧ������
	 * 
	 * @param array ��������
	 * @param value ���ҵ�ֵ
	 * @return ���ز��ҵ��Ķ�Ӧ����������Ҳ���������-1
	 */
	public static int findIndex(int[] array, int value) {
		int index = -1;// ����Ҳ������򷵻�-1
		for (int i = 0; i < array.length; i++) {
			if (value == array[i]) {
				index = i;
				break;
			}
		}
		return index;
	}
}
