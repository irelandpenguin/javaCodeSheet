/*
 * ��ϰ��2����һ������{21, 45, 2, 30, 100, 60}���ҳ�����45��100��Ӧ�������Ҳ�����ӡ-1��
 * 
 * ������
 * 		���ȸ����鲻��˳�����飬�����϶��ֲ���������
 * 		���ԣ������ö��ֲ��ҷ��� ֻ��ʹ��˳����ҡ�
 * 
 * �ɻ�
 * 		�е�ѧԱ˵����ʦ�ҿ����ȶ���������Ȼ���ٽ��ж��ֲ��ҡ���������
 * ���
 * 		�����ԣ���������������ԭ�����𣿣� �ҳ�������������
 */
package com.yida_02;

public class C_Test {

	public static void main(String[] args) {
		// ��ȷ����
		int[] arr = { 21, 45, 2, 30, 100, 60 };
		int[] ints = { 45, 100 };
		for (int i = 0; i < ints.length; i++) {
			int value = ints[i];
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] == value) {
					System.out.println(value + "��ԭ�����е�����Ϊ" + k);
				}
			}
		}

		System.out.println("------");

		// ��������
		/*bubbleSort(arr);//{ 2,21, 30, 45, 60, 100 };
		for (int i = 0; i < ints.length; i++) {
			int value = ints[i];
			int index = binSearch(arr, value);
			System.out.println(value + "��ԭ�����е�����Ϊ" + index);
		}*/
	}

	// ð������
	public static void bubbleSort(int[] ary) {
		for (int i = 1; i < ary.length; i++) {
			for (int j = 0; j < ary.length - i; j++) {
				if (ary[j] > ary[j + 1]) {
					int tmp = ary[j];
					ary[j] = ary[j + 1];
					ary[j + 1] = tmp;
				}
			}
		}
	}

	// ���ֲ���
	public static int binSearch(int[] ary, int value) {
		int min = 0, max = ary.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (ary[mid] == value) {
				return mid;
			} else if (ary[mid] > value) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}

}
