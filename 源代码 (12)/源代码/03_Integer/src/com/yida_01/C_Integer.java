/*
 * JDK5��������
 * �Զ�װ�䣺�ѻ�������ת��Ϊ��װ������
 * �Զ����䣺�Ѱ�װ������ת��Ϊ��������
 * 
 * ע��һ��С���⣺
 * 		��ʹ��ʱ��Integer x = null;����ͻ����NullPointerException��
 * 		�������ж��Ƿ�Ϊnull��Ȼ����ʹ�á�
 */
package com.yida_01;

public class C_Integer {

	public static void main(String[] args) {
		Integer i = 100;// �Զ�װ�䣬�ײ�ʹ��Integer.valueOf(100);��ת����Integer����
		i += 20;// ���Զ����䣬���Զ�װ�䣬�ײ�ʹ��i = Integer.valueOf(i.intValue() + 20);�������
		System.out.println("i:" + i);

		// ������δ�������ʱ���ˣ�why? ԭ����NullPointerException��ָ���쳣��
		Integer ii = null;
		//ii += 10;
		//System.out.println("ii:" + ii);
		
		// �������
		if (ii != null) {
			ii += 10;
			System.out.println("ii:" + ii);
		}
	}

}
