package com.yida_08.test;

public class TestString {
	/*
	 * ���󣺰������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ��� 
	 * ������int[] ary = {1,2,3,4,5};
	 * �������� "[1, 2, 3, 4, 5]"
	 */
	public void test1() {
		int[] ary = {1,2,3,4,5};
		System.out.print("[");
		for (int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {
				System.out.print(ary[i] + "]" + "\n");
			} else {
				System.out.print(ary[i] + ", ");
			}
		}
	}
	
	/*
	 * �ַ�����ת
	 * ����������¼�롱i love java,do you love it ?��		
	 * ����������? it love you do,java love i��
	 */
	public void test2() {
		String s = "i love java,do you love it ?";
		String str = "";
		String[] sAry = s.split(",");
		for (int i = sAry.length-1; i >= 0; i--) {
			String[] ary = sAry[i].split(" ");
			for (int k = ary.length-1; k >= 0; k--) {
				if (k == 0) {
					str += ary[k];
				} else {
					str += ary[k] + " ";
				}
			}
			
			if (i > 0) {
				str += ",";
			}
		}
		
		System.out.println(str);
	}
	
	/*
	 * ͳ�ƴ���С�����ֵĴ���
	 * ������
	 * 		���ַ���"hello, yidahulian��welcom to yida, stuty java go to yida��ha ha ha��"
	 * �����
	 * 		yida������3��
	 * 
	 * 	indexOf("yida");
	 * 	indexOf("yida",fromIndex);
	 */
	public void test3() {
		String s = "hello, yidahulian��welcom to yida, stuty java go to yida��ha ha ha��";
		String s2 = "yida";
		int count = 0;
		
		int index = s.indexOf(s2);
		while (index != -1) {//����-1��ʾ�Ҳ����ˣ�Ҫ�˳�whileѭ��
			count++;
			System.out.println(s2 + "������λ��Ϊ" + index);
			index = s.indexOf(s2, index + s2.length());
		}
		
		System.out.println(s2 + "������" + count + "��");
	}
}
