package com.yida_01;

import com.yida_08.ArrayTool;
import com.yida_09.Son;

public class Test {

	public static void main(String[] args) {
		//ʹ��jar�����ArrayTool����ķ���
		int[] ary = {12, 23, 2, 45, 3, 56, 345, 678, 10};
		ArrayTool.show(ary);//��������
		
		int max = ArrayTool.max(ary);//�����ֵ����
		System.out.println("���ֵΪ��"+max);
		
		int idx = ArrayTool.findIndex(ary, 56);
		System.out.println("����ֵΪ��"+idx);
		
		//ʹ��jar�����Son����ķ���
		Son son = new Son("������");
		son.study();
		son.play();
		son.song();
		son.dance();
		
	}

}
