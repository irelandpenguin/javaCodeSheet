package com.yida_02;

/**
 * һ��������ѧ����
 * 
 * @author Administrator
 * 
 */
public class Student {
	// ��Ա����
	private String name;
	private int age;
	private char sex;

	// �޲ι���
	public Student() {

	}

	// ���ι���
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	// get��set����
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public char getSex() {
		return sex;
	}

	// ��Ա����
	public void show() {
		System.out.println(name + "---" + age + "----" + sex);
	}

	public static void main(String[] args) {
		// ʹ���޲ι��죬�����Ķ���
		Student s = new Student();
		s.setName("��С��");
		s.setAge(32);
		s.setSex('��');
		System.out.println(s.getName() + "---" + s.getAge() + "---"
				+ s.getSex());

		System.out.println("----------------");

		// ʹ�ô��ι��죬��������
		Student s2 = new Student("�˳�", 41, '��');
		s2.show();
	}

}
