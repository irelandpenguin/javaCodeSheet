package com.yida_05;
/**
 * һ�������ӿڵĴ�����ʹ��
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Father f = new Son("����");//��̬������(����ż���)
		f.song();//���뿴��ߣ����п��ұ�
		f.dance();
		
		System.out.println("------------");
		
		f = new Daughter();
		Daughter d = (Daughter)f;//����ת��
		d.setName("��С��");
		d.song();
		d.dance();
		
		f = new Daughter("��Сϼ");
		f.song();//��̬������
		f.dance();
	}

}
