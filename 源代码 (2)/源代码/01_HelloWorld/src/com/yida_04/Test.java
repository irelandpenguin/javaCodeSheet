package com.yida_04;
/**
 * һ������������Ĵ�����ʹ��
 * @author Administrator
 *
 */
public class Test {
	public static void main(String[] args) {
		Animal an = new Dog("�ڻ�");//��̬������
		an.eat();//���뿴��ߣ����п��ұ�
		an.sleep();
		
		an = new Dog();
		an.setName("�ڱ�");
		an.eat();
		an.sleep();
		
		System.out.println("-------------");
		
		an = new Cat("����");//��̬������
		an.eat();//���뿴��ߣ����п��ұ�
		an.sleep();
		
		an = new Cat();
		an.setName("����");
		an.eat();
		an.sleep();
	}

}
