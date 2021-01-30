/*
 * public String toString():���ظö�����ַ�����ʾ��
 * 
 * Դ����
 * public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
 * 
 * Integer���µ�һ����̬������
 * 		public static String toHexString(int i)����һ������ת��һ��ʮ�����Ʊ�ʾ���ַ���
 * 
 * �����Ϣ��������ǽ�������ˣ����������Ϣ��û���κ�����ġ����ԣ������������඼��д�÷�����
 * ��ô�ֹ���д��?
 * 		�Ѹ�������г�Ա����ֵ��ɷ��ؼ��ɡ�
 * 
 * ��д�����հ淽�������Զ�����toString()������
 * 
 * ע�⣺
 * 	 ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()������
 */
package com.yida_02.toString;


public class StudentTest {

	public static void main(String[] args) {
		Student s = new Student("����", 28);
		System.out.println(s.hashCode());//��ӡs�������ڴ��е������ַ
		System.out.println(s.getClass().getName());//��ȡ�ֽ�������ʵ��������
		
		System.out.println("----------");
		
		System.out.println(s.toString());
		
		//toString()������ֵ�ȼ���getClass().getName() + "@" + Integer.toHexString(hashCode());
		System.out.println(s.getClass().getName()+"@"+Integer.toHexString(s.hashCode()));
		
		System.out.println("----------");
		
		//Student�����ص�toString()�����󣬲���
		Student s2 = new Student("����", 30);
		System.out.println(s2.toString());//�����Լ���д�ķ�������̬��
		System.out.println(s2);//ֱ�����һ����������ƣ���ʵ���ǵ��øö����toString()������
	}

}
