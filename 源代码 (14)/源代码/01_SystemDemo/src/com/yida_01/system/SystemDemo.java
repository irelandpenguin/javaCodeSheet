/*
 * System�����һЩ���õ����ֶκ;�̬�����������ܱ�ʵ������ 
 * 
 * ������
 *		//���������������� 
 * 		public static void gc()
 * 
 * 		//��ֹ��ǰ�������е� Java �������
 *		//��������״̬��; ���ݹ������� 0 ��״̬���ʾ�쳣��ֹ�����ԣ�һ�㶼��0����ʾ�����˳�����
 *		public static void exit(int status)
 *
 *		//�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
 *		public static long currentTimeMillis()
 *		
 *		//��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
 *		public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
 */
package com.yida_01.system;

import java.util.Arrays;

public class SystemDemo {
	public static void main(String[] args) {
		//test1();//����������������
		//test2();//�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
		//test3();//��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
	}
	
	//���������������� 
	//public static void gc()
	public static void test1() {
		Student stu = new Student("����", 28);
		System.out.println(stu);

		System.exit(0);//�����˳�

		stu.setName("����");
		stu.setAge(25);
		System.out.println(stu);

		stu = null;
		System.gc();// ��������������
	}
	
	//�����Ժ���Ϊ��λ�ĵ�ǰʱ�䡣
	//public static long currentTimeMillis()
	public static void test2() {
		// �����õ�������ʵ��Ŀǰ��������˵���岻��
		// ��ô����������ʲô������?
		// Ҫ�����Ҹ���ͳ����γ��������ʱ��
		long beginTimer = System.currentTimeMillis();
		for (int i = 1; i <= 10000; i++) {
			System.out.println("java" + i);
		}
		long endTimer = System.currentTimeMillis();
		System.out.println("����ʱ��" + (endTimer - beginTimer)+"����");
	}
	
	//��ָ��Դ�����и���һ�����飬���ƴ�ָ����λ�ÿ�ʼ����Ŀ�������ָ��λ�ý�����
	//����1��Դʼ����
	//����2��Դʼ���鸴�Ƶ���ʼ����
	//����3��Ŀ������
	//����4��Ŀ�������ָ������(����������Ҫ���Ƶ�Ŀ��������ĸ�λ��)
	//����5��Դʼ����Ҫ���Ƶĳ���
	//public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
	public static void test3() {
		// ��������
		int[] arr1 = { 11, 22, 33, 44, 55 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		// ���ҿ�����������˼
		System.arraycopy(arr1, 1, arr2, 2, 3);
		//System.arraycopy(arr1, 0, arr2, 1, 2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		/*
		 * System.arraycopy(arr1, 1, arr2, 2, 3);
		 * 
		 * ������ͣ� ��Դ����arr1����1��λ�ÿ�ʼ����3����Ԫ�أ����Ƶ�Ŀ������arr2����Ϊ2��λ�á�
		 * ��ʱ��Ŀ������arr2����Ϊ2��λ�ÿ�ʼ��3������Ԫ�ػᱻarr1���Ƶ�3������Ԫ�ظ��ǣ�
		 */
	}
}
