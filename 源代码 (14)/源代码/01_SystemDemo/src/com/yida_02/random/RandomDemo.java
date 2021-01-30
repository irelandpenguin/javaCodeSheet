/*
 * Random:�������������
 * 
 * ���췽����
 * 		public Random():û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰϵͳʱ��ĺ���ֵ
 *		public Random(long seed):����ָ��������
 *
 *		�������Ӻ�ÿ�εõ������������ͬ�ġ�
 *
 * ��Ա������
 * 		public int nextInt()�����ص���int��Χ�ڵ������
 *		public int nextInt(int n):���ص���[0,n)��Χ���������
 *		public double nextDouble():���ص���[0.0,1.0)��Χ�������������
 *
 * �ܶ�Ӧ�ó���ᷢ�� Math.random() ����������ʹ�á�
 */
package com.yida_02.random;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();// û�и����ӣ��õ���Ĭ�����ӣ��ǵ�ǰϵͳʱ��ĺ���ֵ
		//Random r = new Random(1000);// ����ָ��������,�����ֵ���������ġ�

		for (int i = 0; i < 10; i++) {
			//System.out.println(r.nextInt());// ���ص���int��Χ�ڵ������
			System.out.println(r.nextInt(100));// ���ص���[0,n)��Χ���������
			//System.out.println(r.nextDouble());//���ص���[0.0,1.0)��Χ�������������
		}

		
		System.out.println("----------");

		// ��ǰѧϰ�ģ����︴ϰ��
		for (int i = 0; i < 10; i++) {
			int randomNum = (int) (Math.random() * 100 + 1);// 1~100֮��(����1��100)
			System.out.println(randomNum);
		}
	}
}
