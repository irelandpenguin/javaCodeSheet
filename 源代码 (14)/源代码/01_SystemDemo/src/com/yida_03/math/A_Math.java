/*
 * Math:������ѧ������ࡣ
 * ��Ա������
 * 		public static final double PI
 * 		public static final double E
 * ��Ա������
 * 		public static int abs(int a) ����ֵ
 *		public static double ceil(double a) ����ȡ��
 *		public static double floor(double a) ����ȡ��
 *		public static int max(int a,int b) ���ֵ
 *		public static double min(int a, int b) ��Сֵ
 *		public static double pow(double a,double b) a��b����
 *		public static double random() ����� [0.0,1.0)
 *		public static int round(float a) ��������
 *		public static long round(double a)��������
 *		public static double sqrt(double a) ��ƽ����
 */
package com.yida_03.math;

public class A_Math {

	public static void main(String[] args) {
		// public static final double PI
		System.out.println("PI:" + Math.PI);
		// public static final double E
		System.out.println("E��" + Math.E);
		System.out.println("------");
		
		
		// public static int abs(int a) ����ֵ
		System.out.println("abs:" + Math.abs(10));
		System.out.println("abs:" + Math.abs(-10));
		System.out.println("------");
		
		// public static double ceil(double a) ����ȡ��
		System.out.println("ceil:" + Math.ceil(12.34));
		System.out.println("ceil:" + Math.ceil(12.56));
		System.out.println("------");
		
		// public static double floor(double a) ����ȡ��
		System.out.println("ceil:" + Math.floor(12.34));
		System.out.println("ceil:" + Math.floor(12.56));
		System.out.println("------");
		
		// public static int max(int a,int b) ���ֵ
		System.out.println("max:" + Math.max(100, 20));
		System.out.println("min:" + Math.min(100, 20));
		// ������Ҫ��ȡ���������е����ֵ
		// ������Ƕ�׵���
		System.out.println("11,20,3�����ֵΪ" + Math.max(11,Math.max(20, 3)));
		System.out.println("------");
		
		// public static double pow(double a,double b) a��b����(ʵ���Ͼ���a��b��)
		System.out.println("pow:" + Math.pow(2, 3));// 2��3����
		System.out.println("------");
		
		// public static double random():����� [0.0,1.0)
		System.out.println("random:" + Math.random());
		// ��ȡһ��1-100֮��������
		System.out.println("1-100֮����������" + (int) (Math.random() * 100 + 1));
		System.out.println("------");
		
		// public static int round(float a) ��������
		System.out.println("round:" + Math.round(3.54f));//����Ϊfloat����������Ϊint
		System.out.println("rint:" + Math.rint(3.46));//����Ϊdouble����������Ϊdouble
		System.out.println("------");
		
		// public static double sqrt(double a) ��ƽ����
		System.out.println("4��ƽ����Ϊ" + Math.sqrt(4));//2.0
		System.out.println("16��ƽ����Ϊ" + Math.sqrt(16));//4.0
	}

}
