/*
	д���³����ִ�н����
	
	"����StudentDemo�ľ�̬����飬ֻ��һ��Ӵ"
	c = 8
	"����Student��̬����飬ֻ��һ��Ӵ"
	"�˴�5����"
	"�˴�5����"
	"�˴�5����"
	"�˴ﻥ��6����"
*/

class Student {
	private String name;
	private int age;
	
	//��������
	{
		name = "�˴�";
		age = 5;
		System.out.println(name+age+"����");
	}
	
	//��̬�����
	static {
		System.out.println("����Student��̬����飬ֻ��һ��Ӵ");
	}
	
	public Student() { }//�޲ι���
	public Student(String name, int age) {//���ι���
		this.name = name;
		this.age = age;
	}
	
	public void show() {
		System.out.println(name+age+"����");
	}
}

class StudentDemo {
	//��̬�����
	static {
		System.out.println("����StudentDemo�ľ�̬����飬ֻ��һ��Ӵ");
	}
	
	public static void main(String[] args) {
		//�ֲ������
		{
			int a = 3, b = 5, c;
			c = a+b;
			System.out.println("c="+c);
		}
		
		Student stu1 = new Student();
		stu1.show();
		Student stu2 = new Student("�˴ﻥ��", 6);
		stu2.show();
	}
}

//����StudentDemo�ľ�̬����飬ֻ��һ��Ӵ
//c=8
//����Student��̬����飬ֻ��һ��Ӵ
//�˴�5����
//�˴�5����
//�˴�5����
//�˴ﻥ��6����
