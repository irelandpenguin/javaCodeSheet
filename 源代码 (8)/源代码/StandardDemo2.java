/*
	�����ɣ���Ա��������Ա����
		���������ּ�����һ���µĳ�Ա�����췽����
		�Ժ����������ɣ�
			��Ա����
			���췽��
			��Ա����
		
		
	һ����׼������հ档
	
	ѧ���ࣺ
		��Ա������
			name��age��sex
		���췽����
			�޲ι��죬�����������Ĺ���
		��Ա������
			getXxx()/setXxx()
			show()�������������г�Ա����ֵ
			
	����Ա������ֵ��
		A:setXxx()����
		B:���췽��
		
	�����Ա����ֵ�ķ�ʽ��
		A:ͨ��getXxx()�ֱ��ȡȻ��ƴ��
		B:ͨ������show()�����㶨
*/
class Student {
	private String name;
	private int age;
	private char sex;
	
	//�����ǹ��췽��
	public Student() {
		
	}
	
	public Student(String name, int age, char sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//������setXxx��getXxx����
	//��������
	public void setName(String name) {
		this.name = name;
	}
	
	//��ȡ����
	public String getName() {
		return name;
	}
	
	//��������
	public void setAge(int age) {
		this.age = age;
	}
	
	//��ȡ����
	public int getAge() {
		return age;
	}
	
	//�����Ա�
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	//��ȡ�Ա�
	public char getSex() {
		return sex;
	}
	
	//��ʾѧ����ϸ��Ϣ
	public void show() {
		System.out.println("����:"+name+",����:"+age+",�Ա�:"+sex);
	}
}


class StandardDemo2 {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("�˴ﻥ��");
		stu.setAge(5);
		stu.setSex('��');
		System.out.println("����:"+stu.getName()+",����:"+stu.getAge()+",�Ա�:"+stu.getSex());
		
		Student stu2 = new Student("��Сƽ",28,'Ů');
		stu2.show();
	}
}