/*
 * ������һ��Ӣ�ģ��ѿո�ǰ��ĵ�������ĸ�ĳɴ�д��
 * ������
 * 		i love yidahulian techo
 * �����
 * 		I Love Yidahulian Techo
 * 
 * 	������
 * 		���ȣ����ַ������ո���룬�õ�һ��String[];
 * 		Ȼ��forѭ�����������е�ÿһ������;
 * 		������������ʹ��substring(0,1);�õ�ÿһ�����ʵ�����ĸ;
 * 		�����ã�toUpperCase();�Ѹյõ��ĵ��ʸĳɴ�д;
 * 		�����ã�substring(1);���԰�ÿ�����ʺ������ĸȫ���õ�;
 * 		�����ã�concat()�����������Ӵ���ƴ������;
 * 		��󣬰�ƴ�Ӻ�ĵ���ȫ����ϳ�һ���ִ�����ӡ��
 */
package com.yida_06.String;

public class B_Test {

	public static void main(String[] args) {
		String s = "i love yidahulian techo";
		String[] ary = s.split(" ");//���ո���
		String newS = new String();
		for (int i = 0; i < ary.length; i++) {
			String str = ary[i];
			String first = str.substring(0, 1);
			first = first.toUpperCase();
			String last = str.substring(1);
			String tmp = first + last;
			newS += tmp + " ";
		}
		System.out.println(newS);

		System.out.println("------");

		test();// �򻯰�
	}
	
	public static void test() {
		// �򻯰�
		String s = "i love yidahulian techo", newS = "";
		String[] ary = s.split(" "); //���ո���
		for (int i = 0; i < ary.length; i++) {
			String first = ary[i].substring(0, 1).toUpperCase();// ��ʽ���
			String last = ary[i].substring(1);
			newS += first + last + " ";
		}
		System.out.println(newS);
	}

}
