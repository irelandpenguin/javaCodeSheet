/*
	�ؼ���final��ʾ ���� ����˼��
	
	final���������࣬����������
	
	�ص㣺
		final���������࣬���ܱ��̳С�
		final�������η��������ܱ���д��(����)
		final�������α��������ܱ����¸�ֵ����Ϊ��ʱ�ı�����ʵ�ǳ�����
		
	������
		A:����ֵ����
			"hello",10,true
		B:�Զ��峣��
			final int x = 10;
*/

//final class Person {
class Person {
	/*final*/ public String name = "";
	public int age = 0;
	
	/*final*/ public void show() {
		System.out.println("����:"+name+",����:"+age);
	}
}

class Student extends Person {
	public void show() {
		System.out.println("ѧ������Ϣ["+"����:"+name+",����:"+age+"]");
	}
}

class FinalDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "�˴ﻥ��";
		stu.age = 5;
		stu.show();
	}
}