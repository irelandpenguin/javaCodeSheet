package com.yida_03;
/**
 * һ�������̳���Ĵ�����ʹ��
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		Employee em = new Employee();//�޲ι���
		em.setName("����");
		em.setAge(60);
		em.setNumber(2000);
		System.out.println(em.getName()+"---"+em.getAge()+"---"+em.getNumber());

		Employee em2 = new Employee("�⾩",35,3000);//���ι���
		em2.show();
	}

}
