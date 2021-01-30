/**
 * Object:�� Object�����νṹ�ĸ��ࡣÿ���඼ʹ�� Object��Ϊ���ࡣ
 * ÿ���඼ֱ�ӻ��߼�ӵļ̳���Object�ࡣ
 * 
 * Object��ķ�����
 * 		public int hashCode():���ظö���Ĺ�ϣ��ֵ��
 * 			ע�⣺��ϣֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�йأ�������ʵ�ʵ�ֵַ��
 * 			           ���ǿ������Ϊ�����ֵַ��
 * 
 *		public final Class getClass():���ش� Object������ʱ��, �����������ֽ������
 *			Class��ķ�����
 *				public String getName()����String����ʽ���ش�Class��������ʾ��ʵ�������ơ�
 */
package com.yida_01.Object;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());//��ӡ����������ַ
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());//��ӡ����������ַ
		
		Student s3 = s1;//��s1�������ַ(����hash��ֵ)��ֵ��s3
		System.out.println(s3.hashCode());
		
		System.out.println("----------");
		
		Student s = new Student();
		@SuppressWarnings("rawtypes")//����ϵͳ����
		Class c = s.getClass();//��ȡ�ֽ������
		String name = c.getName();//��ȡ�ֽ�������ʵ��������
		System.out.println(name);
		
		// ��ʽ���
		String name2 = s.getClass().getName();
		System.out.println(name2);
		
	}

}
