/*
 * ==:
 * 		�������ͣ��Ƚϵľ���ֵ�Ƿ���ͬ
 * 		��������(���飬�࣬�ӿ�)���Ƚϵľ��ǵ�ֵַ�Ƿ���ͬ
 * 
 * public boolean equals(Object obj):ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 * ���������Ĭ������±Ƚϵ��ǵ�ֵַ��
 *  Դ���룺
 * 		public boolean equals(Object obj) {
 *       	return (this == obj);
 *   	}
 *   
 * �Ƚϵ�ֵַһ����˵���岻����������Ҫ��д�÷�����
 * ��ô��д��?
 * 		һ�㶼�������Ƚ϶���ĳ�Ա����ֵ�Ƿ���ͬ��
 *
 * ���հ棺
 * 		��ʵ�����Զ����ɡ�
 * 
 */
package com.yida_03.equals;


public class StudentTest {

	public static void main(String[] args) {
		int a = 2, b = 2;
		System.out.println(a == b);//true == �������ͱȽϵ���ֵ

		Student s1 = new Student("����", 22);
		Student s2 = new Student("����", 30);
		System.out.println(s1 == s2);//false == �������ͱȽϵ��ǵ�ַ
		
		Student s3 = s1;
		System.out.println(s3 == s1);//true == �������ͱȽϵ��ǵ�ַ
		
		System.out.println("----------");

		System.out.println(s1.equals(s2));//false 	equals() �������ͱȽϵ��ǵ�ַ
		System.out.println(s1.equals(s3));//true	 equals() �������ͱȽϵ��ǵ�ַ
		
		System.out.println("----------");
		
		//��дequals�����󣬲���
		Student s4 = s2;
		System.out.println(s1.equals(s2));//false
		System.out.println(s2.equals(s4));//true

	}

}
