/*
 * ������1��
 * String s = new String(��hello��)��String s = ��hello��;��������?
 * 	���У�ǰ�߻ᴴ��2�����󣬺��ߴ���1������
 * 
 * ������2��==��equals��������
 * 	��	==���Ƚϻ������ͣ��Ƚϵ���ֵ�Ƿ���ͬ; ����Ƚ��������ͣ���Ƚϵ��Ƕ����ֵַ�Ƿ���ͬ;
 * 		equals����Ҫ���ڱȽ��������ͣ�Ĭ�ϱȽϵ�Ҳ�ǵ�ֵַ�Ƿ���ͬ����String����д��equals()���������ԣ��Ƚϵ��������Ƿ���ͬ��
 */
package com.yida_03.mianshi;

public class A_Demo {

	public static void main(String[] args) {
		String s1 = new String("hello");//����ᴴ��2������
		String s2 = "hello";//����ᴴ��һ������
		
		// ==���Ƚ��������ͣ��Ƚϵ��ǵ�ֵַ�Ƿ���ͬ
		System.out.println(s1 == s2);//false

		//equals���Ƚ��������ͣ�Ĭ��Ҳ�ǱȽϵ�ֵַ�Ƿ���ͬ����String����д��equals()���������ԱȽϵ��������Ƿ���ͬ
		System.out.println(s1.equals(s2));//true
	}
}
