/*
	�� class
		���壺����һ������ľ�����Ϣ��
		��2�������
			<1>.��Ա����
			<2>.��Ա����
					ʵ������ ����static���εģ��ɶ�����ã����ڶ���ķ���
					��̬���� ʹ��static���εģ����������ã������౾��
	
	���ʹ��
		��δ���������?
			��ʽ������ ������ = new ����();
			������Student stu = new Student();
		
		���ʹ�ó�Ա������?
			������.������
			
		���ʹ�ó�Ա������?
			������.������(...)
			
	������һ��java�ļ���д�����࣬һ��ѧ���࣬һ�������ࡣ����ϰ�������
	ע�⣺�ļ����ƺͲ���������һ�¡�������ʹ�ÿ���̨����ʱ����javac StudentDemo.java��
	���Զ�����StudentDemo.class��Student.class�����ֽ����ļ�����jvmʹ�á�
	
*/
class Student {
	String name;//������Ĭ��ֵΪnull
	int age;//���䣬Ĭ��ֵΪ0
	char sex;//�Ա�Ĭ��ֵΪ'\u0000'
	String address;//��ַ��Ĭ��ֵΪnull
	
	//ʵ������
	public void hello() {//�÷����Ĺ��ܣ�����к�
		System.out.println("��ã�����һ��ѧ��");
	}
	
	public void show() {//�÷����Ĺ��ܣ���ӡѧ����Ϣ
		System.out.println("����:"+name+", ����:"+age+", �Ա�:"+sex+", ��ַ:"+address);
	}
	
	//��̬����(���� �෽��)
	public static void hi() {
		System.out.println("��ң�����ã���");
	}
}

class StudentDemo {
	public static void main(String[] args) {
		Student stu = new Student();
		 
		stu.hello();//����к�
		stu.show();//��ʾѧ����Ϣ
		
		System.out.println("-----------");
		
		//����ѧ����Ϣ
		stu.name = "�˴ﻥ��";
		stu.age = 5;
		stu.sex = 'M';
		stu.address = "���ﳵ�����ʹڿƼ�԰2��3¥";
		
		stu.show();//��ʾѧ����Ϣ
		
		//�ٴ���һ������
		Student stu2 = new Student();
		stu2.name = "����";
		stu2.age = 60;
		stu2.sex = 'M';
		stu2.address = "���";
		stu2.show();//����ʵ������
		
		//���þ�̬����
		Student.hi();
		stu.hi();
		stu2.hi();
		//���ǵľ�̬����(�෽��)���������������ã�Ҳ�����ɶ�����ã����Ƚ��Ѻã�
		
		//Student.show();//ʵ������ֻ����ʵ��������ã��������������ã���
	}
}