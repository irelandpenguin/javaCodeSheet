/*
 * ���ң�
 * 		��������:����Ԫ������(��ͷ�ҵ�β)
 * 		���ֲ���(�۰����):����Ԫ�ر�������
 * 
 * ������
 * 		A:���������������С����;
 * 		B:������м�����;
 * 		C:���м�������ֵ��Ҫ���ҵ�ֵ���бȽ�;
 * 			��ȣ��ͷ��ص�ǰ���м�����;
 * 			����ȣ�
 * 				��	�����
 * 					high = mid - 1;
 * 				С	�ұ���
 * 					low = mid + 1;
 * 		D:�ص�B;
 * 		E:����С����low�����������highʱ����������;
 */
package com.yida_02;

public class A_BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 10, 12, 45, 80 };//һά��˳������
		int index = binSearch(arr, 45);
		System.out.println("index:" + index);
		index = binSearch(arr, 10);
		System.out.println("index:" + index);
		index = binSearch(arr, 8);
		System.out.println("index:" + index);
	}

	public static int binSearch(int[] ary, int value) {
		int min = 0, max = ary.length-1;
		while (min <= max) {
			int mid = (min+max)/2;
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
